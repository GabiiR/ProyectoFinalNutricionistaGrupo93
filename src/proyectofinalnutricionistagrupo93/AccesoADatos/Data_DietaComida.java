package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.Entidades.Comida;
import proyectofinalnutricionistagrupo93.Entidades.DietaComida;
import proyectofinalnutricionistagrupo93.Entidades.Horario;

public class Data_DietaComida{

    private Connection con = null;

    public Data_DietaComida() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }
    
    public void agregarDietaComida(DietaComida dieta){
        try {
            String sql = "INSERT INTO `dietacomida`(`IdComida`, `IdDieta`, `horario`, `porcion`, `estado`)" + "VALUES (?,?,?,?,?)"; //Plantilla DB.

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Agrega a los valores de la linea 20, lo de la linea 23 en adelante.
           
            ps.setInt(1, dieta.getIdComida());
            ps.setInt(2, dieta.getIdDieta());
            ps.setString(3, String.valueOf(dieta.getHorario()));
            ps.setString(4, String.valueOf(dieta.getPorcion()));
            ps.setBoolean(5, dieta.isEstado());
            
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
    public void modificarDietaComida(DietaComida dieta) {
        try {
            String sql = "UPDATE dietacomida SET  idComida = ?, Horario= ?, Porcion=? WHERE IdDieta = ? AND Estado = 1";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dieta.getIdComida());
            ps.setString(2, String.valueOf(dieta.getHorario()));
            ps.setInt(3, dieta.getPorcion());
            ps.setInt(4, dieta.getIdDieta());
                       
            int resultado= ps.executeUpdate(); //Ejecuta consulta "UPDATE".
            if (resultado > 0){
                JOptionPane.showMessageDialog(null, "Se ha actualizado la Dieta.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la Dieta.");
        }
    };
    
    public void eliminarDietaComida(int id) {
        try {
            String sql = "UPDATE dietacomida SET estado = ? WHERE idDietaComida = ? AND estado = 1";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
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
    
    public DietaComida buscarDietaComida(int id){
        DietaComida dieta = null;
        Comida comida =  null;
              try {
            String sql = "SELECT * WHERE idDietaComida = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                dieta = new DietaComida();          
                dieta.setIdComida(rs.getInt("idComida"));
                dieta.setEstado(rs.getBoolean("estado"));
                dieta.setIdDieta(rs.getInt("IdDieta"));
                dieta.setPorcion(rs.getInt("porcion"));
                dieta.setHorario(Horario.valueOf("horario"));
                
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