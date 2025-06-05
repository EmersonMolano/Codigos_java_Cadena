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

public class ejercicio6 {
    public static inicial in = new inicial();
    public static void ejercicio6(){
    System.out.println("Ejercicio 6: Área del Triángulo");
    // Operación
    System.out.print("Ingrese la longitud del lado A: ");
    in.numberOne = scanner.nextDouble();
    System.out.print("Ingrese la longitud del lado B: ");
    in.numberTwo = scanner.nextDouble();
    System.out.print("Ingrese la longitud del lado C: ");
    in.numberThree = scanner.nextDouble();
    in.result = (in.numberOne + in.numberTwo + in.numberThree) / 2;
    in.result = Math.sqrt(in.result * (in.result - in.numberOne) * (in.result - in.numberTwo) * (in.result - in.numberThree));
    // Mostrar resultado
    System.out.println("El área del triángulo es: " + in.result);
    }
}
