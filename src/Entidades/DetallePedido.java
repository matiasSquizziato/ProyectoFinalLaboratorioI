package Entidades;

public class DetallePedido {

    private int idDetalle;

    private Pedido pedido;

    private Producto producto;

    private int cantidadProducto;

    private double importe;

    private boolean estado;

    public DetallePedido(int idDetalle, int idPedido, int idProducto, int cantidadProducto, double subtotal) {
    }

    public int getIdDetalle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setIdDetalle(int idDetalle) {
    }

    public int getIdPedido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setIdPedido(int idPedido) {
    }

    public int getIdProducto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setIdProducto(int idProducto) {
    }

    public int getCantidadProducto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCantidadProducto(int cantidadProducto) {
    }

    public double getSubtotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setSubtotal(double subtotal) {
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
