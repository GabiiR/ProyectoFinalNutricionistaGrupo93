package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.Entidades.Dieta;

public class Data_Dieta{

    private Connection con = null;

    public Data_Dieta() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }
    
    public void agregarDieta(Dieta dieta){
        try {
            String sql = "INSERT INTO dieta (nombres de columnas)" + "VALUES (?,?,?,?,?,?,?)"; //Plantilla DB.

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Agrega a los valores de la linea 20, lo de la linea 23 en adelante.
            //ps.setString(1, dieta.());
            //ps.setInt(2, dieta.());
            //ps.setBoolean(3, true);
            ps.executeUpdate(); //Ejecuta consulta "INSERT INTO".

            ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.

            if (rs.next()) { //Verifica si todos los datos estan disponibles para crear la columna.
                dieta.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Dieta agregado con exito.");
            }
            ps.close();
            
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar Dieta.");
       
        }
    }
    public void modificarDieta(Dieta dieta) {
        try {
            String sql = "UPDATE dieta SET  = ?,  = ?,  = ? WHERE dni = ? AND estado = 1";
            
            PreparedStatement ps = con.prepareStatement(sql);
            //ps.setString(1, dieta.());
            //ps.setString(2, dieta.());
            //ps.setInt(3, dieta.());
           
            
            int resultado= ps.executeUpdate(); //Ejecuta consulta "UPDATE".
            if (resultado > 0){
                JOptionPane.showMessageDialog(null, "Se ha actualizado la Dieta.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la Dieta.");
        }
    };
    
    public void eliminarDieta(int id) {
        try {
            String sql = "UPDATE dieta SET estado = ? WHERE id = ? AND estado = 1";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.executeUpdate(); //Ejecuta consulta "UPDATE".
            
            ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.
            
            if (rs.next()) { //Comprueba si ya hay un paciente con datos.
                JOptionPane.showMessageDialog(null, "Dieta eliminado con exito.");
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar Dieta.");
        }
    };
    
    public Dieta buscarDieta(int id){
        Dieta dieta = null;
        try {
            String sql = "SELECT * WHERE id = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                dieta = new Dieta();
                //dieta.setNombre(rs.getString(""));
                //dieta.set(rs.getString(""));
                //dieta.set(rs.getInt(""));               
                
                JOptionPane.showMessageDialog(null, "Dieta encontrado.");
            } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Dieta NO encontrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos de la Dieta."+ e);
        }
        return dieta;
    };
    
}