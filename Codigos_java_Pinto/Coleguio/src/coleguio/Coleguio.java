/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleguio;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author SENA
 */
public class Coleguio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Creacion de variables a usar
        
        int election = 0, j = 0, i = 0, primero = 0, segundo = 0, tercero = 0, cuarto = 0,quinto = 0,sexto = 0,septimo= 0,octavo = 0,noveno= 0, decimo= 0, once= 0;
        int alumnos;
        String nombre;
        Random number = new Random();
        
        int conteo[] = new int[11];
        
        //int intNumber = number.nextInt(100);
        
        //Nombre del Colegio
        System.out.println("Escribe el nombre del Colegio: ");
        nombre = sc.nextLine();
        
        //Usuario escoje cuantos salones hay
        System.out.println("Cuantos salones hay?: ");
        election = sc.nextInt();
        
        sc.nextLine();
        
        alumnos = 25 * election;
        
        
        int salones[] = new int[election];
        //Ver salones
        System.out.println("Salones: " + election);         
        
        for (i = 0; i < election; i++) {
            //Creacion del random
            int intNumber = number.nextInt(11);
            //---  ---
            j = j + 1;
            salones[i] = intNumber + 1;
            
            System.out.println("Salon " + j + ": " + salones[i]);
        }
        
        //Contar cuantos numeros hay de cada uno repetidos
        
        for (int k = 0; k < election; k++) {
            
            if (salones[k] == 1) {
                primero = primero + 1;
            }
            if (salones[k] == 2) {
                segundo = segundo + 1;
            }
            if (salones[k] == 3) {
                tercero = tercero + 1;
            }
            if (salones[k] == 4) {
                cuarto = cuarto + 1;
            }
            if (salones[k] == 5) {
                quinto = quinto + 1;
            }
            if (salones[k] == 6) {
                sexto = sexto + 1;
            }
            if (salones[k] == 7) {
                septimo = septimo + 1;
            }
            if (salones[k] == 8) {
                octavo = octavo + 1;
            }
            if (salones[k] == 9) {
                noveno = noveno + 1;
            }
            if (salones[k] == 10) {
                decimo = decimo + 1;
            }
            if (salones[k] == 11) {
                once = once + 1;
            }
        }
        //Mostrar todo
        System.out.println("El colegio " + nombre + " con " + election + "salones y "+ alumnos +" alumnos, tiene: ");
        System.out.println("Primero tiene " + primero + " salones");
        System.out.println("Segundo tiene " + segundo + " salones");
        System.out.println("Tercero tiene " + tercero + " salones");
        System.out.println("Cuarto tiene " + cuarto + " salones");
        System.out.println("Quinto tiene " + quinto + " salones");
        System.out.println("Sexto tiene " + sexto + " salones");
        System.out.println("Septimo tiene " + septimo + " salones");
        System.out.println("Octavo tiene " + octavo + " salones");
        System.out.println("Noveno tiene " + noveno + " salones");
        System.out.println("Decimo tiene " + decimo + " salones");
        System.out.println("Once tiene " + once + " salones");

        //Editar para crear una matriz que muestre 25 alumnos
    }
}
