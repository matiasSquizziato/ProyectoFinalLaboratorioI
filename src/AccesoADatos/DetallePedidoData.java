/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;
import Entidades.DetallePedido;
import Entidades.Pedido;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.sql.ResultSet;
/**
 *
 * @author matiSqui
 */
public class DetallePedidoData {
    
    private Connection con = null;
    
    public DetallePedidoData(){
        
        con = ConexionData.getConexion();
        
    }
    
    public void cargarDetalle(DetallePedido detalle, Pedido pedido, Producto producto){
        
        String sql = "INSERT INTO detalle_pedido(id_pedido, id_producto, cantidad_producto, importe, estado)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setInt(1, pedido.getIdPedido());
        ps.setInt(2, producto.getIdProducto());
        ps.setInt(3, detalle.getCantidadProducto());
        ps.setDouble(4, detalle.getImporte());
        ps.setBoolean(5, detalle.isEstado());
        
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null,"Detalle del pedido: "+ pedido.toString()+ ", cargado");
                
            }
        
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al ingresar a la tabla detale_pedido");
        }
        
        
        
    }
    
}
