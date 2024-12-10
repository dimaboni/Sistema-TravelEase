/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservas;

import java.util.Date;

/**
 *
 * @author richardo
 */
public class Reserva extends Subject {
    private String idReserva;
    private Date fecha;
    private String estado;

    public Reserva(String idReserva, Date fecha) {
        this.idReserva = idReserva;
        this.fecha = fecha;
        this.estado = "pendiente";
    }

    public void confirmar() {
        this.estado = "confirmado";
    }

    public String getEstado() {
        return estado;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notifyObservers(this);
    }
    
    
    
    
}
