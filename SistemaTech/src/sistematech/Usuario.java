/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematech;
import sistematech.Equipamiento;

import java.util.*;

// Importación de la clase Equipamiento
import sistematech.Equipamiento;

// Clase Usuario
public class Usuario {
    private String nombre;
    private String apellidos;
    private String rol;
    private int id;
    private String mail;
    private String contrasena;

    public Usuario(String nombre, String apellidos, String rol, int id, String mail, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rol = rol;
        this.id = id;
        this.mail = mail;
        this.contrasena = contrasena;
    }

    public boolean iniciarSesion(String mail, String contrasena) {
        // Validar credenciales con la clase Autenticacion
        Autenticacion autenticacion = new Autenticacion(1, this.id, this.mail, this.contrasena, this.rol);
        return autenticacion.validarCredenciales(mail, contrasena);
    }

    public void cerrarSesion() {
        // Lógica para cerrar sesión
    }
}

// Subclase Cliente
class Cliente extends Usuario {
    private int telefono;

    public Cliente(String nombre, String apellidos, String rol, int id, String mail, String contrasena, int telefono) {
        super(nombre, apellidos, rol, id, mail, contrasena);
        this.telefono = telefono;
    }
}

// Subsubclase Empleado
class Empleado extends Cliente {
    public Empleado(String nombre, String apellidos, String rol, int id, String mail, String contrasena, int telefono) {
        super(nombre, apellidos, rol, id, mail, contrasena, telefono);
    }
}

// Subsubclase Cliente_Externo
class Cliente_Externo extends Cliente {
    public Cliente_Externo(String nombre, String apellidos, String rol, int id, String mail, String contrasena, int telefono) {
        super(nombre, apellidos, rol, id, mail, contrasena, telefono);
    }
}

// Subclase Administrador
class Administrador extends Usuario {
    public Administrador(String nombre, String apellidos, String rol, int id, String mail, String contrasena) {
        super(nombre, apellidos, rol, id, mail, contrasena);
    }

    public List<Reportes> consultarReportes() {
        // Lógica para consultar reportes
        return new ArrayList<>(); // Retorna una lista de reportes
    }


    public boolean modificarEquipamiento(int id) {
        // Lógica para modificar equipamiento
        return true; // Retorna true si el cambio fue exitoso
    }

    public void eliminarEquipamiento(int id) {
        // Lógica para eliminar equipamiento
    }
}
