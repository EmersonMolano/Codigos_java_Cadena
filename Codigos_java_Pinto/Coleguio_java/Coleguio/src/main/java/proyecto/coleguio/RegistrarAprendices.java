/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.coleguio;

/**
 *
 * @author Familia M.C
 */
public class RegistrarAprendices extends Variable{
    public static void RegistrarAprendices(){
        
        
        do {
            election = 0;
            System.out.println("------------------------------------------------");
            System.out.println("Aprendiz ");
            System.out.println("1. Insertar cantidad de aprendicez.");
            System.out.println("2. Reguistrar aprendices.");
            System.out.println("3. Asignarlos a un Ambiente.");

            switch (election) {
                case 1:
                    System.out.println("Ingresa la cantidad de Ambientes: ");
                    aprendizCantidad = sc.nextInt();
                    break;
                case 2:
                    registrarAprendiz();
                case 3:
                    ambienteAprendiz();
                    break;
                default:
                    throw new AssertionError();
            }    
    
        } while (election != 3);
    }
    
    public static void registrarAprendiz(){
        
        
    }
    
    public static void ambienteAprendiz(){
    
    
    }
}