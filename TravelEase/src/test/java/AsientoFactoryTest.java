import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AsientoFactoryTest {

    @Test
    void testCrearAsientoEconomico() {
        Asiento asiento = AsientoFactory.crearAsiento("economico", 4);
        assertTrue(asiento instanceof AsientoEconomico);
    }

    @Test
    void testCrearAsientoEjecutivo() {
        Asiento asiento = AsientoFactory.crearAsiento("ejecutivo", 5);
        assertTrue(asiento instanceof AsientoEjecutivo);
    }

    @Test
    void testCrearAsientoPrimeraClase() {
        Asiento asiento = AsientoFactory.crearAsiento("primeraclase", 6);
        assertTrue(asiento instanceof AsientoPrimeraClase);
    }

    @Test
    void testCrearAsientoConTipoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> AsientoFactory.crearAsiento("lujo", 7));
    }
}
