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
import proyectofinalnutricionistagrupo93.Entidades.Historial;

public class Data_Historial{

    private Connection con = null;

    public Data_Historial() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }
    
   public void cargarVisita(Historial historial) {
        String sql = "INSERT INTO historial (idPaciente, peso, fecha, estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, org.mariadb.jdbc.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, historial.getIdPaciente());
            ps.setDouble(2, historial.getPesoControl());
            ps.setDate(3, Date.valueOf(historial.getFechaRegistro()));
            ps.setBoolean(4, historial.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                historial.setIdHistorial(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Historial agregado con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Historial no agregado"+ ex);
        }
    }

    public void modificarVisita(Historial historial) {
        String sql = "UPDATE historial SET  idPaciente=?, peso=?, fecha=?, estado=? WHERE idVisita=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, historial.getIdPaciente());
            ps.setDouble(2, historial.getPesoControl());
            ps.setDate(3, Date.valueOf(historial.getFechaRegistro()));
            ps.setBoolean(4, historial.isEstado());
            ps.setInt(5, historial.getIdHistorial());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "historial modificado con exito.");
            
        } catch (SQLException ex) {
            Logger.getLogger(Data_Historial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarVisita(Historial historial) {
        String sql = "UPDATE historial SET estado=0 WHERE idVisita=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, historial.getIdHistorial());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Historial eliminado con exito.");
            
        } catch (SQLException ex) {
            Logger.getLogger(Data_Historial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Historial> buscarHistorialXPacientes(int id){
        String sql= "SELECT * from historial WHERE idPaciente = ?";
        List <Historial> historial = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Historial visita = new Historial();
                visita.setIdHistorial(rs.getInt("idHistorial"));
                visita.setPesoControl(rs.getInt("peso"));
                visita.setFechaRegistro(rs.getDate("fecha").toLocalDate());
                visita.setIdPaciente(rs.getInt("idPaciente"));
                historial.add(visita);

            }
            JOptionPane.showMessageDialog(null, "Historial encontrado.");
            
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos de Historial.");
        }
        return historial;
    }
    
    
} 
