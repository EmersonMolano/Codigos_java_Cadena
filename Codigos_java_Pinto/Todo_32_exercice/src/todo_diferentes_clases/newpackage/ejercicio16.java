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

public class ejercicio16 {
    public static inicial in = new inicial();

    public static void ejercicio16(){
        System.out.println("Ejercicio 16: Mensaje de Vocal");
        // Operación
        System.out.print("Ingrese un número entero (1 a 5): ");
        in.intOne = scanner.nextInt();
        switch (in.intOne) {
            case 1: in.textOne = "A"; break;
            case 2: in.textOne = "E"; break;
            case 3: in.textOne = "I"; break;
            case 4: in.textOne = "O"; break;
            case 5: in.textOne = "U"; break;
            default: in.textOne = "Valor Incorrecto";
        }
        // Mostrar resultado
        System.out.println("La vocal correspondiente es: " + in.textOne);
    }
}
