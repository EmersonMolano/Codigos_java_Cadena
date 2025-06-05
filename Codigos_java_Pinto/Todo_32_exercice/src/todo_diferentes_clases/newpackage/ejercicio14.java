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
public class ejercicio14{
    public static inicial in = new inicial();

    public static void ejercicio14(){
        System.out.println("Ejercicio 14: Número Romano");
        // Operación
        System.out.print("Ingrese un número entero (1 a 10): ");
        in.intOne = scanner.nextInt();
        switch (in.intOne) {
            case 1: in.textOne = "I"; break;
            case 2: in.textOne = "II"; break;
            case 3: in.textOne = "III"; break;
            case 4: in.textOne = "IV"; break;
            case 5: in.textOne = "V"; break;
            case 6: in.textOne = "VI"; break;
            case 7: in.textOne = "VII"; break;
            case 8: in.textOne = "VIII"; break;
            case 9: in.textOne = "IX"; break;
            case 10: in.textOne = "X"; break;
            default: in.textOne = "Valor incorrecto";
        }
        // Mostrar resultado
        System.out.println("Equivalente en romano: " + in.textOne);
    }    
}
