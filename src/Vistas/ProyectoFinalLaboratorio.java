/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vistas;

import AccesoADatos.MesaData;
import AccesoADatos.MozoData;
import AccesoADatos.PedidoData;

import AccesoADatos.ProductoData;
import AccesoADatos.ReservaData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedido;
import Entidades.Producto;
import Entidades.Reserva;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author matiSqui
 */
public class ProyectoFinalLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mesa mesa1  = new Mesa(05,01,4,true);
//       
//        
//        Reserva re1 = new Reserva(mesa1,"Juan Jose", 1234,LocalDate.of(2024, 10,17),LocalTime.of(22, 00), true);
//        
        MesaData mesaData = new MesaData();
//        
//        
////        mesaData.cargarMesa(mesa1);
//        
//        ReservaData  reData = new ReservaData();
//        
//        reData.hacerReserva(re1, mesa1.getIdMesa());
//        
    Mesero nMesero = new Mesero(1,"Matias", "Squizziato",1234,true);
//    
//       MozoData mozoData = new MozoData();
//       
//       mozoData.guardarMozo(nMesero);
//       
        
//        Producto prod1 = new Producto(12,"Asado",0,10900,true);
//        
//        ProductoData produData = new ProductoData();
//        
//        produData.cargarProducto(prod1);
        

        Pedido nPedido = new Pedido(mesa1,nMesero,true,LocalDate.of(2024, 10, 18));
        
        PedidoData pedidoData = new PedidoData();
        
        pedidoData.cargarPedido(nPedido, mesa1, nMesero);
        
        
        
        



    }
    
}
