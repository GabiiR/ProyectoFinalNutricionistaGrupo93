package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.Entidades.Paciente;
import proyectofinalnutricionistagrupo93.Entidades.PlanNutricional;

public class Data_PlanNutricional {

    private Connection con = null;

    public Data_PlanNutricional() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

    public void agregarPlanNutricional(PlanNutricional plan) {
        try {
            String sql = "INSERT INTO plannutricional (idPlanNutricional, nombre, paciente, fechaInicial, fechaFinal, pesoInicial, pesoObjetivo, estado) VALUES (?,?,?,?,?,?,?,?)"; //Plantilla DB.

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Agrega a los valores de la linea 20, lo de la linea 23 en adelante.
            ps.setInt(1, plan.getIdDieta());
            ps.setString(2, plan.getNombre());
            ps.setInt(3, plan.getPaciente().getIdPaciente());
            ps.setDouble(3, plan.getPesoInicial());
            ps.setDouble(4, plan.getPesoFinal());
            ps.setDate(5, Date.valueOf(plan.getFechaInicial()));
            ps.setDate(6, Date.valueOf(plan.getFechaInicial()));
            ps.setBoolean(7, plan.isEstado());
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
            String sql = "UPDATE plannutricional SET  nombre = ?, paciente = ?, fechaInicial = ?, fechaFinal =?, pesoInicial = ?, pesoObjetivo = ?  WHERE id = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, plan.getNombre());
            ps.setInt(2, plan.getPaciente().getIdPaciente());
            ps.setDate(3, Date.valueOf(plan.getFechaInicial()));
            ps.setDate(4, Date.valueOf(plan.getFechaFinal()));
            ps.setDouble(5, plan.getPesoInicial());
            ps.setDouble(6, plan.getPesoFinal());
            ps.setBoolean(7, plan.isEstado());

            int resultado = ps.executeUpdate(); //Ejecuta consulta "UPDATE".
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado el Plan Nutricional.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el Plan Nutricional.");
        }
    }
    
    public void eliminarPlanNutricional(int id) {
        try {
            String sql = "UPDATE plannutricional SET estado = ? WHERE id = ? AND estado = 1";

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
            JOptionPane.showMessageDialog(null, "Error al eliminar el Plan Nutricional.");
        }
    }
   
    public PlanNutricional buscarPlanNutricional(int id) {
        PlanNutricional plan = null;
        try {
            String sql = "SELECT * WHERE id = ? AND estado = 1"; //agregar el from
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Paciente paciente = new Paciente();  
                paciente.setIdPaciente(id);
                plan.setPaciente(paciente);
                plan.setNombre(rs.getString("nombre"));
                plan.setPesoInicial(rs.getDouble("pesoInicial"));
                plan.setPesoFinal(rs.getDouble("pesoObjetivo"));
                plan.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                plan.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                plan.setIdDieta(rs.getInt("idDieta"));
                plan.setEstado(true);

                JOptionPane.showMessageDialog(null, "Plan Nutricional encontrado.");
            } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Plan Nutricional NO encontrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos de la Dieta." + e);
        }
        return plan;
    }
;

}
