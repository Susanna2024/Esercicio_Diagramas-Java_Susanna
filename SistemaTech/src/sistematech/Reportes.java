/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematech;


import java.util.Date; // Importaci�n para la clase Date
import sistematech.Reserva; // Importaci�n para la clase Reserva

public class Reportes {
    private int id; // Identificador del reporte
    private Date fechaReporte; // Fecha del reporte
    private String descripcionReporte; // Descripci�n del reporte
    private Reserva reserva; // Referencia a la reserva relacionada con el reporte

    // Constructor para inicializar los atributos de Reportes
    public Reportes(int id, Date fechaReporte, String descripcionReporte, Reserva reserva) {
        this.id = id;
        this.fechaReporte = fechaReporte;
        this.descripcionReporte = descripcionReporte;
        this.reserva = reserva;
    }

    // M�todos getter para obtener informaci�n del reporte
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

    // M�todos setter para modificar atributos del reporte
    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte; // Cambia la fecha del reporte
    }

    public void setDescripcionReporte(String descripcionReporte) {
        this.descripcionReporte = descripcionReporte; // Cambia la descripci�n del reporte
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva; // Cambia la reserva relacionada con el reporte
    }
}

