/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificacion;

/**
 *
 * @author richardo
 */
public class NotificadorWhatsapp implements Notificador {
    
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por WhatsApp: " + mensaje);
    }
    
}
