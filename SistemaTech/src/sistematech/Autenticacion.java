/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematech;

import java.util.*;

public class Autenticacion {
    private int id;
    private int idUsuario;
    private String contrasenaUsuario;
    private String emailUsuario;
    private String rolUsuario;
    
    // Constructor para inicializar la instancia de Autenticacion
    public Autenticacion(int id, int idUsuario, String emailUsuario, String contrasenaUsuario, String rolUsuario) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.emailUsuario = emailUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.rolUsuario = rolUsuario;
    }

    // Método para validar credenciales
    public boolean validarCredenciales(String email, String contrasena) {
        // Valida si el email y la contraseña coinciden con los datos del usuario
        return this.emailUsuario.equals(email) && this.contrasenaUsuario.equals(contrasena);
    }

    // Método para cambiar la contraseña
    public boolean cambiarContrasena(String nuevaContrasena) {
        this.contrasenaUsuario = nuevaContrasena; // Cambia la contraseña del usuario
        return true; // Retorna true si el cambio fue exitoso
    }

    // Método para recuperar la contraseña
    public boolean recuperarContrasena(String email, int intentos) {
        if (intentos >= 3 && this.emailUsuario.equals(email)) {
            this.contrasenaUsuario = "nuevaContrasena"; // Asigna una nueva contraseña
            return true; // Recuperación exitosa
        }
        return false; // Recuperación fallida
    }

 
}
