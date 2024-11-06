
package Vistas;

import AccesoADatos.ConexionData;
import Vistas.VistaPrincipal;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author matiSqui
 */
public class ProyectoFinalLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        
      Connection con =(Connection) ConexionData.getConexion();
      
        VistaPrincipal menu = new VistaPrincipal();
        menu.setVisible(true);

    }
    
}
