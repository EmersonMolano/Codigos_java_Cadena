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

public class ejercicio8 {
    public static inicial in = new inicial();
    public static void ejercicio8(){
        System.out.println("Ejercicio 8: Distancia entre Puntos");
        // Operación
        System.out.print("Ingrese x1: ");
        in.numberOne = scanner.nextDouble();
        System.out.print("Ingrese y1: ");
        in.numberTwo = scanner.nextDouble();
        System.out.print("Ingrese x2: ");
        in.numberThree = scanner.nextDouble();
        System.out.print("Ingrese y2: ");
        in.result = scanner.nextDouble();
        // Mostrar resultado
        System.out.println("La distancia es: " + Math.sqrt(Math.pow(in.numberThree - in.numberOne, 2) + Math.pow(in.result - in.numberTwo, 2)));
    }    
    
    
}
