package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    }

    public void modificarComida(Comida comidaActual) {
        String sql = "UPDATE comida SET detalle = ?, cantCalorias = ?, estado = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(2, comidaActual.getDetalle());
            ps.setInt(3, comidaActual.getCantCalorias());
            ps.setBoolean(4, comidaActual.isEstado());

           int resultado =  ps.executeUpdate();

            if (resultado>0) {
                
                JOptionPane.showMessageDialog(null, "Se modifico correctamente su comida.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar su comida."+e);
        }
    }

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
    }

    ;
    
    public Comida buscarComidaID(int id) {
        Comida comidaID = null;
        String sql = "SELECT * FROM comida WHERE idComida=? AND estado = 1";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                comidaID = new Comida();
                comidaID.setIdComida(id);
                comidaID.setNombre(rs.getString("nombre"));
                comidaID.setDetalle(rs.getString("detalle"));
                comidaID.setCantCalorias(rs.getInt("cantCalorias"));
                comidaID.setEstado(rs.getBoolean("estado"));

                JOptionPane.showMessageDialog(null, "Comida encontrada por ID.");
            } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Comida NO encontrado por ID.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "");
        }
        return comidaID;
    }

    ;
    
    public Comida buscarComida(String nombre) {
        Comida comida = null;
        String sql = "SELECT * FROM `comida` WHERE `nombre`=? AND estado = 1";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));

                JOptionPane.showMessageDialog(null, "Comida encontrada por nombre.");
            } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Comida NO encontrado por nombre.");

            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "");
        }
        return comida;
    }
    
   
    public ArrayList<Comida> listaComida() {
        ArrayList<Comida> comidas = new ArrayList<>();
        Comida comida = null;

        try {
            String sql = "SELECT * FROM comida WHERE estado = 1"; 
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));
                comidas.add(comida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No pudo generarse la lista de comidas... " + ex);
        }
        return (ArrayList<Comida>)comidas;
    }
     public ArrayList<Comida> listaComidaXfiltro(int mayor,int menor) {
        ArrayList<Comida> comidas = new ArrayList<>();
        Comida comida = null;
        

        try {
            String sql = "SELECT * FROM comida WHERE estado = 1 AND cantCalorias >= ? AND cantCalorias <= ?"; 
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mayor);
            ps.setInt(2, menor);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));
                comidas.add(comida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No pudo generarse la lista de comidas... " + ex);
        }
        return (ArrayList<Comida>)comidas;
    }
}