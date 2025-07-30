/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.coleguio;

/**
 *
 * @author Familia M.C
 */
public class DatosAmbientes extends Variable {
    public static void Ambientes(){
            System.out.println("Ingresa la cantidad de Ambientes: ");
            ambienteCantidad = sc.nextInt();
        do {
            System.out.println("------------------------------------------------");
             
            System.out.println("El Ambiente es especializado o no:");
            System.out.println("1. Si.");
            System.out.println("2. No.");
            ambienteEspecializado = sc.nextInt();
            sc.nextLine();

            //Validacion de numero no existente
            if (ambienteEspecializado < 1 || ambienteEspecializado > 2 ) {
                System.out.println("Número no aceptado, ingresa otro por favor.");
            }
            System.out.println("------------------------------------------------");
        } while (ambienteEspecializado < 1 || ambienteEspecializado > 2);
        
    }
}
