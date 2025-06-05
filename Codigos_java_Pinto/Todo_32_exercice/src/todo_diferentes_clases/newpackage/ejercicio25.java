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

public class ejercicio25 {
    public static inicial in = new inicial();
    public static void ejercicio25(){
        System.out.println("Ejercicio 25: Entrada de Vocal");
        // Operación
        do {
            System.out.print("Ingrese una letra: ");
            in.charOne = scanner.next().toLowerCase().charAt(0);
            in.boolOne = (in.charOne == 'a' || in.charOne == 'e' || in.charOne == 'i' || in.charOne == 'o' || in.charOne == 'u');
        } while (!in.boolOne);
        // Mostrar resultado
        System.out.println("Ingresó una vocal: " + in.charOne);   
    }
}
