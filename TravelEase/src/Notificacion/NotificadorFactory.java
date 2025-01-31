package Notificacion;

public class NotificadorFactory {

    public static Notificador crearNotificador(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "email" -> new NotificadorEmail();
            case "whatsapp" -> new NotificadorWhatsapp();
            default -> throw new IllegalArgumentException("Tipo de notificador no reconocido: " + tipo);
        };
    }
    
}
