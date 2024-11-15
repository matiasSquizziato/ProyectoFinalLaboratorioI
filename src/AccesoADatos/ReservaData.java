package AccesoADatos;

import Entidades.Mesa;
import Entidades.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author matiSqui
 */
public class ReservaData {
    
    private Connection con = null;
    
    private MesaData meData = new MesaData();
    
    public ReservaData(){
        con = ConexionData.getConexion();
    }
    
    //guardar reserva
    public void hacerReserva(Reserva reserva, int idMesa){
        
        String sql = "INSERT INTO reserva(id_mesa, nombre_cliente, dni_cliente, fecha_reserva, hora_reserva, estado) VALUES (?,?,?,?,?,?)";

        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,idMesa);
            ps.setString(2, reserva.getNombreCliente());
            ps.setInt(3, reserva.getDniCliente());
            ps.setDate(4, Date.valueOf(reserva.getFechaReserva()));
            ps.setTime(5, Time.valueOf(reserva.getHoraReserva()));
            
            ps.setBoolean(6,reserva.isEstado());
            
            ps.executeUpdate();
                    
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "Reserva para...: " +reserva.getNombreCliente() + " reservada con exito!");
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error al ingresar a la tabla: " + reserva + ex.getMessage());
        }


     }   
    
    //modificar reserva
    
         public void modificarReserva(Reserva reserva, Mesa mesa, int idMesa) {
        String sql = "UPDATE reserva SET nombre_cliente = ?, dni_cliente = ?, fecha_reserva = ?, hora_reserva = ?, estado = ? WHERE id_reserva = ?";

        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, idMesa);
            ps.setInt(2, reserva.getDniCliente());
            ps.setDate(3, Date.valueOf(reserva.getFechaReserva()));
            ps.setTime(4, Time.valueOf(reserva.getHoraReserva()));
            ps.setBoolean(5, reserva.isEstado());
            ps.setInt(6, reserva.getIdReserva());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null,"Reserva: " +reserva + ",modificada");
            } else {
                    JOptionPane.showMessageDialog(null,"no se pudo modificar la reserva");
                
            }

        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null,"no se pudo acceder a la tabla reserva");
        }
    }  
         
     //buscar reserva
         public Reserva buscaReserva(int id){
              
            String sql = "SELECT * FROM reserva WHERE id_reserva = ?";

             
             Reserva reserva = null;
             
        try {
           PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
             
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                reserva = new Reserva();
                
                reserva.setIdReserva(rs.getInt("id_reserva"));
                reserva.setMesa(meData.buscarMesaId(rs.getInt("id_mesa")));
                reserva.setNombreCliente(rs.getString("nombre_cliente"));
                reserva.setDniCliente(rs.getInt("dni_cliente"));
                
                reserva.setFechaReserva(rs.getDate("fecha_reserva").toLocalDate());
                reserva.setHoraReserva(rs.getTime("hora_reserva").toLocalTime());
                
                reserva.setEstado(true);   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
             return reserva;
           
         }
         
        //listar reservas 
         
         public List<Reserva> listadoReservas(){
             
             String sql = "SELECT * FROM reserva";
             
             ArrayList listadoReserva = new ArrayList<>();
             
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Reserva reserva = new Reserva();
                
                reserva.setIdReserva(rs.getInt("id_reserva"));
                reserva.setMesa(meData.buscarMesaId(rs.getInt("id_mesa")));
                reserva.setNombreCliente(rs.getString("nombre_cliente"));
                reserva.setDniCliente(rs.getInt("dni_cliente"));
                reserva.setFechaReserva(rs.getDate("fecha_reserva").toLocalDate());
                reserva.setHoraReserva(rs.getTime("hora_reserva").toLocalTime());
                
                reserva.setEstado(true);
                
                listadoReserva.add(reserva);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
             
             return listadoReserva;
             
             
         }
         
         
         
         //buscar reserva por fecha
         public Reserva buscaReservaDate(LocalDate fecha){
              
            String sql = "SELECT * FROM reserva WHERE fecha_reserva=?";

             
             Reserva reserva = null;
             
        try {
           PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setDate(1, Date.valueOf(fecha));
             
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                reserva = new Reserva();
                
                
                reserva.setMesa(meData.buscarMesaId(rs.getInt("id_mesa")));
                reserva.setNombreCliente(rs.getString("nombre_cliente"));
                reserva.setDniCliente(rs.getInt("dni_cliente"));
                
                reserva.setFechaReserva(rs.getDate("fecha_reserva").toLocalDate());
                reserva.setHoraReserva(rs.getTime("hora_reserva").toLocalTime());
                
                reserva.setEstado(true);   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
             return reserva;
           
         }
         
          
    }
    

