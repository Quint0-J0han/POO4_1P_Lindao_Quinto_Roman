package clasesP;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Revisor extends Usuario {
    String especialidad;
    int numeroArticulos;
    public Revisor(String user,String Contrasenia,char rol,String nombre,
    String apellido,String especialidad,int numeroArticulos){
        super(user,Contrasenia,rol,nombre,apellido);
        GenerarCorreo();
    }
    
    
    
    @Override
    public void GenerarCorreo(){
        this.setCorreoElectronico(this.getUser()+"@gmail.com");
    }

    public void SubirRevision(Articulo arti, String comentarios){
        try(BufferedWriter writer = new BufferedWriter(
            new FileWriter("src/Main/archivos/Revision.txt",true))){
                String contenido = this.getNombre()+","+arti.getCodigo()+", comentarios: "
                +comentarios;
                writer.write(contenido);
                System.out.println("Articulo puesto en revision");
            }catch(Exception e){ 
                System.out.println("Articulo no subido");
            }
    }
}
