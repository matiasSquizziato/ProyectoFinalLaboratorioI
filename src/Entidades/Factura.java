package Entidades;
//import java.util.Date;
import java.time.LocalDate;


public class Factura {

    private int idFactura;

    private Pedido pedido;

    private double total;

    private LocalDate fechaFactura;
    private int cantiadFactura;

    public Factura(int idFactura, Pedido pedido, double total, LocalDate fechaFactura, int cantiadFactura) {
        this.idFactura = idFactura;
        this.pedido = pedido;
        this.total = total;
        this.fechaFactura = fechaFactura;
        this.cantiadFactura = cantiadFactura;
    }

    public Factura(Pedido pedido, double total, LocalDate fechaFactura, int cantiadFactura) {
        this.pedido = pedido;
        this.total = total;
        this.fechaFactura = fechaFactura;
        this.cantiadFactura = cantiadFactura;
    }

    public int getCantiadFactura() {
        return cantiadFactura;
    }

    public void setCantiadFactura(int cantiadFactura) {
        this.cantiadFactura = cantiadFactura;
    }

   

    
    
    //Vacio
    public Factura() {
        
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    
    
 

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", pedido=" + pedido + ", total=" + total + ", fechaFactura=" + fechaFactura + '}';
    }

    

}
