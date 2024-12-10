/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservas;

/**
 *
 * @author richardo
 */
public class AsientoFactory {
    
    public static Asiento crearAsiento(String tipo, Integer id) {
        Asiento asiento = switch (tipo.toLowerCase()) {
            case "economico" -> new AsientoEconomico(id);
            case "ejecutivo" -> new AsientoEjecutivo(id);
            case "primeraclase" -> new AsientoPrimeraClase(id);
            default -> throw new IllegalArgumentException("Tipo de asiento no reconocido");
        };
        return asiento;
    }
    
}
