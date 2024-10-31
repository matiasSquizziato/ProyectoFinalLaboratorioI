package Entidades;


import java.time.LocalDate;
import java.util.List;

public class Pedido {

    private int idPedido;
    private Mesa mesa;
    private Mesero mesero;
    private boolean estado;
    private LocalDate fechaPedido;
    private List<DetallePedido> detalles;

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, boolean estado, LocalDate fechaPedido) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.estado = estado;
        this.fechaPedido = fechaPedido;
    }

    public Pedido(Mesa mesa, Mesero mesero, boolean estado, LocalDate fechaPedido) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.estado = estado;
        this.fechaPedido = fechaPedido;
    }

    public Pedido() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "id:" + idPedido + ", mesa=" + mesa + ", mesero=" + mesero  + ", fechaPedido=" + fechaPedido;
    }

    

   
    
    
}
