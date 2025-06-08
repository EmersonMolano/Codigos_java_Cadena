/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresar_datos;
import java.util.Scanner;

/**
 *
 * @author Familia M.C
 */


public class buscar {
    public static ingresar in = new ingresar();
    
    public static void buscar(){
        System.out.println("-------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el texto, número o parte de dato a buscar: ");
        String busqueda = sc.nextLine().toLowerCase();
        boolean encontrado = false;

        for (int i = 0; i <= in.c; i++) {
            if (
                (in.primerNombre[i] != null && in.primerNombre[i].toLowerCase().contains(busqueda)) ||
                (in.segundoNombre[i] != null && in.segundoNombre[i].toLowerCase().contains(busqueda)) ||
                (in.primerApellido[i] != null && in.primerApellido[i].toLowerCase().contains(busqueda)) ||
                (in.segundoApellido[i] != null && in.segundoApellido[i].toLowerCase().contains(busqueda)) ||
                (in.email[i] != null && in.email[i].toLowerCase().contains(busqueda)) ||
                (String.valueOf(in.telefono[i]).contains(busqueda)) ||
                (in.direccion[i] != null && in.direccion[i].toLowerCase().contains(busqueda)) ||
                (in.profecion[i] != null && in.profecion[i].toLowerCase().contains(busqueda)) ||
                (in.rh[i] != null && in.rh[i].toLowerCase().contains(busqueda)) ||
                (in.cedula[i] != null && in.cedula[i].toLowerCase().contains(busqueda))
            ) {
                encontrado = true;
                System.out.println("\n--- Coincidencia encontrada ---");
                System.out.println("Persona " + (i+1) + ": ");
                System.out.println("Primer nombre: " + in.primerNombre[i]);
                System.out.println("Segundo nombre: " + in.segundoNombre[i]);
                System.out.println("Primer apellido: " + in.primerApellido[i]);
                System.out.println("Segundo apellido: " + in.segundoApellido[i]);
                System.out.println("Email: " + in.email[i]);
                System.out.println("Telefono: " + in.telefono[i]);
                System.out.println("Direccion: " + in.direccion[i]);
                System.out.println("Profecion: " + in.profecion[i]);
                System.out.println("RH: " + in.rh[i]);
                System.out.println("Documento de identidad: " + in.cedula[i]);
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron coincidencias para: " + busqueda);
        }
        System.out.println("-------------------------------------------------");
    }
}
