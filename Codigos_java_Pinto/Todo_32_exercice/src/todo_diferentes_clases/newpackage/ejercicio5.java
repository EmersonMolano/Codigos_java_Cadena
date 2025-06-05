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
public class ejercicio5 {
    public static inicial in=new inicial();
    
    public static void ejercicio5(){
    System.out.println("Ejercicio 5: Planilla");
    // Operación
    System.out.print("Ingrese el número de horas trabajadas en el mes: ");
    in.numberOne = scanner.nextDouble();
    System.out.print("Ingrese la tarifa por hora: ");
    in.numberTwo = scanner.nextDouble();
    in.result = in.numberOne * in.numberTwo;
    // Mostrar resultado
    System.out.println("La planilla es: " + in.result);
    }
    
    
}
