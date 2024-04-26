/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematech;


import java.util.Date; // Importación para la clase Date
import sistematech.Reserva; // Importación para la clase Reserva
import sistematech.Cliente; // Importación para la clase Cliente

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

    // Métodos getter para obtener información de Recordatorios
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

    // Método para crear un recordatorio
    public boolean crearRecordatorio(String mensajeRecordatorio) {
        // Lógica para crear un recordatorio
        // Se puede enviar por SMS o correo electrónico
        // Retorna true si se crea el recordatorio exitosamente
        return true; // Ejemplo de retorno
    }
}

