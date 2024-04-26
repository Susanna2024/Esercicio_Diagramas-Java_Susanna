/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistematech;

import java.util.*; // Importaciones generales para utilidades
import sistematech.*; // Importación de todas las clases en el paquete sistematech

public class SistemaTech {
    private int id;

    public static void main(String[] args) {
        // Punto de entrada para el programa
        System.out.println("Bienvenido a SistemaTech!");

        // Creación de instancias para probar el sistema

        // Usuarios y sus subclases
        Usuario usuario = new Usuario("Juan", "Pérez", "Cliente", 1, "juan@example.com", "password123");
        Cliente cliente = new Cliente("Pedro", "Gómez", "Cliente", 2, "pedro@example.com", "password456", 123456789);
        Empleado empleado = new Empleado("María", "Rodríguez", "Empleado", 3, "maria@example.com", "password789", 987654321);
        Administrador admin = new Administrador("Ana", "López", "Administrador", 4, "ana@example.com", "adminpass");

         // Crear un equipamiento usando el constructor corregido
        Equipamiento equipamiento = new Equipamiento(1, 1, 0); // ID, proyector, sistema de video

     // Reserva y Reportes
Sala sala = new Sala(1, 50.0f, 10, true, "Ubicación de ejemplo", null, "Sala de conferencias"); // Crear una instancia de Sala
Reserva reserva = new Reserva(1, new Date(), new Date(), 10, 12, sala, 100.0f, "Confirmado", cliente, "COD123"); // Usa la instancia de Sala
Reportes reporte = new Reportes(1, new Date(), "Reporte de Ejemplo", reserva); // Usa la instancia de Reserva

        // Recordatorios y Seguridad
        Recordatorios recordatorio = new Recordatorios(1, new Date(), reserva, cliente);
        Seguridad seguridad = new Seguridad();

        // Pagos
        Pago pago = new Pago(1, "Pago con tarjeta");

        // Operaciones adicionales para el sistema...
    }
}
