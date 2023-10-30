package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.Entidades.Paciente;
import proyectofinalnutricionistagrupo93.Entidades.Dieta;

public class Data_Dieta {

    private Connection con = null;

    public Data_Dieta() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

    public void agregarDieta(Dieta plan) {
        try {
            String sql = "INSERT INTO dieta (nombre, idPaciente, fechaInicial, fechaFinal, pesoInicial, pesoObjetivo, estado) VALUES (?,?,?,?,?,?,?)"; //Plantilla DB.

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Agrega a los valores de la linea 20, lo de la linea 23 en adelante.
            ps.setString(1, plan.getNombre());
            ps.setInt(2, plan.getIdPaciente());
            ps.setDate(3, Date.valueOf(plan.getFechaInicial()));
            ps.setDate(4, Date.valueOf(plan.getFechaFinal()));
            ps.setDouble(5, plan.getPesoInicial());
            ps.setDouble(6, plan.getPesoObjetivo());
            ps.setBoolean(7, plan.isEstado());
            ps.executeUpdate(); //Ejecuta consulta "INSERT INTO".

            ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.

            if (rs.next()) { //Verifica si todos los datos estan disponibles para crear la columna.
                plan.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Plan Nutricional agregado con exito.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar Plan Nutricional." + e.getMessage());

        }
    }

    public void modificarDieta(Dieta plan) {
        try {
            String sql = "UPDATE dieta SET  nombre = ?, idPaciente = ?, fechaInicial = ?, fechaFinal =?, pesoInicial = ?, pesoObjetivo = ?, estado = ?  WHERE idDieta = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, plan.getNombre());
            ps.setInt(2, plan.getIdPaciente());
            ps.setDate(3, Date.valueOf(plan.getFechaInicial()));
            ps.setDate(4, Date.valueOf(plan.getFechaFinal()));
            ps.setDouble(5, plan.getPesoInicial());
            ps.setDouble(6, plan.getPesoObjetivo());
            ps.setBoolean(7, plan.isEstado());
            ps.setInt(8, plan.getIdDieta());

            int resultado = ps.executeUpdate(); //Ejecuta consulta "UPDATE".
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado el Plan Nutricional.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el Plan Nutricional." + e.getMessage());
        }
    }

    public void eliminarDieta(int id) {
        try {
            String sql = "UPDATE dieta SET estado = ? WHERE idDieta = ? AND estado = 1";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            ps.executeUpdate(); //Ejecuta consulta "UPDATE".

            ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.

            if (rs.next()) { //Comprueba si ya hay un paciente con datos.
                JOptionPane.showMessageDialog(null, "Plan Nutricional eliminado con exito.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el Plan Nutricional." + e.getMessage());
        }
    }

    public Dieta buscarDieta(int id) {
        try {
            String sql = "SELECT * FROM dieta WHERE idDieta = ? AND estado = 1"; //agregar el from
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Dieta plan = new Dieta();
                Paciente paciente = new Paciente();
                plan.setNombre(rs.getString("nombre"));
                plan.setIdPaciente(rs.getInt("idPaciente"));
                //plan.setPaciente(paciente);
                plan.setIdDieta(id);
                plan.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                plan.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                plan.setPesoInicial(rs.getDouble("pesoInicial"));
                plan.setPesoObjetivo(rs.getDouble("pesoObjetivo"));
                plan.setEstado(true);

                JOptionPane.showMessageDialog(null, "Plan Nutricional encontrado.");
                return plan;
            } else {
                JOptionPane.showMessageDialog(null, "Plan Nutricional No encontrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos del Plan dietas por ID" + e.getMessage());
        }
        return null;
    }

    public Dieta buscarDietaxPaciente(int id) {
        //Dieta plan = null;
        try {
            String sql = "SELECT * FROM dieta WHERE idPaciente= ? AND estado = 1"; //agregar el from
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Paciente paciente = new Paciente();
                Dieta plan = new Dieta();
                plan.setIdDieta(rs.getInt("IdDieta"));
                plan.setNombre(rs.getString("nombre"));
                //paciente.setIdPaciente(id);
                plan.setIdPaciente(rs.getInt("idPaciente"));
                plan.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                plan.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                plan.setPesoInicial(rs.getDouble("pesoInicial"));
                plan.setPesoObjetivo(rs.getDouble("pesoObjetivo"));
                plan.setEstado(true);

                JOptionPane.showMessageDialog(null, "Plan Nutricional encontrado.");
                return plan;
            } else {
                JOptionPane.showMessageDialog(null, "Plan Nutricional No encontrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos del Plan de dietas por paciente... " + e.getMessage());
        }

        return null;
    }

    //revisaar el orden segun las columnas de la tabla
    public ArrayList<Dieta> listaDietasActivas() {
        List<Dieta> lista = new ArrayList<>();
        Data_Pacientes pdata = new Data_Pacientes();
        String sql = "SELECT * FROM dieta WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                //Paciente paciente = new Paciente();
                dieta.setIdDieta(rs.getInt(1));
                dieta.setNombre(rs.getString(2));
                //paciente = pdata.buscarPacienteID(rs.getInt(3));
                dieta.setIdPaciente(rs.getInt(3));
                dieta.setFechaInicial(rs.getDate(4).toLocalDate());
                dieta.setFechaFinal(rs.getDate(5).toLocalDate());
                dieta.setPesoInicial(rs.getDouble(6));
                dieta.setPesoObjetivo(rs.getDouble(7));
                dieta.setEstado(rs.getBoolean(8));
                lista.add(dieta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos del Plan de dietas... " + ex.getMessage());
        }
        return (ArrayList<Dieta>) lista;
    }
    //revisaar el orden segun las columnas de la tabla

    public List<Dieta> listaDietaActivaPACIENTE(int id) {
        List<Dieta> lista = new ArrayList<>();
        Data_Pacientes pdata = new Data_Pacientes();
        String sql = "SELECT * FROM dieta WHERE dieta.estado = 1 AND dieta.idpaciente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                //Paciente paciente = new Paciente();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                //paciente = pdata.buscarPacienteID(id);
                //dieta.setPaciente(paciente);
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setPesoObjetivo(rs.getDouble("pesoObjetivo"));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());

                dieta.setEstado(rs.getBoolean("estado"));
                lista.add(dieta);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se creo la lista dieta activa por paciente... " + ex.getMessage());
        }
        return lista;
    }

