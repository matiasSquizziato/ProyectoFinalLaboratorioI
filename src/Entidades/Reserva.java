package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {

    private int idReserva;
    private Mesa mesa;
    private String nombreCliente;
    private int dniCliente;
    private LocalDate fechaReserva;
    private LocalTime horaReserva;
    private boolean estado;

    public Reserva(int idReserva, Mesa mesa, String nombreCliente, int dniCliente, LocalDate fechaReserva, LocalTime horaReserva, boolean estado) {
        this.idReserva = idReserva;
        this.mesa = mesa;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.estado = estado;
    }

    //sin id
    public Reserva(Mesa mesa, String nombreCliente, int dniCliente, LocalDate fechaReserva, LocalTime horaReserva, boolean estado) {
        this.mesa = mesa;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.estado = estado;
    }

    public Reserva() {
    }
    
    
    

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }



    public LocalTime getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(LocalTime horaReserva) {
        this.horaReserva = horaReserva;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "idReserva" + idReserva + ", mesa=" + mesa + "estado=" + estado;
    }

  
    
    
}
