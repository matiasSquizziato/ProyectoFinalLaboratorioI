
package AccesoADatos;

import Entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
    
    //Modificar una mesa
    public void modificarMesa(Mesa mesa){
        
        String sql = "UPDATE mesa SET numero_mesa = ?, capacidad=?, estado=? WHERE id_mesa=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, mesa.getNumeroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            ps.setInt(4, mesa.getIdMesa());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                
                JOptionPane.showMessageDialog(null,"Mesa" +mesa.getNumeroMesa() +"modificada correctamente");
            } else{
                
                JOptionPane.showMessageDialog(null,"No se puede modificar" + mesa);
                
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al ingrear a la tabla mesa: " + ex.getMessage());
        }
        
        
    }
    
    //Listado de mesas activas
    public List<Mesa> listadoMesasaA(){
        
        String sql = "SELECT * FROM mesa WHERE estado = 1"; 
        
        
        ArrayList <Mesa> listaMesasA = new ArrayList<>();
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Mesa mesa = new Mesa();
                
                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setNumeroMesa(rs.getInt("numero_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(true);
             
                listaMesasA.add(mesa);
                
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al ingrear a la tabla mesa: " + ex.getMessage());
        }
        
        
        return listaMesasA;
        
    }
    
       //Listado de mesas inactivas
    public List<Mesa> listadoMesasaIn(){
        
        String sql = "SELECT * FROM mesa WHERE estado = 0"; 
        
        
        ArrayList <Mesa> listaMesasIn = new ArrayList<>();
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Mesa mesa = new Mesa();
                
                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setNumeroMesa(rs.getInt("numero_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(false);
             
                listaMesasIn.add(mesa);
                
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al ingrear a la tabla mesa: " + ex.getMessage());
        }
        
        
        return listaMesasIn;
        
    }
    
    
}