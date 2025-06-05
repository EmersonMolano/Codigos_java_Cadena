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

public class ejercicio22 {
    public static inicial in = new inicial();    
    public static void ejercicio22(){
        System.out.println("Ejercicio 22: Multiplicación por Suma");
        // Operación
        System.out.print("Ingrese el primer número: ");
        in.intOne = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        in.intTwo = scanner.nextInt();
        in.result = 0;
        for (in.intThree = 1; in.intThree <= in.intTwo; in.intThree++) {
            in.result += in.intOne;
        }
        // Mostrar resultado
        System.out.println("El producto es: " + in.result);
    }
}
