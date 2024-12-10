/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservas;

/**
 *
 * @author richardo
 */
public class VehiculoFactory {
    
    public static Vehiculo crearVehiculo(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "economico" -> new VehiculoEconomico();
            case "suv" -> new VehiculoSUV();
            case "lujo" -> new VehiculoLujo();
            default -> throw new IllegalArgumentException("Tipo de vehículo no reconocido");
        };
    }
    
}
