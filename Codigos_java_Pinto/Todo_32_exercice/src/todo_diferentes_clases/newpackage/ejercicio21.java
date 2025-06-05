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

public class ejercicio21 {
    public static inicial in = new inicial();
    public static void ejercicio21(){
        System.out.println("Ejercicio 21: Conteo de Edades");
        // Operación
        in.intOne = 1;
        in.intTwo = 0;
        in.intThree = 0;
        while (in.intOne <= 200) {
            System.out.print("Ingrese la edad de la persona " + in.intOne + ": ");
            in.numberOne = scanner.nextDouble();
            if (in.numberOne < 18) {
                in.intTwo++;
            } else {
                in.intThree++;
            }
            in.intOne++;
        }
        // Mostrar resultado
        System.out.println("Mayores de edad: " + in.intThree);
        System.out.println("Menores de edad: " + in.intTwo);    
    }    
}
