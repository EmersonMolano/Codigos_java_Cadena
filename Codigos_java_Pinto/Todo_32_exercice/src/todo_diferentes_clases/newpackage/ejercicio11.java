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

public class ejercicio11 {
    public static inicial in = new inicial();

    public static void ejercicio11(){
        System.out.println("Ejercicio 11: Incentivo de Producción");
        // Operación
        System.out.print("Ingrese la producción del lunes: ");
        in.intOne = scanner.nextInt();
        System.out.print("Ingrese la producción del martes: ");
        in.intTwo = scanner.nextInt();
        System.out.print("Ingrese la producción del miércoles: ");
        in.intThree = scanner.nextInt();
        System.out.print("Ingrese la producción del jueves: ");
        in.numberOne = scanner.nextDouble();
        System.out.print("Ingrese la producción del viernes: ");
        in.numberTwo = scanner.nextDouble();
        System.out.print("Ingrese la producción del sábado: ");
        in.numberThree = scanner.nextDouble();
        in.result = (in.intOne + in.intTwo + in.intThree + in.numberOne + in.numberTwo + in.numberThree) / 6.0;
        // Mostrar resultado
        if (in.result >= 100) {
            System.out.println("Recibirá Incentivos");
        } else {
            System.out.println("No Recibirá Incentivos");
        }    
    }    
}
