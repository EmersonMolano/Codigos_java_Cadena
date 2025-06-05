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

public class ejercicio17 {
    public static inicial in = new inicial();

    public static void ejercicio17(){
        System.out.println("Ejercicio 17: Unidades y Decenas");
        // Operación
        System.out.print("Ingrese un número entero de dos cifras: ");
        in.intOne = scanner.nextInt();
        in.intTwo = in.intOne / 10;
        in.intThree = in.intOne % 10;
        // Mostrar resultado
        System.out.println("Decenas: " + in.intTwo);
        System.out.println("Unidades: " + in.intThree);
    }
}
