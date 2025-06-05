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

public class ejercicio15 {
    public static inicial in = new inicial();
    
    public static void ejercicio15(){
        System.out.println("Ejercicio 15: Bonificación de Ventas");
        // Operación
        System.out.print("Ingrese el monto de venta: ");
        in.numberOne = scanner.nextDouble();
        in.result = 0; // Inicializamos result
        if (in.numberOne >= 0 && in.numberOne < 1000) {
            in.result = 0;
        } else if (in.numberOne >= 1000 && in.numberOne < 5000) {
            in.result = (3 * in.numberOne) / 100;
        } else if (in.numberOne >= 5000 && in.numberOne < 20000) {
            in.result = (5 * in.numberOne) / 100;
        } else if (in.numberOne >= 20000) {
            in.result = (8 * in.numberOne) / 100;
        }
        // Mostrar resultado
        System.out.println("La bonificación es: " + in.result);    
    }    
}
