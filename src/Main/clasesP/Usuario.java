/*Axel Roman*/
package clasesP;

public class Usuario {
  private String nombre;
    private String apellido;
    private String correoElectronico;
    private String usuario;
    private String contraseña;
    private String rol;

    public Usuario(String nombre, String apellido, String correoElectronico, String usuario, String contraseña, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }
  public void iniciarSesion() {
        System.out.println("Iniciando sesión como " + this.usuario);
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
//hola
