package Incidencia;


class AgenteSoporte {
    
    private String idAgente;
    private String nombre;

    public AgenteSoporte(String idAgente, String nombre) {
        this.idAgente = idAgente;
        this.nombre = nombre;
    }

    public String getIdAgente() {
        return idAgente;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void revisarYAnalizar(Incidencia incidencia) {
        System.out.println("Revisando y analizando reporte...");
        if (!resolverProblema(incidencia)) {
            escalarIncidencia(incidencia, getDepartment());
        } else {
            incidencia.notificarEstado("Resuelto");
        }
    }

    public boolean resolverProblema(Incidencia incidencia) {
        boolean resuelto = Math.random() > 0.5;
        if (resuelto) {
            incidencia.setEstado("Resuelta");
            System.out.println("La incidencia ha sido resuelta.");
        } else {
            incidencia.setEstado("No resuelta");
            System.out.println("No se pudo resolver la incidencia.");
        }
        return resuelto;
    }

    public void escalarIncidencia(Incidencia incidencia, DepartamentoServicioCliente departament) {
        System.out.println("Escalando incidencia al Departamento de Servicio al Cliente...");
        incidencia.setEstado("Escalada");
        departament.trabajarEnResolucion(incidencia);
    }
    
    public DepartamentoServicioCliente getDepartment(){
        return new DepartamentoServicioCliente();
    }
    
}