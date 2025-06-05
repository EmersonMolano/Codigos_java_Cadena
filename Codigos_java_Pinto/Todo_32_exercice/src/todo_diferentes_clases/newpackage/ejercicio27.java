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

public class ejercicio27 {
    public static inicial in = new inicial();
    public static void ejercicio27(){
        System.out.println("Ejercicio 27: Operación Aritmética");
        // Operación
        System.out.print("Ingrese el primer número: ");
        in.intOne = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        in.intTwo = scanner.nextInt();
        System.out.print("Ingrese el operador (+, -, *, ^): ");
        in.charOne = scanner.next().charAt(0);
        switch (in.charOne) {
            case '+': in.result = in.intOne + in.intTwo; break;
            case '-': in.result = in.intOne - in.intTwo; break;
            case '*': in.result = in.intOne * in.intTwo; break;
            case '^': in.result = Math.pow(in.intOne, in.intTwo); break;
            default: in.result = 0;
        }
        // Mostrar resultado
        System.out.println("El resultado es: " + in.result);    
    }
}
