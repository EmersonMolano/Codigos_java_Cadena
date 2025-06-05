/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidimencional;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author SENA
 */
public class Unidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tamaño = new String [10];
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("DIjite el valor" + (i+1));
            tamaño[i] = sc.nextInt();
        }
        Arrays.sort(tamaño);
    
        for (int x = 0; x < 10; x++) {
            System.out.print(tamaño[x]);
        }
        */
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe el nombre: " + (i+1));
            System.out.print((i+1) + ". ");
            tamaño[i] = sc.nextLine();
        }
        System.out.println("Los nombres que tienes ingresados son: ");
        for (int x = 0; x < 10; x++) {
            
            System.out.println(tamaño[x]);
        }
    }
    
}
