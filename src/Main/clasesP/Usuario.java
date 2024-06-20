package clasesP;
import java.util.Scanner;

public class Usuario {
  private String nombre;
    private String apellido;
    private String correoElectronico;
    private String usuario;
    private String contraseña;
    private char rol;

    public Usuario(String nombre, String apellido, String correoElectronico, String usuario, String contraseña, char rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }
}
