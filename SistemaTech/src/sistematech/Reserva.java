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
        this.horaFin = horaFin; // Corregido error tipogr�fico (oraFine -> horaFin)
        this.sala = sala;
        this.precio = precio;
        this.estadoReserva = estadoReserva;
        this.usuario = usuario;
        this.codigoReserva = codigoReserva;
    }

    // M�todo para crear una reserva
    public boolean crearReserva(int id, Date fechaReservaInicio, Date fechaReservaFin, int horaInicio, int horaFin, Sala sala, float precio, String estadoReserva, Cliente usuario, String codigoReserva) {
        // L�gica para crear una reserva
        return true; // Ejemplo de retorno para indicar �xito
    }

    // M�todo para filtrar salas disponibles seg�n el criterio dado
    public List<Sala> filtrarDispoSalas(Sala filtroDispo) {
        List<Sala> salasDisponibles = new ArrayList<>();
        // L�gica para filtrar salas seg�n el criterio
        return salasDisponibles;
    }

    // M�todo para seleccionar una reserva
    public Reserva seleccionarReserva(Reserva infoReserva) {
        // L�gica para seleccionar una reserva espec�fica
        return infoReserva;
    }

  
    // M�todo para cancelar una reserva
    public void cancelarReserva() {
        // L�gica para cancelar una reserva
    }
}

