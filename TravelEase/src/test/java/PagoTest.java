import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagoTest {

    @Test
    void testVerificarFondos() {
        Pago pago = new Pago(100.0, "tarjeta");
        assertTrue(pago.verificarFondos());
    }
}