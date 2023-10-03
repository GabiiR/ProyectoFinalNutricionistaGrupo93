package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.Entidades.Paciente;

public class Data_Pacientes {

    private Connection con = null;

    public Data_Pacientes() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

    public void agregarPaciente(Paciente paciente) {
        try {
            String sql = "INSERT INTO paciente (nombre, dni, domicilio, telefono)" + "VALUES (?,?,?,?)"; //Plantilla DB.

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Agrega a los valores de la linea 20, lo de la linea 23 en adelante.
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setInt(4, paciente.getTelefono());
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
    };
    
    public void modificarPaciente(Paciente paciente) {
        try {
            String sql = "UPDATE paciente SET nombre = ?, dni = ?, domicilio = ?, telefono = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setInt(4, paciente.getTelefono());
            ps.executeUpdate(); //Ejecuta consulta "UPDATE".

            ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.
            
            if (rs.next()){
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha actualizado la información del paciente.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la información del paciente.");
        }
    };
    
    public void eliminarPaciente(int id) {
        try {
            String sql = "DELETE FROM paciente WHERE idPaciente = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate(); //Ejecuta consulta "DELETE".
            
            ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.
            
            if (rs.next()) { //Comprueba si ya hay un paciente con datos.
                JOptionPane.showMessageDialog(null, "Paciente eliminado con exito.");
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar paciente.");
        }
    };
    
    public void buscarPaciente(int id){
        Paciente paciente = null;
        try {
            String sql = "SELECT nombre, dni, domicilio, telefono\n FROM paciente\n WHERE idPaciente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                paciente = new Paciente();
                paciente.setIdPaciente(id);
                paciente.setNombre(rs.getString("Nombre"));
                paciente.setIdPaciente(rs.getInt("Dni"));
                paciente.setDomicilio(rs.getString("Domicilio"));
                paciente.setTelefono(rs.getInt("Telefono"));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos de su paciente.");
        }
    };
}