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

public class ejercicio29 {
    public static inicial in = new inicial();
    public static void ejercicio29(){
        System.out.println("Ejercicio 29: Mayoría Simple");
        // Operación
        in.intOne = 0;
        in.intTwo = 0;
        in.intThree = 0;
        in.numberOne = 0;
        for (in.numberTwo = 1; in.numberTwo <= 160; in.numberTwo++) {
            System.out.print("Ingrese el voto del elector (1, 2, 3, otro): ");
            in.numberThree = scanner.nextDouble();
            switch ((int)in.numberThree) {
                case 1: in.intOne++; break;
                case 2: in.intTwo++; break;
                case 3: in.intThree++; break;
                default: in.numberOne++;
            }
        }
        // Mostrar resultado
        if (in.intOne > in.intTwo && in.intOne > in.intThree && in.intOne > in.numberOne) {
            in.result = 1;
        } else if (in.intTwo > in.intThree && in.intTwo > in.numberOne) {
            in.result = 2;
        } else if (in.intThree > in.numberOne) {
            in.result = 3;
        } else {
            in.result = 0;
        }
        System.out.println("El ganador es el candidato: " + in.result);
    }    
}
