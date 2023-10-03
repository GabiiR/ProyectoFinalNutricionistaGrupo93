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
        try {
            String sql = "INSERT INTO comida (nombre, detalle, cantCalorias) \n" + "VALUES (?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
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
            String sql = "UPDATE comida \n SET nombre = ?, detalle = ?, cantCalorias = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
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
    
    public void eliminarComida(Comida comida) {
        try {
            String sql = "DELETE FROM comida \n WHERE idComida = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                comida.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se elimino correctamente su comida.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO se pudo eliminar su comida.");
        }
    };
}
