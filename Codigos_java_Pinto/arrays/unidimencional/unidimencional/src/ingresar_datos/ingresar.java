/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresar_datos;
import java.util.Scanner;
/**
 *
 * @author Emerson Calet Molano Cardozo
 */
public class ingresar {
    public static Scanner sc = new Scanner(System.in);
    
    //Creacion de vectores
    public static String[] primerNombre = new String[2];
    public static String[] segundoNombre = new String[2];
    public static String[] primerApellido = new String[2];
    public static String[] segundoApellido = new String[2];
    public static String[] email = new String[10];
    public static long[] telefono = new long[10];
    public static String[] direccion = new String[10];
    public static String[] profecion = new String[10];
    public static String[] rh = new String[10];
    public static String[] cedula = new String[10];
    
    
    public static int i, c = 0;
    
    public static void main(String[] args){
        
        int election;

        System.out.println("Puedes ingresar un maximo de 10 personas, elige la opcion que quieras hacer:");
        do {
            System.out.println("¿Que vas a hacer primero?");
            System.out.println("1. Ingresar persona.");
            System.out.println("2. Mostrar personas ingresadas.");
            System.out.println("3. Buscar personas.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            election = sc.nextInt();
            if(election < 0 || election > 33){
                while(election < 0 || election > 3){
                System.out.print("No se admiten valores fuera del rango admitodo, por favor ingresar otro: ");
                election = sc.nextInt();
                }
            }
            switch (election) {
                case 1:{
                    ingresar_datos.ingresar_datos();
                    break;
                    }
                case 2:{
                    mostrar_personas.mostrar_personas();
                    break;
                    }
                case 3:{
                    buscar.buscar();
                    break;
                    }
                default:
                    throw new AssertionError();
            }
            
        } while (election != 0);
        
    }
}
