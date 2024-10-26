/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author matiSqui
 */
public class PedidoData {
    
    private Connection con = null;
    private MesaData meData = new MesaData();
    private MozoData moData = new MozoData();
    
    public PedidoData(){
        
        con = ConexionData.getConexion();
          if (con == null) {
        JOptionPane.showMessageDialog(null, "Error: No se pudo establecer la conexión con la base de datos.");
    }
        
    }
    
    //cargarPedidos
    public void cargarPedido(Pedido pedido, Mesa mesa, Mesero mesero){
      
        String sql = "INSERT INTO pedido(id_mesa, id_mesero, estado, fecha_pedido) VALUES (?,?,?,?)";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, mesero.getIdMesero());
            ps.setBoolean(3, pedido.isEstado());
            ps.setDate(4, Date.valueOf(pedido.getFechaPedido()));
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "pedido para la mesa: " + mesa.getNumeroMesa() + ", de: " + mesero.getNombre()+", cargado.");
                
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla pedido"+ex);
        }
 
    }

    //Buscar pedido por id
    
    public  Pedido buscarPedidoId(int id){
        
        String sql= "SELECT * FROM pedido WHERE id_pedido = ?";
        
        Pedido pedido = null;
        
         try {
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setInt(1,id);
            
           ResultSet rs = ps.executeQuery();
           
             if (rs.next()) {
                 
                pedido = new Pedido();
                 
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(meData.buscarMesaId(rs.getInt("id_mesa")));
                pedido.setMesero(moData.buscarMozoId(rs.getInt("id_mesero")));   
                pedido.setEstado(true);
                pedido.setFechaPedido(rs.getDate("fecha_pedido").toLocalDate());
                   
             } else {
                 
             JOptionPane.showMessageDialog(null, "no existe ese pedido con ese id:  " + id);

                 
             }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido: " + ex.getMessage());
        }
                
                
         return pedido;
        
    }
    
    
    
    
    //listar pedidos por id
    public List<Pedido> listarPedidoId(int id){
        
        String sql = "SELECT * FROM pedido WHERE id_mesero = ?";
        
        ArrayList pedidosId = new ArrayList<>();
        
        System.out.println(id);
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            
               ps.setInt(1, id);
               
               ResultSet rs = ps.executeQuery();
               
               while (rs.next()) {
                
                   Pedido pedido = new Pedido();
                   pedido.setIdPedido(rs.getInt("id_pedido"));
                   pedido.setMesa(meData.buscarMesaId(rs.getInt("id_mesa")));
                   pedido.setMesero(moData.buscarMozoId(rs.getInt("id_mesero")));
                   
                   pedido.setEstado(true);
                   pedido.setFechaPedido(rs.getDate("fecha_pedido").toLocalDate());
                   
                   pedidosId.add(pedido);
                   
               }
               
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     return pedidosId;   
        
    }
    
    //listar todos los pedidos
     public List<Pedido> listarPedido(){
        
        String sql = "SELECT * FROM pedido";
        
        ArrayList pedidosAll = new ArrayList<>();
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            
              
               
               ResultSet rs = ps.executeQuery();
               
               while (rs.next()) {
                
                   Pedido pedido = new Pedido();
                   pedido.setIdPedido(rs.getInt("id_pedido"));
                   pedido.setMesa(meData.buscarMesaId(rs.getInt("id_mesa")));
                   pedido.setMesero(moData.buscarMozoId(rs.getInt("id_mesero")));
                   pedido.setEstado(true);
                   pedido.setFechaPedido(rs.getDate("fecha_pedido").toLocalDate());
                   
                   pedidosAll.add(pedido);
                   
               }
               
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     return pedidosAll;   
        
    }
    
    //modificar pedido
     public void modificarPedido(Pedido pedido){
         
         System.out.println("estoy aqui pedido: " + pedido);
              String sql = "UPDATE pedido SET id_mesa=?, id_mesero=?, estado=?, fecha_pedido=? WHERE id_pedido=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setBoolean(1, !pedido.isEstado());
            ps.setInt(2, pedido.getIdPedido());
            ps.setInt(3, pedido.getMesa().getIdMesa());
            ps.setInt(4, pedido.getMesero().getIdMesero());
            ps.setBoolean(5, pedido.isEstado());
            ps.setDate(6, Date.valueOf(pedido.getFechaPedido()));
            
           ps.executeUpdate();
            
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al ingrear a la tabla pedido: " + ex.getMessage());
        }
         
         
     }
     
     
}
