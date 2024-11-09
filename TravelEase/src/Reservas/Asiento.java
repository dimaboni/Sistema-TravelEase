/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservas;


public class Asiento {
    
    private int idAsiento;
    private boolean disponibilidad;

    public Asiento(int idAsiento) {
        this.idAsiento = idAsiento;
        this.disponibilidad = true;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
