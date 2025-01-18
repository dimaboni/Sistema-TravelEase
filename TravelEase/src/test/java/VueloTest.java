import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VueloTest {

    @Test
    void testAgregarAsiento() {
        Vuelo vuelo = new Vuelo("V001", "10:00");
        Asiento asiento = new Asiento(1);
        vuelo.agregarAsiento(asiento);
        assertTrue(vuelo.verificarDisponibilidad());
    }

    @Test
    void testObtenerAsientoDisponible() {
        Vuelo vuelo = new Vuelo("V002", "15:00");
        Asiento asiento = new Asiento(2);
        vuelo.agregarAsiento(asiento);
        Asiento asientoDisponible = vuelo.obtenerAsientoDisponible();
        assertNotNull(asientoDisponible);
        assertTrue(asientoDisponible.isDisponible());
    }
}
