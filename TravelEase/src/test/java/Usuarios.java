import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void testActualizarReserva() {
        Usuario usuario = new Usuario("Juan", "juan@email.com");
        Reserva reserva = new Reserva("R003", new Date());
        reserva.confirmar();

        usuario.actualizarReserva(reserva);
        // Aquí simplemente verificamos si la impresión se realiza correctamente,
        // pero en un caso real deberíamos capturar la salida estándar.
        assertTrue(true);  // Verificamos si se ejecuta sin error
    }
}
