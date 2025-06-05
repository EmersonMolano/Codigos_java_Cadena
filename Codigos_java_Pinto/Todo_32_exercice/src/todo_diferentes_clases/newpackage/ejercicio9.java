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

public class ejercicio9{
    public static inicial in = new inicial();
    public static void ejercicio9(){
        System.out.println("Ejercicio 9: Verificación de CUIL");
        // Operación
        System.out.print("Ingrese el año de nacimiento: ");
        in.intOne = scanner.nextInt();
        System.out.print("Ingrese el año actual: ");
        in.intTwo = scanner.nextInt();
        in.result = in.intTwo - in.intOne;
        // Mostrar resultado
        if (in.result > 17) {
            System.out.println("Debe solicitar su CUIL");
        } else {
            System.out.println("No debe solicitar su CUIL aún");
        }
    }
    

}