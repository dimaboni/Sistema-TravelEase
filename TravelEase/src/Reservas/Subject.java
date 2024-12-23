/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author richardo
 */
public class Subject {
    
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Reserva reserva) {
        for (Observer observer : observers) {
            observer.actualizarReserva(reserva);
        }
    }
    
}
