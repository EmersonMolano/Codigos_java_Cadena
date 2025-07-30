/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyecto.coleguio;
import java.util.Scanner;
/**
 *
 * @author Familia M.C
 */
public class Coleguio extends Variable {
    
    public static void main(String[] args) {
        do {
            System.out.println("------------------------------------------------");
                election = 0;
                System.out.println("1. Registrar la Ubicacion y Coordinador.");
                System.out.println("2. Ingresar Datos de Ambientes.");
                System.out.println("3. Registrar Aprendices");
                System.out.println("4. Registrar Instructores.");
                System.out.println("5. Reporte");
                System.out.println("6. Salir");
                /*
                    En reporte hira:
                    1. Descripcion de Ambientes
                    2. Mostrar Aprendices de la Sede.
                    3. Mostrar Instructores de la Sede.
                */
                
            do {
                System.out.print("Que deseas hacer primero?: ");
                election = sc.nextInt();
                sc.nextLine();

                //Validacion de numero no existente
                if (election < 1 || election > 6) {
                    System.out.println("Número no aceptado, ingresa otro por favor.");
                }

            } while (election < 1 || election > 6);
            
        //Eleccion 
        
            switch (election) {
            case 1:
                Ubicacion.Ubicacion();
                break;
            case 2:
                DatosAmbientes.Ambientes();
                break;
            case 3:
                RegistrarAprendices.RegistrarAprendices();
                break;
            case 4:
                RegistrarInstructores.RegistrarInstructores();
                break;
            case 5:
                Reporte.Reporte();
                break;
            case 6:
                System.out.println("Gracias por usar el sistema.");
                break;
            default:
                throw new AssertionError();
            }
        } while (election != 6);

    }
}
