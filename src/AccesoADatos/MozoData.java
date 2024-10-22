package AccesoADatos;

import Entidades.Mesero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author matiSqui
 */
public class MozoData {
    
    private Connection con = null;
    
    public MozoData(){
        
        con = ConexionData.getConexion();
        
    }
    
    //
    //Guardar Mozo
    public void guardarMozo(Mesero mozo){
        
        String sql = "INSERT INTO mesero(apellido, nombre, dni, estado) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, mozo.getApellido());
            ps.setString(2, mozo.getNombre());
            ps.setInt(3, mozo.getDni());
            ps.setBoolean(4, mozo.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                mozo.setIdMesero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mozo; " + mozo.getApellido()+ " " + mozo.getNombre()+ ""+ mozo.getIdMesero() + ", guardado con exito!");
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null,"Error al ingresar a la tabla mesero"+ ex.getMessage());
            
        }

    }
    
    //Modificar mozo
    public void modificarMozo(Mesero mozo){
        
        System.out.println("id a modificar:" + mozo.getIdMesero());
        
        String sql = "UPDATE mesero SET nombre = ?, apellido = ?, estado = ? WHERE id_mesero = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps.setString(1, mozo.getNombre());
            ps.setString(2, mozo.getApellido());
            ps.setBoolean(3, mozo.isEstado());
            ps.setInt(4, mozo.getIdMesero());
         
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mozo: " + mozo.getNombre() + " modificado correctamente");

            } else {
                
                System.out.println("no se puede");
                
            }
            
        } catch (SQLException ex) {
           System.err.println("Error al modificar mozo: " + ex.getMessage());
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null,"NO SE PUDO CONECTAR A LA TABLA MESERO" + ex.getMessage());
        }
 
    }
    
    //Buscar por dni
    public Mesero buscarMozoDni(int dni){
        
        String sql = "SELECT id_mesero, dni, nombre, apellido, estado FROM mesero WHERE dni = ?";
        
        Mesero mozo = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, dni);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                mozo = new Mesero();
                
                mozo.setIdMesero(rs.getInt("id_mesero"));
                mozo.setNombre(rs.getString("nombre"));
                mozo.setApellido(rs.getString("apellido"));
                mozo.setDni(rs.getInt("dni"));
                mozo.setEstado(true);

            } else {
                
                JOptionPane.showMessageDialog(null,"NO HAY MOZO REGISTRADO CON ESTE DNI: " + dni);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NO SE PUDO CONECTAR A LA TABLA MESERO" + ex.getMessage());
        }
        
        return mozo;
    }
 
      public Mesero buscarMozoId(int id){
        
        String sql = "SELECT * FROM mesero WHERE id_mesero = ?";
        
        Mesero mozo = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                mozo = new Mesero();
                
                mozo.setIdMesero(rs.getInt("id_mesero"));
                mozo.setNombre(rs.getString("nombre"));
                mozo.setApellido(rs.getString("apellido"));
                mozo.setIdMesero(rs.getInt("dni"));
                mozo.setEstado(true);

            } else {
                
                JOptionPane.showMessageDialog(null,"NO HAY MOZO REGISTRADO CON ESTE DNI: " + id);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NO SE PUDO CONECTAR A LA TABLA MESERO" + ex.getMessage());
        }
        
        return mozo;
    }
    
    
    
    //Listar mozos activos
    
    public List<Mesero> listarMozosActivos(){
        
        String sql = "SELECT * FROM mesero WHERE estado = 1";
        
        ArrayList <Mesero> listaMeserosA = new ArrayList<>();
        
 
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Mesero mesero = new Mesero();
                mesero.setIdMesero(rs.getInt("id_mesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setDni(rs.getInt("dni"));

                mesero.setEstado(true);
                
                listaMeserosA.add(mesero);
                
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NO SE PUDO CONECTAR A LA TABLA MESERO" + ex.getMessage());
        }
        
        return listaMeserosA;
        
        
    }
    
      //Listar mozos Inactivos
    
    public List<Mesero> listarMozosInactivos(){
        
        String sql = "SELECT * FROM mesero WHERE estado = 0";
        
        ArrayList <Mesero> listaMeserosA = new ArrayList<>();
        
 
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Mesero mesero = new Mesero();
                mesero.setIdMesero(rs.getInt("id_mesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setDni(rs.getInt("dni"));
                mesero.setEstado(false);
                
                listaMeserosA.add(mesero);
                
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NO SE PUDO CONECTAR A LA TABLA MESERO" + ex.getMessage());
        }
        
        return listaMeserosA;
        
        
    }
}