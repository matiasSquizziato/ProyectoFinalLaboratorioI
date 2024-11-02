
package AccesoADatos;

import Entidades.Factura;
import Entidades.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author matiSqui
 */
public class FacturaData {
    
    private Connection con = null;
    
    
    public FacturaData(){
        
        con = (Connection) ConexionData.getConexion();
        
    }
    
    
    //Guardar una factura
    public void guardarFactura(Factura factura, Pedido ped){
        
        String sql = "INSERT INTO factura(id_pedido, total, fecha_factura) VALUES (?,?,?)";
        
      
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, ped.getIdPedido());
            ps.setDouble(2, factura.getTotal());
            ps.setDate(3, Date.valueOf(factura.getFechaFactura()));
            
            ps.executeQuery();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "Factura cargada con exito");
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FacturaData.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
    }
    
    
}
