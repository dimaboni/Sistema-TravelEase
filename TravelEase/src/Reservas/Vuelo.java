/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservas;

import java.util.ArrayList;
import java.util.List;


public class Vuelo {
    
    private String idVuelo;
    private String horario;
    private List<Asiento> asientos;

    public Vuelo(String idVuelo, String horario) {
        this.idVuelo = idVuelo;
        this.horario = horario;
        this.asientos = new ArrayList<>();
    }

    public void agregarAsiento(Asiento asiento) {
        asientos.add(asiento);
    }

    public boolean verificarDisponibilidad() {
        return asientos.stream().anyMatch(Asiento::isDisponible);
    }

    public Asiento obtenerAsientoDisponible() {
        return asientos.stream().filter(Asiento::isDisponible).findFirst().orElse(null);
    }
    
}

