/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package travelease;

import Reservas.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class TravelEase {
    
    private List<Reserva> reservas;

    public TravelEase() {
        this.reservas = new ArrayList<>();
    }

    public Reserva reservarVuelo(Usuario usuario, Vuelo vuelo, Pago pago) {
        if (vuelo.verificarDisponibilidad()) {
            Asiento asiento = vuelo.obtenerAsientoDisponible();
            if (asiento != null) {
                asiento.setDisponibilidad(false);
                if (pago.verificarFondos()) {
                    Reserva reserva = new Reserva("R123", new Date());
                    reservas.add(reserva);
                    reserva.confirmar();
                    System.out.println("Reserva de vuelo confirmada para " + usuario.getNombre());
                    return reserva;
                } else {
                    System.out.println("Pago no aprobado.");
                }
            } else {
                System.out.println("No hay asientos disponibles.");
            }
        } else {
            System.out.println("Vuelo no disponible.");
        }
        return null;
    }

    public Reserva alquilarVehiculo(Usuario usuario, Vehiculo vehiculo, Pago pago) {
        if (vehiculo.isDisponible()) {
            vehiculo.setDisponibilidad(false);
            if (pago.verificarFondos()) {
                Reserva reserva = new Reserva("V456", new Date());
                reservas.add(reserva);
                reserva.confirmar();
                System.out.println("Reserva de vehículo confirmada para " + usuario.getNombre());
                return reserva;
            } else {
                System.out.println("Pago no aprobado.");
            }
        } else {
            System.out.println("Vehículo no disponible.");
        }
        return null;
    }
}
