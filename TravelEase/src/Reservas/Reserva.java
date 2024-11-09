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
public class Reserva {
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
}
