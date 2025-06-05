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

public class ejercicio20 {
    public static inicial in = new inicial();

    public static void ejercicio20(){
        System.out.println("Ejercicio 20: Promedio de Sueldos");
        // Operación
        System.out.print("Ingrese el número de empleados: ");
        in.intOne = scanner.nextInt();
        in.result = 0;
        for (in.intTwo = 1; in.intTwo <= in.intOne; in.intTwo++) {
            System.out.print("Ingrese el sueldo del empleado " + in.intTwo + ": ");
            in.numberOne = scanner.nextDouble();
            in.result += in.numberOne;
        }
        in.result = in.result / in.intOne;
        // Mostrar resultado
        System.out.println("El sueldo promedio es: " + in.result);
    }    
}
