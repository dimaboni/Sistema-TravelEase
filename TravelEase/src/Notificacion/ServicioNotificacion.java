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
    
    private static ServicioNotificacion instancia;

    // Constructor privado para Singleton
    private ServicioNotificacion() {}

    // Método para obtener la instancia única
    public static ServicioNotificacion getInstancia() {
        if (instancia == null) {
            instancia = new ServicioNotificacion();
        }
        return instancia;
    }

    // Método para enviar notificaciones
    public void enviarNotificacion(Notificador notificador, String msg) {
        notificador.enviarNotificacion(msg);
    }
}
