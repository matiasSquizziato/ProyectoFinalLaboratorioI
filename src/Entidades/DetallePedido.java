package Entidades;

public class DetallePedido {

    private int idDetalle;
    private Pedido pedido;
    private Producto producto;
    private int cantidadProducto;
    private double importe;
    private boolean estado;

    public DetallePedido(int idDetalle, Pedido pedido, Producto producto, int cantidadProducto, double importe, boolean estado) {
        this.idDetalle = idDetalle;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.importe = importe;
        this.estado = estado;
    }

    public DetallePedido(Pedido pedido, Producto producto, int cantidadProducto, double importe, boolean estado) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.importe = importe;
        this.estado = estado;
    }

    public DetallePedido() {
    }
    
    
    

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }



    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "id" + idDetalle + ", pedido=" + pedido + ", pdct" + producto + ", cant" + cantidadProducto + ", $$" + importe + ",est" + estado;
    }

    


   
}
