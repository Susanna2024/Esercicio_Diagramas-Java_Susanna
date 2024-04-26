/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package sistematech;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
    private int id;
    private Date fechaReservaInicio;
    private Date fechaReservaFin;
    private int horaInicio;
    private int horaFin;
    private Sala sala;
    private float precio;
    private String estadoReserva;
    private Cliente usuario;
    private String codigoReserva;

    // Constructor para inicializar la reserva
    public Reserva(int id, Date fechaReservaInicio, Date fechaReservaFin, int horaInicio, int horaFin, Sala sala, float precio, String estadoReserva, Cliente usuario, String codigoReserva) {
        this.id = id;
        this.fechaReservaInicio = fechaReservaInicio;
        this.fechaReservaFin = fechaReservaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin; // Corregido error tipográfico (oraFine -> horaFin)
        this.sala = sala;
        this.precio = precio;
        this.estadoReserva = estadoReserva;
        this.usuario = usuario;
        this.codigoReserva = codigoReserva;
    }

    // Método para crear una reserva
    public boolean crearReserva(int id, Date fechaReservaInicio, Date fechaReservaFin, int horaInicio, int horaFin, Sala sala, float precio, String estadoReserva, Cliente usuario, String codigoReserva) {
        // Lógica para crear una reserva
        return true; // Ejemplo de retorno para indicar éxito
    }

    // Método para filtrar salas disponibles según el criterio dado
    public List<Sala> filtrarDispoSalas(Sala filtroDispo) {
        List<Sala> salasDisponibles = new ArrayList<>();
        // Lógica para filtrar salas según el criterio
        return salasDisponibles;
    }

    // Método para seleccionar una reserva
    public Reserva seleccionarReserva(Reserva infoReserva) {
        // Lógica para seleccionar una reserva específica
        return infoReserva;
    }

  
    // Método para cancelar una reserva
    public void cancelarReserva() {
        // Lógica para cancelar una reserva
    }
}

