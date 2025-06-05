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

public class ejercicio13 {
    public static inicial in = new inicial();
    public static void ejercicio13(){
        System.out.println("Ejercicio 13: Tipo de Triángulo");
        // Operación
        System.out.print("Ingrese el primer lado: ");
        in.intOne = scanner.nextInt();
        System.out.print("Ingrese el segundo lado: ");
        in.intTwo = scanner.nextInt();
        System.out.print("Ingrese el tercer lado: ");
        in.intThree = scanner.nextInt();
        if (in.intOne != in.intTwo && in.intTwo != in.intThree && in.intOne != in.intThree) {
            in.textOne = "Escaleno";
        } else if (in.intOne == in.intTwo && in.intTwo == in.intThree) {
            in.textOne = "Equilátero";
        } else {
            in.textOne = "Isósceles";
        }
        // Mostrar resultado
        System.out.println("Tipo de triángulo: " + in.textOne);
    }
}
