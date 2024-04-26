/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematech;


import java.util.Date; // Importaci�n para la clase Date
import sistematech.Reserva; // Importaci�n para la clase Reserva
import sistematech.Cliente; // Importaci�n para la clase Cliente

public class Recordatorios {
    private int id; 
    private Date fecha; // Fecha del recordatorio
    private Reserva reserva; // Reserva asociada al recordatorio
    private Cliente usuario; // Cliente asociado al recordatorio

    // Constructor para inicializar los atributos de Recordatorios
    public Recordatorios(int id, Date fecha, Reserva reserva, Cliente usuario) {
        this.id = id;
        this.fecha = fecha;
        this.reserva = reserva;
        this.usuario = usuario;
    }

    // M�todos getter para obtener informaci�n de Recordatorios
    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    // M�todo para crear un recordatorio
    public boolean crearRecordatorio(String mensajeRecordatorio) {
        // L�gica para crear un recordatorio
        // Se puede enviar por SMS o correo electr�nico
        // Retorna true si se crea el recordatorio exitosamente
        return true; // Ejemplo de retorno
    }
}

