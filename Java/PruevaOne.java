/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruevaone;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class PruevaOne{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Declarar variables
        int number, i, election;
        double j;
        //Dar valor a "number"
        System.out.println("Cuantas veces quieres hacerlo?:");
        number = scanner.nextInt();
        
        //Siclo de verificacion
        while(number > 500){
            
            System.out.println("No se pueden hacer mas de 500 por favor dijite otro valor: ");
            number = scanner.nextInt();
            
        }
        
        //Eleccion
        System.out.println("¿Que quieres hallar?");
        System.out.println("1. Números primos. ");
        System.out.println("2. Números impares. ");
        System.out.println("3. Números pares. ");
        election = scanner.nextInt();
        
        //Operacion por cada caso
        switch(election){
            case 1:
                System.out.println("Los primos son: ");
                for (i = 2; i <= number;i++){
                    boolean esPrimo = true;
                    
                    for (j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo) {
                        System.out.println(i);
                    }
                }
                
                break;            
            case 2:
                for (i = 1; i <= number;i+=2){
                    System.out.println("El número impar es: " + i);
                } 
                break;
            case 3:
                for (i = 1; i <= number; i ++ ){
                    if(i%2 == 0){
                    System.out.println("El número par es: " + i);
                    }
                } 
                break;        
        }      
        scanner.close();
    }
}
