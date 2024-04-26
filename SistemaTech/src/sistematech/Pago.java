/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematech;

public class Pago {
    private int id; 
    private String datosPago; // Detalles del pago (puede ser informaci�n de transacci�n)

    // Constructor para inicializar la clase Pagos
    public Pago(int id, String datosPago) {
        this.id = id;
        this.datosPago = datosPago;
    }

    // M�todos getter para obtener informaci�n de Pagos
    public int getId() {
        return id;
    }

    public String getDatosPago() {
        return datosPago;
    }

    // M�todo para establecer nuevos datos de pago
    public void setDatosPago(String datosPago) {
        this.datosPago = datosPago;
    }

    // M�todo para pagar una reserva
    public Pago pagarReserva(Pago pago) {
        // L�gica para procesar el pago de una reserva
        // Retorna la instancia de Pagos como confirmaci�n
        return pago; // Retorno simple para indicar �xito
    }
}
