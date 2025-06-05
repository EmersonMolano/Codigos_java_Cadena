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

public class ejercicio7 {
    public static inicial in = new inicial();
    public static void ejercicio7(){
        System.out.println("Ejercicio 7: Respaldo en CDs");
        // Operación
        System.out.print("Ingrese gigabytes: ");
        in.numberOne = scanner.nextDouble();
        in.result = (in.numberOne * 1024) / 700;
        // Mostrar resultado
        System.out.println("Se necesitan " + (int)Math.ceil(in.result) + " CDs");
    }

}
