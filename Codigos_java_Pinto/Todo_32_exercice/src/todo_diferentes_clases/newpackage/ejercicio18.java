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

public class ejercicio18 {
    public static inicial in = new inicial();

    public static void ejercicio18(){
        System.out.println("Ejercicio 18: Par o Impar");
        // Operación
        System.out.print("Ingrese un número entero diferente de cero: ");
        in.intOne = scanner.nextInt();
        if (in.intOne % 2 == 0) {
            in.textOne = "Es Par";
        } else {
            in.textOne = "Es Impar";
        }
        // Mostrar resultado
        System.out.println(in.textOne);
    }
}
