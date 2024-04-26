/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematech;


public class Sala {
    private int id;
    private float superficieM2;
    private int capacidad;
    private boolean disponibilidad;
    private String ubicacion;
    private Equipamiento equipamiento;
    private String descripcion;

    // Constructor para inicializar los atributos de Sala
    public Sala(int id, float superficieM2, int capacidad, boolean disponibilidad, String ubicacion, Equipamiento equipamiento, String descripcion) {
        this.id = id;
        this.superficieM2 = superficieM2;
        this.capacidad = capacidad;
        this.disponibilidad = disponibilidad;
        this.ubicacion = ubicacion;
        this.equipamiento = equipamiento;
        this.descripcion = descripcion;
    }

    // Métodos getter para obtener información de la sala
    public int getId() {
        return id;
    }

    public float getSuperficieM2() {
        return superficieM2;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Equipamiento getEquipamiento() {
        return equipamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Métodos setter para modificar atributos de la sala
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setEquipamiento(Equipamiento equipamiento) {
        this.equipamiento = equipamiento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}

