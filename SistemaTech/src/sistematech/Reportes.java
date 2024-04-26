/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematech;


import java.util.Date; // Importación para la clase Date
import sistematech.Reserva; // Importación para la clase Reserva

public class Reportes {
    private int id; // Identificador del reporte
    private Date fechaReporte; // Fecha del reporte
    private String descripcionReporte; // Descripción del reporte
    private Reserva reserva; // Referencia a la reserva relacionada con el reporte

    // Constructor para inicializar los atributos de Reportes
    public Reportes(int id, Date fechaReporte, String descripcionReporte, Reserva reserva) {
        this.id = id;
        this.fechaReporte = fechaReporte;
        this.descripcionReporte = descripcionReporte;
        this.reserva = reserva;
    }

    // Métodos getter para obtener información del reporte
    public int getId() {
        return id;
    }

    public Date getFechaReporte() {
        return fechaReporte;
    }

    public String getDescripcionReporte() {
        return descripcionReporte;
    }

    public Reserva getReserva() {
        return reserva;
    }

    // Métodos setter para modificar atributos del reporte
    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte; // Cambia la fecha del reporte
    }

    public void setDescripcionReporte(String descripcionReporte) {
        this.descripcionReporte = descripcionReporte; // Cambia la descripción del reporte
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva; // Cambia la reserva relacionada con el reporte
    }
}

