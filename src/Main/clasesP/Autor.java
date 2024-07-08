package clasesP;

public class Autor {
    private String nombre;
    private String apellido;
    private String institucion;
    private String Area_investigacion;
    private int codigo;

    public Autor(String nombre, String apellido, String institucion, String area_investigacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.institucion = institucion;
        Area_investigacion = area_investigacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getInstitucion() {
        return institucion;
    }

    public String getArea_investigacion() {
        return Area_investigacion;
    }

    public int getCodigo() {
        return codigo;
    }