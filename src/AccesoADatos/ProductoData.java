/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matiSqui
 */
public class ProductoData {
 
    private Connection con = null;
    
    public ProductoData(){
        con = ConexionData.getConexion();
    }
    
    
    //cargarProductos
    public void cargarProducto(Producto producto){
        
        String sql = "INSERT INTO producto(codigo, nombre, cantidad,precio,estado) VALUES (?,?,?,?,?)"; 
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setInt(3, producto.getCantidad());
            ps.setDouble(4, producto.getPrecio());
            ps.setBoolean(5, producto.isEstado());
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null,"Producto" + producto.getNombre() + ", cargado con exito!");
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo ingresar a la tabla producto " +ex.getMessage());
        }
   
    }
    
    //busco producto por codigo
    public Producto buscarProductoCd(int codigo){
        
        String sql = "SELECT id_producto, nombre, cantidad, precio, codigo FROM producto WHERE codigo = ?";
        
        
        Producto producto = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, codigo);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                producto = new Producto();
                
                producto.setIdProducto(rs.getInt("id_producto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setPrecio(rs.getDouble("precio"));
                 producto.setCodigo(rs.getInt("codigo"));
                
                producto.setEstado(true);
               
                
            } else {
                
                JOptionPane.showMessageDialog(null, "NO HAY PRODUCTO CON ESE CODIGO: " + codigo);
                
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return producto;
        
    }
    
    //busco producto por id
    public Producto buscarProductoid(int id){
        
        String sql = "SELECT id_producto, nombre, cantidad, precio, codigo FROM producto WHERE id_producto = ?";
        
        
        Producto producto = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                producto = new Producto();
                
                producto.setIdProducto(rs.getInt("id_producto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCodigo(rs.getInt("codigo"));
                
                
                
                producto.setEstado(true);
               
                
            } else {
                
                JOptionPane.showMessageDialog(null, "NO HAY PRODUCTO CON ESE id: " + id);
                
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return producto;
        
    }
    
    //Modificar un producto
    
    public void modificarProducto(Producto producto){
        
        String sql = "UPDATE producto SET codigo = ?, nombre = ?, cantidad = ?, precio = ?, estado = ? WHERE id_producto = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setInt(3, producto.getCantidad());
            ps.setDouble(4, producto.getPrecio());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1 ) {
                
                JOptionPane.showMessageDialog(null, "Producto: " + producto.getNombre() + ", codigo:  " + producto.getCodigo()+ ", modificado correctamente" );
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ACCEDER A LA TABLA PRODUCTO" + producto);
        }
        
        
    }
    
    //modificar stock de producto
    
    public void modificarProductoStock(Producto producto, int cantidad) {
    String sql = "UPDATE producto SET cantidad = ? WHERE id_producto = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);

      
        ps.setInt(1, cantidad); 
        ps.setInt(2, producto.getIdProducto()); 

        int exito = ps.executeUpdate();

        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Producto: " + producto.getNombre() + ", modificado correctamente con nuevo stock: " + cantidad);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "NO SE PUDO ACCEDER A LA TABLA PRODUCTO");
    }
    }

    
    
    
    
    //Listado de producto que tienen poco stock
    public List<Producto> listarProductosMenores(){
        
        String sql = "SELECT * FROM producto WHERE cantidad < 5";
        
        
        ArrayList <Producto> listaProductosM = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("id_producto"));
                producto.setCodigo(rs.getInt("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setEstado(true);
                
                listaProductosM.add(producto);
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "NO SE PUDO ACCEDER A LA TABLA PRODUCTO" + ex.getMessage());
        }
        
        return listaProductosM;
        
    }
    
     //Listado de productos
    public List<Producto> listarProductos(){
        
        String sql = "SELECT * FROM producto WHERE estado = 1";
        
        
        ArrayList <Producto> listaProductos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("id_producto"));
                producto.setCodigo(rs.getInt("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setEstado(true);
                
                listaProductos.add(producto);
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "NO SE PUDO ACCEDER A LA TABLA PRODUCTO" + ex.getMessage());
        }
        
        return listaProductos;
        
    }
    
}
