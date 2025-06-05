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

public class ejercicio12 {
    public static inicial in = new inicial();
    public static void ejercicio12(){
        System.out.println("Ejercicio 12: Máximo de Tres");
        // Operación
        System.out.print("Ingrese el primer número: ");
        in.intOne = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        in.intTwo = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        in.intThree = scanner.nextInt();
        if (in.intOne > in.intTwo && in.intOne > in.intThree) {
            in.result = in.intOne;
        } else if (in.intTwo > in.intThree) {
            in.result = in.intTwo;
        } else {
            in.result = in.intThree;
        }
        // Mostrar resultado
        System.out.println("El número mayor es: " + in.result);
    }
    
}
