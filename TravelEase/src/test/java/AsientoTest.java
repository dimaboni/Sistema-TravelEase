import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AsientoTest {

    @Test
    void testCrearAsiento() {
        Asiento asiento = new Asiento(1);
        assertNotNull(asiento);
        assertTrue(asiento.isDisponible());
    }

    @Test
    void testSetDisponibilidad() {
        Asiento asiento = new Asiento(1);
        asiento.setDisponibilidad(false);
        assertFalse(asiento.isDisponible());
    }
}
