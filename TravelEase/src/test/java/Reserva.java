import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void testConfirmarReserva() {
        Reserva reserva = new Reserva("R001", new Date());
        assertEquals("pendiente", reserva.getEstado());
        reserva.confirmar();
        assertEquals("confirmado", reserva.getEstado());
    }

    @Test
    void testSetEstadoReserva() {
        Reserva reserva = new Reserva("R002", new Date());
        reserva.setEstado("cancelado");
        assertEquals("cancelado", reserva.getEstado());
    }
}
