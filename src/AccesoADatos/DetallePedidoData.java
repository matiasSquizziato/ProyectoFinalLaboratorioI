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
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author matiSqui
 */
public class DetallePedidoData {
    
    private Connection con = null;
    
    PedidoData peData = new PedidoData();
    ProductoData proData = new ProductoData();
    
    
    public DetallePedidoData(){
        
        con = ConexionData.getConexion();
        
    }
    
    //cargar detalle
    public void cargarDetalle(DetallePedido detalle, Pedido pedido, Producto producto){
        
        String sql = "INSERT INTO detalle_pedido(id_pedido, id_producto, cantidad_producto, importe, estado) VALUES (?, ?, ?, ?, ?)";

        
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
           JOptionPane.showMessageDialog(null,"Error al ingresar a la tabla detalle_pedido");
        }
        }
 
    
    //buscar detalle
    public DetallePedido buscarDetalle(int id){
        
        String sql = "SELECT * FROM detalle_pedido WHERE id_detalle= ?";
        
        DetallePedido detalleActual = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                detalleActual = new DetallePedido();
                
                detalleActual.setIdDetalle(id);
                detalleActual.setPedido(peData.buscarPedidoId(rs.getInt("id_pedido")));
                detalleActual.setProducto(proData.buscarProductoid(rs.getInt("id_producto")));
                detalleActual.setCantidadProducto(rs.getInt("cantidad_producto"));
                detalleActual.setImporte(rs.getDouble("importe"));
                detalleActual.isEstado();
       
            } else {
                
                JOptionPane.showMessageDialog(null, "no hay detallePedido con ese id");
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DetallePedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return detalleActual;
    }
    
    
    //listar detalles del idPedido

    public List<DetallePedido> buscarDetalleIdp(int id) {
    
    String sql = "SELECT * FROM detalle_pedido WHERE id_pedido = ?";
    ArrayList<DetallePedido> detallesPorP = new ArrayList<>();
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            DetallePedido detalleActual = new DetallePedido();
            
            
            detalleActual.setIdDetalle(rs.getInt("id_detalle"));
            
            
            detalleActual.setPedido(peData.buscarPedidoId(rs.getInt("id_pedido")));
            detalleActual.setProducto(proData.buscarProductoid(rs.getInt("id_producto")));
            detalleActual.setCantidadProducto(rs.getInt("cantidad_producto"));
            detalleActual.setImporte(rs.getDouble("importe"));
            detalleActual.setEstado(rs.getBoolean("estado")); 
            
            
            detallesPorP.add(detalleActual);
        }
        
        ps.close();
    } catch (SQLException ex) {
        Logger.getLogger(DetallePedidoData.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return detallesPorP;
}

        //listar detalles del idPedido where estado = 1

    public List<DetallePedido> buscarDetalleIdTrue(int id) {
    
    String sql = "SELECT * FROM detalle_pedido WHERE id_pedido =? AND estado = 1";
    ArrayList<DetallePedido> detallesPorP = new ArrayList<>();
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setBoolean(2, true);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            DetallePedido detalleActual = new DetallePedido();
            
            
            detalleActual.setIdDetalle(rs.getInt("id_detalle"));
            
            
            detalleActual.setPedido(peData.buscarPedidoId(rs.getInt("id_pedido")));
            detalleActual.setProducto(proData.buscarProductoid(rs.getInt("id_producto")));
            detalleActual.setCantidadProducto(rs.getInt("cantidad_producto"));
            detalleActual.setImporte(rs.getDouble("importe"));
            detalleActual.setEstado(rs.getBoolean("estado")); 
            
            
            detallesPorP.add(detalleActual);
        }
        
        ps.close();
    } catch (SQLException ex) {
        Logger.getLogger(DetallePedidoData.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return detallesPorP;
}
    
    
    //listar detalles
    
    public List<DetallePedido> listarDetalles(){
        
        String sql = "SELECT * FROM detalle_pedido WHERE estado = 1 ";
        
        ArrayList <DetallePedido> detallesPedido = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                DetallePedido detalle = new DetallePedido();
                
                detalle.setPedido(peData.buscarPedidoId(rs.getInt("id_pedido")));
                detalle.setProducto(proData.buscarProductoid(rs.getInt("id_producto")));
                detalle.setCantidadProducto(rs.getInt("cantidad_producto"));
                detalle.setImporte(rs.getDouble("importe"));
                detalle.setEstado(true);
                
                
                detallesPedido.add(detalle);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DetallePedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return detallesPedido;
        
    }
    
    
    //modificar estado del detalle
    public void modificarEstado(int idPedido, boolean estado) {
        String sql = "UPDATE detalle_pedido SET estado = ? WHERE id_pedido = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        
       
        ps.setBoolean(1, estado);
        ps.setInt(2, idPedido);
        
    
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null,"Estado:" + estado +", modificado corrctamente");
    } catch (SQLException ex) {
        Logger.getLogger(DetallePedidoData.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    //modificar todo
    public void modificarDetalle(DetallePedido det){
        
    String sql = "UPDATE detalle_pedido SET id_producto = ?, cantidad_producto = ?, estado = ? WHERE id_detalle = ?";
        
            try {
        PreparedStatement ps = con.prepareStatement(sql);
        
       
        ps.setInt(1, det.getProducto().getIdProducto()); 
        ps.setInt(2, det.getCantidadProducto()); 
        ps.setBoolean(3, det.isEstado()); 
        ps.setInt(4, det.getIdDetalle()); 
        
    
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null,"Detalle:" + det +", modificado corrctamente");
    } catch (SQLException ex) {
        Logger.getLogger(DetallePedidoData.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        
        
    }
    
    //consulta por los importes para la factura
    public List<DetallePedido> importesPorId(int id){
        
        String sql = "SELECT importe FROM detalle_pedido WHERE id_pedido =? AND estado = 1";
        
        ArrayList <DetallePedido> totalImporte = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                DetallePedido deImporte = new DetallePedido();
                
                deImporte.setImporte(rs.getDouble("importe"));
                
                totalImporte.add(deImporte);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DetallePedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return totalImporte;
           
    }
    
   //sumar importe 
    
   public double sumarImportesPorPedido(int idPedido) {
    String sql = "SELECT SUM(importe) AS total_importe FROM detalle_pedido WHERE id_pedido = ?";
    double totalImporte = 0;

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idPedido);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            totalImporte = rs.getDouble("total_importe");
        }

        ps.close(); // Cierra el PreparedStatement

    } catch (SQLException ex) {
        Logger.getLogger(DetallePedidoData.class.getName()).log(Level.SEVERE, null, ex);
    }

    return totalImporte; // Retorna el total de importes
}

    
}
