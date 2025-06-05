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

public class ejercicio19 {
    public static inicial in = new inicial();

    public static void ejercicio19(){
        System.out.println("Ejercicio 19: Números Pares");
        // Operación
        in.intOne = 2;
        while (in.intOne <= 10) {
            System.out.println(in.intOne);
            in.intOne += 2;
        }
        // Mostrar resultado (ya se muestran en el ciclo)        
    }
}
