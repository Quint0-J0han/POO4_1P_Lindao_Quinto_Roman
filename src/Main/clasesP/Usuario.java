package clasesP;

import java.util.ArrayList;

public abstract class Usuario {
    String nombre;
    String apellido;
    String correoElectronico;
    String user;
    String Contrasenia;
    char rol;

  public Usuario(String user , String Contrasenia,char rol,String nombre, String apellido) {
        this.user=user;
        this.Contrasenia=Contrasenia;
        this.rol=rol;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.Contrasenia = contrasenia;
    }

    public char getRol() {
        return rol;
    }

    public void setRol(char rol) {
        this.rol = rol;
    }
@Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", correoElectronico=" + correoElectronico
                + "]";
    }
    public abstract void GenerarCorreo();

}

