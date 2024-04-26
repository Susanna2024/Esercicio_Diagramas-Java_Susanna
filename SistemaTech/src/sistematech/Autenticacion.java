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

    // M�todo para validar credenciales
    public boolean validarCredenciales(String email, String contrasena) {
        // Valida si el email y la contrase�a coinciden con los datos del usuario
        return this.emailUsuario.equals(email) && this.contrasenaUsuario.equals(contrasena);
    }

    // M�todo para cambiar la contrase�a
    public boolean cambiarContrasena(String nuevaContrasena) {
        this.contrasenaUsuario = nuevaContrasena; // Cambia la contrase�a del usuario
        return true; // Retorna true si el cambio fue exitoso
    }

    // M�todo para recuperar la contrase�a
    public boolean recuperarContrasena(String email, int intentos) {
        if (intentos >= 3 && this.emailUsuario.equals(email)) {
            this.contrasenaUsuario = "nuevaContrasena"; // Asigna una nueva contrase�a
            return true; // Recuperaci�n exitosa
        }
        return false; // Recuperaci�n fallida
    }

 
}
