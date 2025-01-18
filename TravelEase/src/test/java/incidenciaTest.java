package Incidencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class IncidenciaTest {

    private Incidencia incidencia;
    private AgenteSoporte agente;
    private DepartamentoServicioCliente departamento;

    @BeforeEach
    void setUp() {
        incidencia = new Incidencia("Problema con la conexión a internet");
        agente = new AgenteSoporte("AS001", "Juan Perez");
        departamento = new DepartamentoServicioCliente();
    }

    @Test
    void testIncidenciaInicial() {
        assertEquals("Problema con la conexión a internet", incidencia.getDescripcion());
        assertEquals("Abierta", incidencia.getEstado());
        assertNotNull(incidencia.getDescripcion());
        assertTrue(incidencia.getEstado().equals("Abierta"));
    }

    @Test
    void testRevisarYAnalizar_resolverProblema() {
        incidencia.notificarAgente();

        // Comprobar que el agente revisa la incidencia
        String estado = incidencia.getEstado();
        assertTrue(estado.equals("Resuelta") || estado.equals("No resuelta") || estado.equals("Escalada"));
    }

    @Test
    void testEscalarIncidencia() {
        incidencia.notificarAgente();

        if (incidencia.getEstado().equals("Escalada")) {
            departamento.trabajarEnResolucion(incidencia);
            assertEquals("Resuelto", incidencia.getEstado());
        }
    }

    @Test
    void testDepartamentoResuelveIncidencia() {
        departamento.trabajarEnResolucion(incidencia);
        assertEquals("Resuelto", incidencia.getEstado());
    }

    @Test
    void testNotificarEstado() {
        incidencia.notificarEstado("En Progreso");
        assertEquals("En Progreso", incidencia.getEstado());
    }

    @Test
    void testReportarIncidencia() {
        incidencia.reportarIncidencia();

        // Validar el flujo inicial del reporte
        assertNotNull(incidencia);
        assertNotNull(incidencia.getDescripcion());
        assertNotNull(agente);
        assertEquals("Abierta", incidencia.getEstado());
    }

    @Test
    void testSetEstado() {
        incidencia.setEstado("Resuelta");
        assertEquals("Resuelta", incidencia.getEstado());
    }
}
