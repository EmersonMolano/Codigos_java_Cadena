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

public class ejercicio24 {
    public static inicial in = new inicial();   
    public static void ejercicio24(){
        System.out.println("Ejercicio 24: Serie Menor que 1000");
        // Operación
        in.intOne = 1;
        while (in.intOne < 1000) {
            System.out.println(in.intOne);
            in.intOne = (in.intOne * in.intOne) + 1;
        }
        // Mostrar resultado (ya se muestran en el ciclo)    
    }
}
