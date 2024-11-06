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
import java.time.LocalDate;
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
                   pedido.setFechaPedido(rs.getDate("fecha_pedido").toLocalDate());
                   
                   //obtengo el estado de la db
                   boolean estado = rs.getBoolean("estado");
//                   se lo cargo al pedido
                    System.out.println(estado);
                   pedido.setEstado(estado);
                   
                   pedidosAll.add(pedido);
                   
               }
               
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     return pedidosAll;   
        
    }
    
     //listar pedidos que sean activos
          public List<Pedido> listarPedidoAct(){
        
        String sql = "SELECT * FROM pedido WHERE estado = 1";
        
        ArrayList pedidosAct = new ArrayList<>();
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            
              
               
               ResultSet rs = ps.executeQuery();
               
               while (rs.next()) {
                
                   Pedido pedido = new Pedido();
                   pedido.setIdPedido(rs.getInt("id_pedido"));
                   pedido.setMesa(meData.buscarMesaId(rs.getInt("id_mesa")));
                   pedido.setMesero(moData.buscarMozoId(rs.getInt("id_mesero")));
                   pedido.setFechaPedido(rs.getDate("fecha_pedido").toLocalDate());
                   
                   //obtengo el estado de la db
                   boolean estado = rs.getBoolean("estado");
//                   se lo cargo al pedido
                    System.out.println(estado);
                   pedido.setEstado(estado);
                   
                   pedidosAct.add(pedido);
                   
               }
               
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     return pedidosAct;   
        
    }
     
          //listar pedidos por id mozo
       public List<Pedido> listarPedidoMozo(int idMesero) {
    String sql = "SELECT * FROM pedido WHERE id_mesero = ?";
    
    ArrayList<Pedido> pedidos = new ArrayList<>();  

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idMesero);  

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Pedido pedido = new Pedido();
            pedido.setIdPedido(rs.getInt("id_pedido"));
            pedido.setMesa(meData.buscarMesaId(rs.getInt("id_mesa")));
            pedido.setMesero(moData.buscarMozoId(rs.getInt("id_mesero")));
            pedido.setFechaPedido(rs.getDate("fecha_pedido").toLocalDate());

            
            boolean estado = rs.getBoolean("estado");
            System.out.println(estado);
            pedido.setEstado(estado);

            pedidos.add(pedido);  
        }

        ps.close();  

    } catch (SQLException ex) {
        Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
    }

    return pedidos;  
}

          
//listar pedidos por id mozo y por estado 
    public List<Pedido> listarPedidoMozof(int idMesero, boolean estado) {
    String sql = "SELECT * FROM pedido WHERE id_mesero = ? AND estado = ?";
    ArrayList<Pedido> pedidos = new ArrayList<>();  

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idMesero);  
        ps.setBoolean(2, estado); 

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Pedido pedido = new Pedido();
            pedido.setIdPedido(rs.getInt("id_pedido"));
            pedido.setMesa(meData.buscarMesaId(rs.getInt("id_mesa")));
            pedido.setMesero(moData.buscarMozoId(rs.getInt("id_mesero")));
            pedido.setFechaPedido(rs.getDate("fecha_pedido").toLocalDate());

            boolean pedidoEstado = rs.getBoolean("estado");
            System.out.println(pedidoEstado);
            pedido.setEstado(pedidoEstado);

            pedidos.add(pedido);  
        }

        ps.close();  

    } catch (SQLException ex) {
        Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
    }

    return pedidos;  
}


          
      //listar pedidos que sean inactivos
          public List<Pedido> listarPedidoNull(){
        
        String sql = "SELECT * FROM pedido WHERE estado = 0";
        
        ArrayList pedidosNull = new ArrayList<>();
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            
              
               
               ResultSet rs = ps.executeQuery();
               
               while (rs.next()) {
                
                   Pedido pedido = new Pedido();
                   pedido.setIdPedido(rs.getInt("id_pedido"));
                   pedido.setMesa(meData.buscarMesaId(rs.getInt("id_mesa")));
                   pedido.setMesero(moData.buscarMozoId(rs.getInt("id_mesero")));
                   pedido.setFechaPedido(rs.getDate("fecha_pedido").toLocalDate());
                   
                   //obtengo el estado de la db
                   boolean estado = rs.getBoolean("estado");
//                   se lo cargo al pedido
                    System.out.println(estado);
                   pedido.setEstado(estado);
                   
                   pedidosNull.add(pedido);
                   
               }
               
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     return pedidosNull;   
        
    }
     
    //modificar pedido 
    public void modificarPedido(Pedido pedido){
    String sql = "UPDATE pedido SET estado = ?, fecha_pedido = ?, id_mesa = ?, id_mesero = ? WHERE id_pedido = ?";
    
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setBoolean(1, pedido.isEstado());
        ps.setDate(2, java.sql.Date.valueOf(pedido.getFechaPedido()));
        ps.setInt(3, pedido.getMesa().getIdMesa());
        ps.setInt(4, pedido.getMesero().getIdMesero());
        ps.setInt(5, pedido.getIdPedido());
 
        
        int exito = ps.executeUpdate();
        
        if (exito > 0) {
            JOptionPane.showMessageDialog(null, "El pedido ha sido modificado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún pedido para actualizar.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al modificar el pedido: " + ex.getMessage());
    }
}

    
    //modificar el esado
    public void cambiarEstadoPedido(int idPedido, boolean nuevoEstado) {
    String sql = "UPDATE pedido SET estado = ? WHERE id_pedido = ?";
    
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setBoolean(1, nuevoEstado); // Establecemos el nuevo estado
        ps.setInt(2, idPedido); // Identificamos el pedido por su ID

        int exito = ps.executeUpdate();

        if (exito > 0) {
            JOptionPane.showMessageDialog(null, "El estado del pedido ha sido modificado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún pedido para actualizar.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al modificar el estado del pedido: " + ex.getMessage());
    }
}

   
    //listar por fecha y id
    public List<Pedido> listarPedidoMozoPorFecha(int idMesero, LocalDate fecha) {
    String sql = "SELECT * FROM pedido WHERE id_mesero = ? AND fecha_pedido = ?";

    ArrayList<Pedido> pedidos = new ArrayList<>();

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idMesero);
        ps.setDate(2, java.sql.Date.valueOf(fecha));  // Convertimos LocalDate a java.sql.Date

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Pedido pedido = new Pedido();
            pedido.setIdPedido(rs.getInt("id_pedido"));
            pedido.setMesa(meData.buscarMesaId(rs.getInt("id_mesa")));
            pedido.setMesero(moData.buscarMozoId(rs.getInt("id_mesero")));
            pedido.setFechaPedido(rs.getDate("fecha_pedido").toLocalDate());

            boolean estado = rs.getBoolean("estado");
            System.out.println(estado);
            pedido.setEstado(estado);

            pedidos.add(pedido);
        }

        ps.close();

    } catch (SQLException ex) {
        Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
    }

    return pedidos;
}

    
    
}
