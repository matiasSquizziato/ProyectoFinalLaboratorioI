package AccesoADatos;

import Entidades.Mesero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
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
        
        String sql = "INSERT INTO mesero(apellido, nombre, dni) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, mozo.getApellido());
            ps.setString(2, mozo.getNombre());
            ps.setInt(3, mozo.getDni());
          
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "Mozo; " + mozo.getApellido()+ " " + mozo.getNombre()+ "" + ", guardado con exito!");
                
            }
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null,"Error al ingresar a la tabla mesero"+ ex.getMessage());
            
        }
        
        
        
        
        
    }
    
    
    
    
    
}