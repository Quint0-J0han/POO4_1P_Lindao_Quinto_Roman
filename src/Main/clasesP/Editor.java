package clasesP;


public class Editor extends Usuario {
    private String journal;
    
    public Editor(String user, String Contrasenia, String contraseña,char rol,String nombre,String apellido,String journal) {
        super(user, Contrasenia,rol, nombre, apellido);
        this.journal =journal;
        GenerarCorreo(); 
}

 @Override
 public void GenerarCorreo(){
    this.setCorreoElectronico(this.getUser()+"@gmail.com");
 }
 public String getJournal(){
    return journal;
 }
 public void setJournal(String journal){
    this.journal= journal;
 }