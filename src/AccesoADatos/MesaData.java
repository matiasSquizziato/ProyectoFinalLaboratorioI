
package AccesoADatos;

import Entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author matiSqui
 */
public class MesaData {
    
    private Connection con = null;
    
    public MesaData(){
        con = ConexionData.getConexion();
    }
    
    public void cargarMesa(Mesa mesa){
        
       String sql = "INSERT INTO mesa(numero_mesa, capacidad, estado) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getNumeroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            
            ps.executeUpdate();

          ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "Mesa: " + mesa.getNumeroMesa() + "cargada");
                
            }
            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar mesa: " + ex.getMessage());
            ex.printStackTrace();
        }
        
        
    }
    
}