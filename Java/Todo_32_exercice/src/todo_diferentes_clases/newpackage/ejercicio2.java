package todo_diferentes_clases.newpackage;

/*
  Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
import static todo_diferentes_clases.newpackage.inicial.scanner;

import todo_diferentes_clases.newpackage.inicial;

/**
 *
 * @author SENA
 */
public class ejercicio2 /*extends inicial*/{
    //Esto hace que pueda usar el scanner de la clase inicial y tambien me ayuda a usar las variables de "inicial"
    public static inicial in = new inicial();
    
    static void ejercicio2(){
        System.out.println("Ejercicio 2: Promedio Simple");
        // Operación
        System.out.print("Ingrese la primera nota: ");
        in.numberOne = scanner.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        in.numberTwo = scanner.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        in.numberThree = scanner.nextDouble();
        in.result = (in.numberOne + in.numberTwo + in.numberThree) / 3;
        // Mostrar resultado
        System.out.println("El promedio es: " + in.result);   
    }    
}
