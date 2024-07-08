package clasesP;
import java.util.Arrays;
import java.security.SecureRandom;

public class Articulo {

    private String titulo,codigo,resumen,contenido; //como se conforme un articulo
    private Autor autor;  //sera valido cuando se agregue la clase AUTOR
    private String[] palabrasClave;
    
    //Se inicializan las variables
    public Articulo(String titulo,String resumen,String contenido,Autor autor){
        this.titulo = titulo;
        this.resumen = resumen;
        this.contenido = contenido;
        this.autor = autor;
        this.codigo = generarCodigo();
    }

    //metodos get and set
    public String getTitulo(){
        return titulo;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getResumen(){
        return resumen;
    }
    public String getContenido(){
        return contenido;
    }
    public Autor getAutor(){
        return autor;
    }
    public String[] getPalabrasClave(){
        return palabrasClave;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setResumen(String resumen){
        this.resumen = resumen;
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    public void setPalabrasClave(String[] palabrasClave){
        this.palabrasClave = palabrasClave;
    }

    //Genracion de codigo aleatorio 
    private String generarCodigo(){
        String Caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom Random = new SecureRandom();
        StringBuilder codigo = new StringBuilder(6);
        for(int i;i<6;i++){
            int indiceAleatorio = Random.nextInt(Caracteres.length());
            codigo.append(Caracteres.charAt(indiceAleatorio));
        }
        return codigo.toString();
    }
    @Override
    public String toString(){
        return "Articulo [titulo: "+titulo+", codigo: "+codigo+
        ", resumen: "+resumen+", contenido: "+", autor: "+autor+", palabras clave: "+
        Arrays.toString(palabrasClave)+"]";
    }

}
