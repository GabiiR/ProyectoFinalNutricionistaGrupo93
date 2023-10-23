package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        String sql = "INSERT INTO historial (idPaciente, peso, fecha, estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, org.mariadb.jdbc.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, historial.getPaciente().getIdPaciente());
            ps.setDouble(2, historial.getPesoControl());
            ps.setDate(3, Date.valueOf(historial.getFechaRegistro()));
            ps.setBoolean(5, historial.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                historial.setIdHistorial(rs.getInt(1));
                //mensaje
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(historialdata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarVisita(Visita visita) {
        String sql = "UPDATE visita SET idDieta=?, idPaciente=?, peso=?, fecha=?, estado=? WHERE idVisita=? ";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, visita.getDieta().getIdDieta());
            ps.setInt(2, visita.getPaciente().getIdPaciente());
            ps.setDouble(3, visita.getPeso());
            ps.setDate(4, Date.valueOf(visita.getFecha()));
            ps.setInt(5, visita.getEstado());
            ps.setInt(6, visita.getIdVisita());
            ps.executeUpdate();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarVisita(Visita visita) {
        String sql = "UPDATE visita SET estado=0 WHERE idVisita=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, visita.getIdVisita());
            ps.executeUpdate();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
} 
    
}