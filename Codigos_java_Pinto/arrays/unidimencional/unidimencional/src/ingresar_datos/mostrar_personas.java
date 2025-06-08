/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresar_datos;

/**
 *
 * @author Familia M.C
 */
public class mostrar_personas {
    public static ingresar in = new ingresar();

    public static void mostrar_personas(){
        System.out.println("-------------------------------------------------");

        if (in.c == 0) {
            System.out.println("\nNo hay personas registradas aún.");
            return;
        }

        for (int i = 0; i <= in.c; i++) {
            if (in.primerNombre[i] != null) {
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
                System.out.println("-------------------------------------------------");
            }
        }
    }
}