    public Dieta buscarDietaxNombre(String nombre) {
        try {
            String sql = "SELECT * FROM dieta WHERE nombre = ? AND estado = 1"; //agregar el from
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Dieta Diet = new Dieta();
                //Paciente paciente = new Paciente();
                Diet.setIdDieta(rs.getInt("idDieta"));
                Diet.setNombre(nombre);
                Diet.setIdPaciente(rs.getInt("idPaciente"));
                //plan.setPaciente(paciente);

                Diet.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                Diet.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());

                Diet.setPesoInicial(rs.getDouble("pesoInicial"));
                Diet.setPesoObjetivo(rs.getDouble("pesoObjetivo"));
                //plan.setEstado(true);

                JOptionPane.showMessageDialog(null, "Dieta encontrada con Exito!!");
                return Diet;
            } else {
                JOptionPane.showMessageDialog(null, "Dieta No encontrada.");
            }
            ps.close();
            return null;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de la base de datos de la Dieta por nombre: " + e.getMessage());
        }
        return null;
    }

    public void agregarDietaNueva(String nombre, Integer idPaciente) {
        try {
            String sql = "INSERT INTO dieta (nombre, idPaciente, estado) VALUES (?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setString(1, nombre);
            ps.setInt(2, idPaciente);

            ps.setBoolean(3, true);
            ps.executeUpdate(); //Ejecuta consulta "INSERT INTO".

            ResultSet rs = ps.getGeneratedKeys();
             //ps.setInt(1, rs.getInt("idDieta"));
            JOptionPane.showMessageDialog(null, " se ha generado un nuevo idDieta: ");
            Dieta Diet = new Dieta();
                Diet.setIdDieta(rs.getInt(1));
                Diet.setNombre(nombre);
                Diet.setIdPaciente(idPaciente);
                //Diet.setPesoInicial(null);
                //Diet.setPesoObjetivo(null);
                Diet.setFechaInicial(null);
                Diet.setFechaFinal(null);
                
                

            if (rs.next()) {
                //Dieta Diet = new Dieta();
                //Diet.setIdDieta(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Dieta Nueva agregada con exito!!!");
                }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar Dieta Nueva!" + e.getMessage());

        }
    }
}
