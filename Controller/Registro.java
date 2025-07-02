package Controller;

public class Registro {
    
    public String registrarUsuario(String nombre, String email, String password) {
        if (nombre == null || nombre.isEmpty() || email == null || email.isEmpty() || password == null || password.isEmpty()) {
            return "Todos los campos son obligatorios.";
        }
        return "Usuario registrado exitosamente: " + nombre;
    }

}
