import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AsientoEconomicoTest {

    @Test
    void testCrearAsientoEconomico() {
        AsientoEconomico asientoEconomico = new AsientoEconomico(2);
        assertNotNull(asientoEconomico);
        assertTrue(asientoEconomico.isDisponible());
    }
}