/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservas;


public class Usuario implements Observer{
    
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void actualizarReserva(Reserva reserva) {
        
         System.out.println("Hola " + nombre + ", el estado de tu reserva con ID " 
                           + reserva.getIdReserva() + " ha cambiado a: " + reserva.getEstado());
        
    }
    
}
