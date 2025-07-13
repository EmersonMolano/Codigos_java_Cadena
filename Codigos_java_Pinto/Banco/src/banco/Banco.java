/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author SENA
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Creacion de Variables
        String nombreCiudad, nombreBanco;
        
        
        
        //Numero Random
        Random number = new Random();
        int randomNumber = number.nextInt(100);
        
        //Asignacion de nombres
        System.out.println("Cual es el nombre de tu Ciudad?");
        nombreCiudad = sc.nextLine();
        
        System.out.println("Cual es el nombre de tu Banco?");
        nombreBanco = sc.nextLine();
        
        for (int k = 0; k <= 10; k++) {
            
        }
    
    }
    
}
