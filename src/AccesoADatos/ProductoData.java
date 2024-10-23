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

/**
 *
 * @author matiSqui
 */
public class ProductoData {
 
    private Connection con = null;
    
    public ProductoData(){
        con = ConexionData.getConexion();
    }
    
    public void cargarProducto(Producto producto){
        
        String sql = "INSERT INTO producto(codigo, nombre, cantidad,precio) VALUES (?,?,?,?)"; 
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setInt(3, producto.getCantidad());
            ps.setDouble(4, producto.getPrecio());
            
            
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
    
    
}
