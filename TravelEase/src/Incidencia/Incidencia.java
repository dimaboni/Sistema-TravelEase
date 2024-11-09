/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Incidencia;

import java.util.Date;

/**
 *
 * @author richardo
 */
class Incidencia {
    private String descripcion;
    private Date fechaReporte;
    private AgenteSoporte agenteAsignado;
    private String estado;

    public Incidencia(String descripcion) {
        this.descripcion = descripcion;
        this.fechaReporte = new Date();
        this.estado = "Abierta";
    }

    public void reportarIncidencia() {
        System.out.println("Incidencia reportada: " + descripcion);
        notificarAgente();
    }

    public void notificarAgente() {
        this.agenteAsignado = new AgenteSoporte("AS001", "Juan Perez");
        System.out.println("Notificando al agente: " + agenteAsignado.getNombre());
        agenteAsignado.revisarYAnalizar(this);
    }

    

    public void trabajarEnResolucion() {
        // El Departamento de Servicio al Cliente trabaja en la resolución
        System.out.println("Trabajando en la resolución de la incidencia...");
        notificarEstado("En Progreso");
        // Simula la resolución posterior
        this.estado = "Resuelta";
        System.out.println("La incidencia ha sido resuelta por el Departamento de Servicio al Cliente.");
        notificarEstado(this.estado);
    }

    public void notificarEstado(String estado) {
        System.out.println("Notificando estado de la incidencia: " + estado);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String e){
        this.estado = e;
    }
}