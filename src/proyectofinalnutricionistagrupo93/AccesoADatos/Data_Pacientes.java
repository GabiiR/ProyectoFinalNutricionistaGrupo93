package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.Entidades.Dieta;
import proyectofinalnutricionistagrupo93.Entidades.Paciente;

public class Data_Pacientes {

    private Connection con = null;

    public Data_Pacientes() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

    public void agregarPaciente(Paciente paciente) {
        
        try {
            String sql = "INSERT INTO paciente (nombre, dni, domicilio, telefono,"
                    + " pesoActual, pesoDeseado, estado, fechaFin) "
                    + "VALUES (?,?,?,?,?,?,?,?)"; //Plantilla DB.

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Agrega a los valores de la linea 20, lo de la linea 23 en adelante.
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setInt(4, paciente.getTelefono());
            ps.setDouble(5, paciente.getPesoActual());
            ps.setDouble(6, paciente.getPesoDeseado());
            ps.setBoolean(7, true);
            ps.setDate(8, Date.valueOf(paciente.getFechaFin()));
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
            String sql = "UPDATE paciente SET nombre = ?, domicilio = ?, telefono = ?, "
                    + "pesoActual = ?, pesoDeseado = ?, fechaFin = ? WHERE dni = ? AND estado = 1";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getDomicilio());
            ps.setInt(3, paciente.getTelefono());
            ps.setDouble(4, paciente.getPesoActual());
            ps.setDouble(5, paciente.getPesoDeseado());
            ps.setInt(6, paciente.getDni());
            ps.setDate(7, Date.valueOf(paciente.getFechaFin()));
            int resultado = ps.executeUpdate(); //Ejecuta consulta "UPDATE".
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado la información del paciente.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la información del paciente." + e.getMessage());
        }
    }

    public void eliminarPaciente(int dni) {
        try {
            String sql = "UPDATE paciente SET estado = ? WHERE dni = ? AND estado = 1";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(1, false);
            ps.setInt(2, dni);
            ps.executeUpdate(); //Ejecuta consulta "UPDATE".

            ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.

            if (rs.next()) { //Comprueba si ya hay un paciente con datos.
                JOptionPane.showMessageDialog(null, "Paciente eliminado con exito.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar paciente por DNI" + e.getMessage());
        }
    }

 
    public Paciente buscarPaciente(int dni) {
        Paciente paciente = null;
        try {
            String sql = "SELECT nombre, domicilio, telefono, pesoActual, pesoDeseado, fechaFin FROM paciente WHERE dni = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(dni);
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getInt("telefono"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setFechaFin(rs.getDate("fechaFin").toLocalDate());

                JOptionPane.showMessageDialog(null, "Paciente encontrado.");
            } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Paciente NO encontrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos de su paciente por DNI" + e.getMessage());
        }
        return paciente;
    }


     public Paciente buscarPacienteID(int id) {
        Paciente paciente = null;
        try {
            String sql = "SELECT nombre, dni, domicilio, telefono, pesoActual, pesoDeseado, fechaFin  FROM paciente WHERE idPaciente = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getInt("telefono"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                
                JOptionPane.showMessageDialog(null, "Paciente encontrado.");
            } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Paciente NO encontrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos de su paciente POR ID" + e.getMessage());
        }
        return paciente;
    }

    public ArrayList<Paciente> listarPacientes() {
        List<Paciente> listaPaci = new ArrayList<>();

        String sql = "SELECT d.fechaFinal, p.* FROM dieta AS d "
                + "INNER JOIN paciente AS p ON d.idPaciente = p.idPaciente "
                + "WHERE p.estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();

            try{
                while (rs.next()) {
                Dieta diet=new Dieta();
                diet.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getInt("telefono"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setFechaFin(diet.getFechaFinal());
                listaPaci.add(paciente);
                }
            }catch(NullPointerException nuPex){
                JOptionPane.showMessageDialog(null, "Error al cargar los datos de paciente :dni" + nuPex.getMessage());
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error haciendo la lista de pacientes, con JOIN dieta y paciente" + ex.getMessage());
        }
        return (ArrayList<Paciente>) listaPaci;
    }

    public ArrayList<Paciente> listarPacientesfiltro() {
        List<Paciente> listaPacientexfiltro = new ArrayList<>();

        String sql = "SELECT d.fechaFinal, p.* FROM dieta AS d " // fechaFinal de tabla dieta, paciente.*:todo de paciente
                + "INNER JOIN paciente AS p ON d.idPaciente = p.idPaciente "
                + "WHERE p.estado = 1 AND p.pesoDeseado > p.pesoActual "//busca los pacientes que ya terminaron la dieta
                + "AND d.fechaFinal < CURRENT_DATE ";// compara que la fechaFinal sea menor a la actual fecha
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                listaPacientexfiltro.add(paciente);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error haciendo la lista de pacientes por filtro... " + ex.getMessage());
        }
        return (ArrayList<Paciente>) listaPacientexfiltro;
    }
    public ArrayList<Paciente> listarPacientesRegistrados() {
        List<Paciente> listaPaci = new ArrayList<>();

        String sql = "SELECT * FROM paciente WHERE estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getInt("telefono"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
               
                paciente.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                listaPaci.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error haciendo la lista de pacientes registrados en el sistema!!" + ex.getMessage());
        }
        return (ArrayList<Paciente>) listaPaci;
    }

}
