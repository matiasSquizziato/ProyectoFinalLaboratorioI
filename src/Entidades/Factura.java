package Entidades;
//import java.util.Date;
import java.time.LocalDate;


public class Factura {

    private int idFactura;

    private Pedido pedido;

    private double total;

    private LocalDate fechaFactura;

    public Factura(int idFactura, Pedido pedido, double total, LocalDate fechaFactura) {
        this.idFactura = idFactura;
        this.pedido = pedido;
        this.total = total;
        this.fechaFactura = fechaFactura;
    }

    //Vacio
    public Factura() {
        
    }

    

    public int getIdFactura() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Pedido getPedido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public LocalDate getFechaFactura() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setIdFactura(int idFactura) {
    }

    public void setPedido(Pedido pedido) {
    }

    public void setTotal(double total) {
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", pedido=" + pedido + ", total=" + total + ", fechaFactura=" + fechaFactura + '}';
    }

    

}
