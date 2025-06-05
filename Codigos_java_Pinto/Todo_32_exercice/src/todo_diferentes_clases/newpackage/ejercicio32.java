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

public class ejercicio32 {
    public static inicial in = new inicial();
    public static void ejercicio32(){
        System.out.println("Ejercicio 32: Divisores");
        // Operación
        System.out.print("Ingrese un número entero diferente de cero: ");
        in.intOne = scanner.nextInt();
        System.out.println("Los divisores de " + in.intOne + " son:");
        for (in.intTwo = 1; in.intTwo <= Math.abs(in.intOne); in.intTwo++) {
            if (in.intOne % in.intTwo == 0) {
                System.out.println(in.intTwo);
            }
        }
        // Mostrar resultado (ya se muestran en el ciclo)    
    }
}
