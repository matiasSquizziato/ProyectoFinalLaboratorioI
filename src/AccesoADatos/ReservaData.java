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


/**
 *
 * @author matiSqui
 */
public class ReservaData {
    
    private Connection con = null;
    
    public ReservaData(){
        con = ConexionData.getConexion();
    }
    
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
         public boolean modificarReserva(Reserva reserva, Mesa mesa, int idMesa) {
        String sql = "UPDATE reservas SET nombre_cliente = ?, dni_cliente = ?, fecha_reserva = ?, hora_reserva = ?, estado = ? WHERE id_reserva = ?";

        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, idMesa);
            ps.setInt(2, reserva.getDniCliente());
            ps.setDate(3, Date.valueOf(reserva.getFechaReserva()));
            ps.setTime(4, Time.valueOf(reserva.getHoraReserva()));
            ps.setBoolean(5, reserva.isEstado());
            ps.setInt(6, reserva.getIdReserva());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Reserva modificada con éxito.");
                return true;
            } else {
                System.out.println("No se encontró la reserva con el ID especificado.");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error al modificar la reserva.");
            e.printStackTrace();
            return false;
        }
    }  
    }
    
