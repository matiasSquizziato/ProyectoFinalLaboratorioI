package AccesoADatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author matiSqui
 */
public class ConexionData {
    
    // Atributos para la URL, la base de datos, el usuario y la contraseña
    private static final String URL = "jdbc:mariadb://localhost:3306/restoulpfinal";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    // Atributo estático para la conexión
    private static Connection connection1;
    
    private ConexionData() {}
    
    // Método estático para obtener la conexión
    public static Connection getConexion() {
        if (connection1 == null) {
            try {
                // Registrar el driver de MariaDB
                Class.forName("org.mariadb.jdbc.Driver");

                // Crear la conexión a la base de datos
                connection1 = DriverManager.getConnection(URL, USUARIO, PASSWORD);

                JOptionPane.showMessageDialog(null, "Conexión exitosa!");

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers: " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos: " + ex.getMessage());
            }
        }
        return connection1;
    }
}