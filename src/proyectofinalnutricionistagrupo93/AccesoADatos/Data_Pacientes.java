package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.Entidades.Paciente;

public class Data_Pacientes {

    private Connection con = null;

    public Data_Pacientes() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

    public void agregarPaciente(Paciente paciente) {
        try {
            String sql = "INSERT INTO paciente (nombre, dni, domicilio, telefono, pesoActual, pesoDeseado, estado)" + "VALUES (?,?,?,?,?,?,?)"; //Plantilla DB.

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Agrega a los valores de la linea 20, lo de la linea 23 en adelante.
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setInt(4, paciente.getTelefono());
            ps.setDouble(5, paciente.getPesoActual());
            ps.setDouble(6, paciente.getPesoDeseado());
            ps.setBoolean(7, true);
            ps.executeUpdate(); //Ejecuta consulta "INSERT INTO".

            ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.

            if (rs.next()) { //Verifica si todos los datos estan disponibles para crear la columna.
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente agregado con exito.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar paciente.");
        }
    }

    public void modificarPesoPaciente(double peso, int id) {
        try {
            String sql = "UPDATE paciente SET pesoActual = ? WHERE idPaciente = ? AND estado = 1";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, peso);
            ps.setInt(2, id);
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado la información de peso del paciente.");
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la información del paciente.");
        }
    }

    public void modificarPaciente(Paciente paciente) {
        try {
            String sql = "UPDATE paciente SET nombre = ?, domicilio = ?, telefono = ?, pesoActual = ?, pesoDeseado = ? WHERE dni = ? AND estado = 1";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getDomicilio());
            ps.setInt(3, paciente.getTelefono());
            ps.setDouble(4, paciente.getPesoActual());
            ps.setDouble(5, paciente.getPesoDeseado());
            ps.setInt(6, paciente.getDni());

            int resultado = ps.executeUpdate(); //Ejecuta consulta "UPDATE".
            //ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.

            if (resultado > 0) {
                //paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha actualizado la información del paciente.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la información del paciente.");
        }
    }

    public void eliminarPaciente(int dni) {
        try {
            String sql = "UPDATE paciente SET estado = ? WHERE dni = ? AND estado = 1";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.executeUpdate(); //Ejecuta consulta "UPDATE".

            ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.

            if (rs.next()) { //Comprueba si ya hay un paciente con datos.
                JOptionPane.showMessageDialog(null, "Paciente eliminado con exito.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar paciente.");
        }
    }

    ;
    
    public Paciente buscarPaciente(int dni) {
        Paciente paciente = null;
        try {
            String sql = "SELECT nombre, domicilio, telefono, pesoActual, pesoDeseado FROM paciente WHERE dni = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setNombre(rs.getString("Nombre"));
                paciente.setDomicilio(rs.getString("Domicilio"));
                paciente.setTelefono(rs.getInt("Telefono"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));

                JOptionPane.showMessageDialog(null, "Paciente encontrado.");
            } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Paciente NO encontrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos de su paciente.");
        }
        return paciente;
    }

    ;
    
     public Paciente buscarPacienteID(int id) {
        Paciente paciente = null;
        try {
            String sql = "SELECT Dni, Nombre, Apellido, Genero, Edad, Altura, pesoActual, pesoDeseado, Domicilio, Telefono, Mail FROM paciente WHERE idPaciente = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setDni(rs.getInt("Dni"));
                paciente.setNombre(rs.getString("Nombre"));
                paciente.setApellido(rs.getString("Apellido"));
                paciente.setGenero(rs.getString("Genero"));
                paciente.setEdad(rs.getInt("Edad"));
                paciente.setAltura(rs.getFloat("Altura"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setDomicilio(rs.getString("Domicilio"));
                paciente.setTelefono(rs.getInt("Telefono"));
                paciente.setMail(rs.getString("Mail"));

                JOptionPane.showMessageDialog(null, "Paciente encontrado.");
            } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Paciente NO encontrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos de su paciente." + e);
        }
        return paciente;
    }

    public ArrayList<Paciente> listarPacientes() {
        List<Paciente> listaPaci = new ArrayList<>();

        String sql = "SELECT d.fechaFinal, p.*\n"
                + "FROM dieta AS d\n"
                + "INNER JOIN paciente AS p ON d.paciente = p.idPaciente\n"
                + "WHERE p.estado = 1;";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setGenero(rs.getString("genero"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoObjetivo"));
                paciente.setFechaFin(rs.getDate("fechaFinal").toLocalDate());
                listaPaci.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error haciendo la lista de pacientes" + ex);
        }
        return (ArrayList<Paciente>) listaPaci;
    }

    public ArrayList<Paciente> listarPacientesfiltro() {
        List<Paciente> listaPacientexfiltro = new ArrayList<>();

        String sql = "SELECT d.fechaFinal, p.*\n"
                + "FROM dieta AS d\n"
                + "INNER JOIN paciente AS p ON d.paciente = p.idPaciente\n"
                + "WHERE p.estado = 1\n"
                + "      AND p.pesoObjetivo > p.pesoActual\n"
                + "      AND d.fechaFinal < CURDATE();";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoObjetivo"));
                paciente.setFechaFin(rs.getDate("fechaFinal").toLocalDate());
                listaPacientexfiltro.add(paciente);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error haciendo la lista de pacientes" + ex);
        }
        return (ArrayList<Paciente>) listaPacientexfiltro;
    }
}
