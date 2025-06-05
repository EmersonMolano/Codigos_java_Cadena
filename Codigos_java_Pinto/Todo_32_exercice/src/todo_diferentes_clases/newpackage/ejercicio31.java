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

public class ejercicio31 {
    public static inicial in = new inicial();    
    public static void ejercicio31(){
        System.out.println("Ejercicio 31: Nombre del Mes");
        // Operación
        System.out.print("Ingrese el número del mes (1-12): ");
        in.intOne = scanner.nextInt();
        switch (in.intOne) {
            case 1: in.textOne = "Enero"; break;
            case 2: in.textOne = "Febrero"; break;
            case 3: in.textOne = "Marzo"; break;
            case 4: in.textOne = "Abril"; break;
            case 5: in.textOne = "Mayo"; break;
            case 6: in.textOne = "Junio"; break;
            case 7: in.textOne = "Julio"; break;
            case 8: in.textOne = "Agosto"; break;
            case 9: in.textOne = "Septiembre"; break;
            case 10: in.textOne = "Octubre"; break;
            case 11: in.textOne = "Noviembre"; break;
            case 12: in.textOne = "Diciembre"; break;
            default: in.textOne = "Mes inválido";
        }
        // Mostrar resultado
        System.out.println("El mes es: " + in.textOne);
    }
}
