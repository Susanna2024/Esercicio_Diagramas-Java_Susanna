/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematech;

public class Pago {
    private int id; 
    private String datosPago; // Detalles del pago (puede ser información de transacción)

    // Constructor para inicializar la clase Pagos
    public Pago(int id, String datosPago) {
        this.id = id;
        this.datosPago = datosPago;
    }

    // Métodos getter para obtener información de Pagos
    public int getId() {
        return id;
    }

    public String getDatosPago() {
        return datosPago;
    }

    // Método para establecer nuevos datos de pago
    public void setDatosPago(String datosPago) {
        this.datosPago = datosPago;
    }

    // Método para pagar una reserva
    public Pago pagarReserva(Pago pago) {
        // Lógica para procesar el pago de una reserva
        // Retorna la instancia de Pagos como confirmación
        return pago; // Retorno simple para indicar éxito
    }
}
