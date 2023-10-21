package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.Entidades.Comida;

public class Data_Comidas {

    private Connection con = null;

    public Data_Comidas() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

    public void agregarComida(Comida comida) {
        String sql = "INSERT INTO comida (nombre, detalle, cantCalorias, estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setBoolean(4, comida.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                comida.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agrego correctamente su comida a su dieta.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO se pudo agregar su comida a su dieta.");
        }
    };
    
    public void modificarComida(Comida comida) {
        try {
            String sql = "UPDATE comida SET nombre = ?, detalle = ?, cantCalorias = ?, estado = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setBoolean(4, comida.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                comida.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se modifico correctamente su comida.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO se pudo modificar su comida.");
        }
    };
    
    public void eliminarComida(int idComida) {
        String sql = "UPDATE comida SET estado = ? WHERE idComida = ? AND estado = 1";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
              JOptionPane.showMessageDialog(null, "Se elimino correctamente su comida.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO se pudo eliminar su comida.");
        }
    };
    
    public Comida buscarComidaID(int id){
        Comida comidaID = null;
        String sql = "SELECT * FROM comida WHERE idComida=? AND estado = 1";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                comidaID = new Comida();
                comidaID.setNombre(rs.getString("nombre"));   
                comidaID.setDetalle(rs.getString("detalle"));
                comidaID.setCantCalorias(rs.getInt("cantCalorias"));
                comidaID.setIdComida(id);
                comidaID.setEstado(rs.getBoolean("estado"));
                
                JOptionPane.showMessageDialog(null, "Comida encontrada.");
          } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Comida NO encontrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "");
        }
        return comidaID;
    };
    
    public Comida buscarComida(String nombre){
        Comida comida = null;
        String sql = "SELECT * FROM `comida` WHERE `nombre`=? AND estado = 1";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));   
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));
                
                JOptionPane.showMessageDialog(null, "Comida encontrada.");
          } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Comida NO encontrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "");
        }
        return comida;
    };
}
