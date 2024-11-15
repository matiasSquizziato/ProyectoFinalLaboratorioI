
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
import java.time.LocalDate;
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
        
        String sql = "INSERT INTO factura(id_pedido, total, fecha_factura,cantidad) VALUES (?,?,?,?)";
        
      
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, ped.getIdPedido());
            ps.setDouble(2, factura.getTotal());
            ps.setDate(3, Date.valueOf(factura.getFechaFactura()));
            ps.setInt(4, factura.getCantiadFactura());
            
            ps.executeQuery();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "Factura cargada con exito");
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FacturaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

// total facturado
public int obtenerCantidadFacturado(LocalDate fecha) {
    int cantidadFacturado = 0;

    String sql = "SELECT SUM(total * cantidad) AS total_facturado FROM factura WHERE fecha_factura = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, java.sql.Date.valueOf(fecha));  
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            cantidadFacturado = rs.getInt("total_facturado"); 
        }
        
        System.out.println("Total facturado considerando cantidad: " + cantidadFacturado);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla factura: " + e.getMessage());
    }

    return cantidadFacturado;
}


    
    
}
