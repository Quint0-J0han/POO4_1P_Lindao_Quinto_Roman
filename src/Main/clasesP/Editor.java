package clasesP
public class Editor extends Usuario {
    private List<Articulo> articulosAsignados;

    public Editor(String nombre, String correoElectronico, String contraseña, int numeroIdentificacion) {
        super(nombre, correoElectronico, contraseña, numeroIdentificacion);
        this.articulosAsignados = new ArrayList<>(); // Lista para almacenar los artículos asignados
    }

    // Métodos específicos para la clase Editor (asignarRevisor(), enviarComentario(), etc.)
