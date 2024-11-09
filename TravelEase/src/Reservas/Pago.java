/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservas;


class Pago {
    
    private double monto;
    private String metodo;

    public Pago(double monto, String metodo) {
        this.monto = monto;
        this.metodo = metodo;
    }

    public boolean verificarFondos() {
        return true;
    }
}