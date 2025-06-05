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

public class ejercicio26 {
    public static inicial in = new inicial(); 
    public static void ejercicio26(){
        System.out.println("Ejercicio 26: Serie Fibonacci");
        // Operación
        in.intOne = 0;
        in.intTwo = 1;
        in.intThree = 0;
        System.out.println(in.intOne);
        System.out.println(in.intTwo);
        while (in.intThree < 100000) {
            in.intThree = in.intOne + in.intTwo;
            if (in.intThree < 100000) {
                System.out.println(in.intThree);
            }
            in.intOne = in.intTwo;
            in.intTwo = in.intThree;
        }
        // Mostrar resultado (ya se muestran en el ciclo)        
    }
}
