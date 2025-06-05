/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidimencional;
import java.util.Scanner;
/**
 *
 * @author SENA
 */
public class nombre {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Creacion de vectores
        String[] primerNombre = new String[2];
        String[] segundoNombre = new String[2];
        String[] primerApellido = new String[2];
        String[] segundoApellido = new String[2];
        
        //Asicnacion de nombres a vectores 
        for (int i = 0; i < 1; i++) {

        System.out.println("Escribe tu primer nombre: ");
        primerNombre[i] = sc.nextLine();
        
        System.out.println("Escribe tu segundo nombre: ");
        segundoNombre[i] = sc.nextLine();
        
        System.out.println("Escribe tu primer apellido: ");
        primerApellido[i] = sc.nextLine();
        
        System.out.println("Escribe tu segundo apellido: ");
        segundoApellido[i] = sc.nextLine();
        
        System.out.println("Tu nombre completo es: ");

        System.out.print(primerNombre[i] + " " + segundoNombre[i] + " " + primerApellido[i] + " " + segundoApellido[i]);            
        }
        

    }
    
}
