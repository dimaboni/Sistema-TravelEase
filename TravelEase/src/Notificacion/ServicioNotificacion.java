/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificacion;

/**
 *
 * @author richardo
 */
public class ServicioNotificacion {
    
    private Notificador notificador;

    public ServicioNotificacion(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviarNotificacion(String mensaje) {
        notificador.enviarNotificacion(mensaje);
    }
    
}
