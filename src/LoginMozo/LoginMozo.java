/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginMozo;

import Entidades.Mesero;

/**
 *
 * @author matiSqui
 */

//con esto genero el mozo estatico para acceder a el desde cualquier lado

public class LoginMozo {
    
    private static Mesero meseroActual;

    private LoginMozo() {
    }

    public static Mesero getMeseroActual() {
        return meseroActual;
    }

    public static void setMeseroActual(Mesero meseroActual) {
        LoginMozo.meseroActual = meseroActual;
        
    }
    

}
