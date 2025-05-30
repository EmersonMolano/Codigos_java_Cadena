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
public class ejercicio3{
    //Esto hace que pueda usar el scanner de la clase inicial y tambien me ayuda a usar las variables de "inicial"
    public static inicial in = new inicial();
    
    public static void ejercicio3(){
        System.out.println("Ejercicio 3: Puntaje Final");
        // Operación
        System.out.print("Ingrese respuestas correctas: ");
        in.intOne = scanner.nextInt();
        System.out.print("Ingrese respuestas incorrectas: ");
        in.intTwo = scanner.nextInt();
        System.out.print("Ingrese respuestas en blanco: ");
        in.intThree = scanner.nextInt();
        in.result = (in.intOne * 4) + (in.intTwo * -1);
        // Mostrar resultado
        System.out.println("El puntaje final es: " + in.result);
    }  
}
