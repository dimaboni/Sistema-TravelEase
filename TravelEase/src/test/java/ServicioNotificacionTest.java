package Notificacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicioNotificacionTest {

    @Test
    void testNotificacionEmail() {
        ServicioNotificacion servicio = ServicioNotificacion.getInstance();
        Notificador notificadorEmail = new NotificadorEmail();

        // Simular envío de notificación
        servicio.enviarNotificacion(notificadorEmail, "Mensaje de prueba por correo");
        assertNotNull(servicio, "La instancia del servicio de notificación no debería ser nula");
    }

    @Test
    void testNotificacionWhatsapp() {
        ServicioNotificacion servicio = ServicioNotificacion.getInstance();
        Notificador notificadorWhatsapp = new NotificadorWhatsapp();

        // Simular envío de notificación
        servicio.enviarNotificacion(notificadorWhatsapp, "Mensaje de prueba por WhatsApp");
        assertNotNull(servicio, "La instancia del servicio de notificación no debería ser nula");
    }

    @Test
    void testSingleton() {
        ServicioNotificacion instancia1 = ServicioNotificacion.getInstance();
        ServicioNotificacion instancia2 = ServicioNotificacion.getInstance();

        // Verificar que ambas referencias apuntan a la misma instancia
        assertSame(instancia1, instancia2, "El patrón Singleton debería devolver la misma instancia");
    }
}
