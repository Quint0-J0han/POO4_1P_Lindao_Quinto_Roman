package clasesP;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
      public void SubirDoc(Articulo articulo){
        String revisor="";
        int revisores=0;
        String filePath = "src/main/archivos/Usuarios.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] datos=line.split(",");
                if(datos[2].charAt(0)=='R'){
                    revisor=datos[0];
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
/*Subir articulo a revision*/
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/archivos/Seguimiento.txt", true))) {
            String contenido=this.getNombre()+","+articulo.getCodigo()+","+revisor+"\n";
            writer.write(contenido);
            System.out.println("Articulo puesto en revision");
         
        
    }catch(Exception e){
        System.out.println("Articulo no subido");
/*subir info de autor*/
    } try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/archivos/Autor.txt", true))) {
            String contenido=this.toString()+"\n";
            writer.write(contenido);
          
        
    }catch(Exception e){
        
    }
    /*Subir articulo*/
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/archivos/Articulos.txt", true))) {
            String contenido=articulo.toString()+"\n";
            writer.write(contenido);
          
    }catch(Exception e){
        
    }
}

}