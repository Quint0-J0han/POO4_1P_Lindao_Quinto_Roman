package clasesP;
import clasesP.Usuario;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main{
    private static ArrayList<Usuario> Usuarios=new ArrayList<>();
    private static ArrayList<Articulo> Articulos=new ArrayList<>();
    public static Usuario usuario_act=null;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean verificar=true;
        ArrayList<Articulo> arti=new ArrayList<>();
        CargarUsuarios();
        int opc;

    }
    public static void CargarUsuarios(){
        String rutaArchivo=""
    }
}