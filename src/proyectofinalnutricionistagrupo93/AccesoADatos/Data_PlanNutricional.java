package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.Entidades.PlanNutricional;

public class Data_PlanNutricional {

    private Connection con = null;

    public Data_PlanNutricional() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }
    public void agregarPlanNutricional(PlanNutricional plan){
        try {
            String sql = "INSERT INTO planNutricional (nombres de columnas)" + "VALUES (?,?,?,?,?,?,?)"; //Plantilla DB.

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Agrega a los valores de la linea 20, lo de la linea 23 en adelante.
            //ps.setString(1, dieta.());
            //ps.setInt(2, dieta.());
            //ps.setBoolean(3, true);
            ps.executeUpdate(); //Ejecuta consulta "INSERT INTO".

            ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.

            if (rs.next()) { //Verifica si todos los datos estan disponibles para crear la columna.
                plan.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Plan Nutricional agregado con exito.");
            }
            ps.close();
            
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar Plan Nutricional.");
       
        }
    }
    public void modificarPlanNutricional(PlanNutricional plan) {
        try {
            String sql = "UPDATE plnaNutricional SET  = ?,  = ?,  = ? WHERE id = ? AND estado = 1";
            
            PreparedStatement ps = con.prepareStatement(sql);
            //ps.setString(1, plan.());
            //ps.setString(2, plan.());
            //ps.setInt(3, plan.());
           
            
            int resultado= ps.executeUpdate(); //Ejecuta consulta "UPDATE".
            if (resultado > 0){
                JOptionPane.showMessageDialog(null, "Se ha actualizado el Plan Nutricional.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el Plan Nutricional.");
        }
    };
    
    public void eliminarPlanNutricional(int id) {
        try {
            String sql = "UPDATE planNutricional SET estado = ? WHERE id = ? AND estado = 1";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.executeUpdate(); //Ejecuta consulta "UPDATE".
            
            ResultSet rs = ps.getGeneratedKeys(); //Almacena datos de la consulta.
            
            if (rs.next()) { //Comprueba si ya hay un paciente con datos.
                JOptionPane.showMessageDialog(null, "Plan Nutricional eliminado con exito.");
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el Plan Nutricional.");
        }
    };
    
    public PlanNutricional buscarPlanNutricional(int id){
        PlanNutricional plan = null;
        try {
            String sql = "SELECT * WHERE id = ? AND estado = 1"; //agregar el from
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                plan = new PlanNutricional();
                //plan.setNombre(rs.getString(""));
                //plan.set(rs.getString(""));
                //plan.set(rs.getInt(""));               
                
                JOptionPane.showMessageDialog(null, "Plan Nutricional encontrado.");
            } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Plan Nutricional NO encontrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos de la Dieta."+ e);
        }
        return plan;
    };
    
}