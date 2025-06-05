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

public class ejercicio30{
    public static inicial in = new inicial();
    
    public static void ejercicio30(){
        System.out.println("Ejercicio 30: Promedio de Dos Números");
        // Operación
        System.out.print("Ingrese el primer número: ");
        in.numberOne = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        in.numberTwo = scanner.nextDouble();
        in.result = (in.numberOne + in.numberTwo) / 2;
        // Mostrar resultado
        System.out.println("El promedio es: " + in.result);
    }    
}
