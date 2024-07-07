package clasesP;
import java.util.Scanner;

public class Articulo {
    /*
     * 
     * un articulo solo tiene un autor
     * tienen un codigo unico que genera el sistema
     * datos ingresados (titulo, resumen, contenido, palabras clave)
     * Luego, enviarse a revision
     * 
     */
    private int codigoUnico=(int)(Math.random()*1000); //genera un codigo para el articulo
    private String titulo,resumen,contenido,wordClave;
    /*
     * 
     * Usuario persona = new Usuario(); llama a la clase usuario
     * Autor escritor = new Autor();
     * 
     * nombre = persona.getNombre(); Se toma el nombre de la clase Usuario
     * codigoID = escritor.getCodigoID(); Se toma su codigo de ID de la clase Autor
     * 
     */
    Articulo(String nombre,int codigoID,int codigoUnico){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titulo de su obra: ");
        titulo = sc.next();
        sc.next();
        System.out.println("Ingrese el resumen: ");
        resumen = sc.nextLine();
        sc.next();
        System.out.println("Ingrese el contenido: ");
        contenido = sc.nextLine();
        sc.next();
        System.out.println("Ingrese las palabras clave: ");
        wordClave = sc.nextLine();
        sc.close();

    }

    public String getTitulo(){
        return titulo;
    }
    public String getResumen(){
        return resumen;
    }
    public String getContenido(){
        return contenido;
    }
    public String getWordClave(){
        return wordClave;
    }

}
