
package AccesoADatos;

import Entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matiSqui
 */
public class MesaData {
    
    private Connection con = null;
    
    public MesaData(){
        con = ConexionData.getConexion();
    }
    
    //cargar una mesa
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
            JOptionPane.showMessageDialog(null, "Error al ingrear a la tabla mesa: " + ex.getMessage());
            ex.printStackTrace();
        }
        
        
    }
    
    //buscar una mesa
    public Mesa buscarMesa(int numMesa){
        
        String sql = "SELECT id_mesa, numero_mesa, capacidad, estado FROM mesa WHERE numero_mesa= ?";
        
        Mesa mesaActual = null;
        
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
         ps.setInt(1, numMesa);
            
         ResultSet rs = ps.executeQuery();
         
            if (rs.next()) {
                
                mesaActual = new Mesa();
                
                mesaActual.setIdMesa(rs.getInt("id_mesa"));
                mesaActual.setCapacidad(rs.getInt("capacidad"));
                mesaActual.setEstado(true);
                mesaActual.setNumeroMesa(rs.getInt("numero_mesa"));
                
            } else {
                
                JOptionPane.showMessageDialog(null, "NO HAY MESAS CON ESE NUMERO" + numMesa);
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al ingrear a la tabla mesa: " + ex.getMessage());
        }
        
        
        
        return mesaActual;
        
    }
    
}