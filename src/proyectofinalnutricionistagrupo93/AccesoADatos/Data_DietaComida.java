package proyectofinalnutricionistagrupo93.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.Entidades.Comida;
import proyectofinalnutricionistagrupo93.Entidades.DietaComida;
import proyectofinalnutricionistagrupo93.Entidades.Horario;

public class Data_DietaComida {

    private Connection con = null;

    public Data_DietaComida() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

    public void agregarDietaComida(DietaComida dieta) {
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
                dieta.setIdDietaComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Dieta agregado con exito.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar Dieta." + e);

        }
    }

    public void modificarDietaComida(int idregistro,int idcomida,int porcion, int iddieta) {
        try {
            String sql = "UPDATE dietacomida SET  idComida = ?, porcion=? WHERE idDieta = ? AND idDietaComida = ? AND estado = '1'";

            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idcomida);            
            ps.setInt(2, porcion);
            ps.setInt(3, iddieta);
            ps.setInt(4, idregistro);

            int resultado = ps.executeUpdate(); //Ejecuta consulta "UPDATE".
            if (resultado > 0) {
                
                JOptionPane.showMessageDialog(null, "Se ha actualizado la Dieta. " + resultado );
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la Dieta." + e );
        }
    }

    ;
    
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
    }

    ;
    
    public DietaComida buscarDietaComida(int id) {
        DietaComida dieta = null;
        Comida comida = null;
        try {
            String sql = "SELECT * WHERE idDietaComida = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
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
            JOptionPane.showMessageDialog(null, "No se encontraron datos de la Dieta.");
        }
        return dieta;
    }

    ;
    public ArrayList<DietaComida> listaComidaxdieta(int idDieta) {
        ArrayList<DietaComida> comidasxdieta = new ArrayList<>();
        DietaComida comida = null;

        try {
            String sql = "SELECT dc.idComida, dc.horario, dc.porcion, dc.idDietaComida, c.nombre\n"
                    + "FROM dietacomida AS dc\n"
                    + "INNER JOIN comida AS c ON dc.idComida = c.idComida\n"
                    + "WHERE dc.estado = 1\n"
                    + "AND c.estado = 1\n"
                    + "AND dc.idDieta = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                comida = new DietaComida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setIdDietaComida(rs.getInt("idDietaComida"));
                String horarioString = rs.getString("horario");
                Horario horarioEnum = convertirStringAHorario(horarioString);
                comida.setHorario(horarioEnum);
                comida.setNombreComida(rs.getString("nombre"));
                comida.setPorcion(rs.getInt("porcion"));
                
                comidasxdieta.add(comida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No pudo generarse la lista de comidas... ");
        }
        return (ArrayList<DietaComida>) comidasxdieta;
    }

    private Horario convertirStringAHorario(String horarioString) {
        if (horarioString != null) {
            switch (horarioString.toUpperCase()) {
                case "DESAYUNO":
                    return Horario.DESAYUNO;
                case "ALMUERZO":
                    return Horario.ALMUERZO;
                case "MERIENDA":
                    return Horario.MERIENDA;
                case "CENA":
                    return Horario.CENA;
                case "SNACK":
                    return Horario.SNACK;
                default:
                    // Manejar caso en el que el string no coincide con ningún valor válido
                    throw new IllegalArgumentException("Valor de horario no válido: " + horarioString);
            }
        } else {
            // Manejar el caso en el que el valor es nulo (si es necesario)
            return null; // O puedes asignar un valor predeterminado
        }
    }
}
