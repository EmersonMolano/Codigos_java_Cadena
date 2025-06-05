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

public class ejercicio23 {
    public static inicial in = new inicial();
    public static void ejercicio23(){
        System.out.println("Ejercicio 23: Números Impares");
        // Operación
        in.intOne = 1;
        in.intTwo = 0;
        while (in.intTwo < 10) {
            if (in.intOne % 2 != 0) {
                System.out.println(in.intOne);
                in.intTwo++;
            }
            in.intOne++;
        }
        // Mostrar resultado (ya se muestran en el ciclo)    
    }    
}
