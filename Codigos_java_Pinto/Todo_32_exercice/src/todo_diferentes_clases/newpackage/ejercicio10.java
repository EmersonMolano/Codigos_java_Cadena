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

public class ejercicio10 {
    public static inicial in = new inicial();
    public static void ejercicio10(){
        System.out.println("Ejercicio 10: Edad de Hermanos");
        // Operación
        System.out.print("Ingrese edad del primer hermano: ");
        in.intOne = scanner.nextInt();
        System.out.print("Ingrese edad del segundo hermano: ");
        in.intTwo = scanner.nextInt();
        in.result = Math.abs(in.intOne - in.intTwo);
        // Mostrar resultado
        System.out.println("Diferencia de edad: " + in.result + " años");
    }    
    
    
    
}
