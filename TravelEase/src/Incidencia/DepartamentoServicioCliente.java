/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Incidencia;

/**
 *
 * @author richardo
 */
public class DepartamentoServicioCliente {
    
    public void trabajarEnResolucion(Incidencia incidencia) {
        System.out.println("El Departamento de Servicio al Cliente está trabajando en la resolución de la incidencia.");
        incidencia.setEstado("Resuelto");
        incidencia.notificarEstado("Resuelto");
    }

    
}
