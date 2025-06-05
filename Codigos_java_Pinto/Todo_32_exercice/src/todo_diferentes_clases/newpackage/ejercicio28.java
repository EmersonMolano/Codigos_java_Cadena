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

public class ejercicio28 {
    public static inicial in = new inicial();
    public static void ejercicio28(){
        System.out.println("Ejercicio 28: Vocales y Consonantes");
        // Operación
        in.intOne = 0;
        in.intTwo = 0;
        in.intThree = 1;
        while (in.intThree <= 10) {
            System.out.print("Ingrese una letra: ");
            in.charOne = scanner.next().toLowerCase().charAt(0);
            if (in.charOne == 'a' || in.charOne == 'e' || in.charOne == 'i' || in.charOne == 'o' || in.charOne == 'u') {
                in.intOne++;
            } else {
                in.intTwo++;
            }
            in.intThree++;
        }
        // Mostrar resultado
        System.out.println("Número de vocales: " + in.intOne);
        System.out.println("Número de consonantes: " + in.intTwo);
    }
}
