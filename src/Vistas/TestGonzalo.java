/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

/**
 *
 * @author pc
 */
public class TestGonzalo {

    public static void main(String[] args) {
        //Instancia una Mesa mesa1
        Mesa mesa1 = new Mesa(2, 01, 4, true);
        //Instancia una Reserva re1
        Reserva re1 = new Reserva(mesa1, "Juan Jose", 1234, LocalDate.of(2024, 10, 17), LocalTime.of(22, 00), true);
        //Instancia MesaData
        MesaData mesaData = new MesaData();
        //Guarda mesa1 en BD
        //mesaData.cargarMesa(mesa1);
        //Instancia ReservaData reData
        ReservaData reData = new ReservaData();
        //Guarda la Reserva re1 en BD
        //reData.hacerReserva(re1, mesa1.getIdMesa());
        //Instancia Mesero nMesero
        Mesero nMesero = new Mesero(1, "Matias", "Squizziato", 1234, true);
        //INstancia MozoData
        MozoData mozoData = new MozoData();
        //Guarda el Mozo en BD
        //mozoData.guardarMozo(nMesero);
        //Instancia Producto prod1
        Producto prod1 = new Producto(10, "ensalada", 0, 10900, true);
        //Instancia ProductoData
        ProductoData produData = new ProductoData();
        //Guarda prod1 en BD
        //produData.cargarProducto(prod1);
        //Instancia Pedido nPedido
        Pedido nPedido = new Pedido(mesa1, nMesero, true, LocalDate.of(2024, 10, 18));
        //Instancia PedidoData
        PedidoData pedidoData = new PedidoData();
        //Guarda nPedido en BD
        pedidoData.cargarPedido(nPedido, mesa1, nMesero);
        System.out.println(nMesero.getIdMesero());

    }
}
