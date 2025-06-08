/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresar_datos;
import java.util.Scanner;
/**
 *
 * @author SENA
 */
public class Datos_Personas {
  //nombre
    //apellido
    //correo 
    //telefono
    //direccion, email, profecion, rh, celula
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int election;
        //Creacion de vectores
        String[] primerNombre = new String[10];
        String[] segundoNombre = new String[10];
        String[] primerApellido = new String[10];
        String[] segundoApellido = new String[10];
        String[] email = new String[10];
        int[] telefono = new int[10];
        String[] direccion = new String[10];
        String[] profecion = new String[10];
        String[] rh = new String[10];
        String[] cedula = new String[10];
        
        System.out.println("¿Cuantas personas se van a registrar?: ");
        election = sc.nextInt();
        sc.nextLine();
        //Asicnacion de nombres a vectores 
        for (int i = 0; i < election; i++) {
            System.out.println("Persona " + (1+i) + ": ");
            
            System.out.print("Primer nombre: ");
            primerNombre[i] = sc.nextLine();

            System.out.print("Segundo nombre: ");
            segundoNombre[i] = sc.nextLine();

            System.out.print("Primer apellido: ");
            primerApellido[i] = sc.nextLine();

            System.out.print("Segundo apellido: ");
            segundoApellido[i] = sc.nextLine();

            System.out.print("Email: ");
            email[i] = sc.nextLine();

            System.out.print("Telefono: ");
            telefono[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Direccion:");
            direccion[i] = sc.nextLine();

            System.out.print("Profecion: ");
            profecion[i] = sc.nextLine();

            System.out.print("RH: ");
            rh[i] = sc.nextLine();

            System.out.print("Documento de identidad: ");
            cedula[i] = sc.nextLine();
        }
        
        for (int i = 0; i < election; i++) {
            System.out.println("Persona " + (1+i) + ": ");
            
            System.out.println("Primer nombre: " + primerNombre[i]);

            System.out.println("Segundo nombre: " + segundoNombre[i]);

            System.out.println("Primer apellido: " + primerApellido[i]);

            System.out.println("Segundo apellido: " + segundoApellido[i]);

            System.out.println("Email: " + email[i]);

            System.out.println("Telefono: " + telefono[i]);

            System.out.println("Direccion" + direccion[i]);

            System.out.println("Profecion: " + profecion[i]);

            System.out.println("RH: " + rh[i]);

            System.out.println("Documento de identidad: " + cedula[i]);
        }
        
        System.out.print("\n¿Deseas buscar personas por nombre? (sí/no): ");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("sí") || respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingresa parte del nombre a buscar: ");
            String busqueda = sc.nextLine().toLowerCase();

            boolean encontrada = false;

            for (int i = 0; i < election; i++) {
                if (primerNombre[i].toLowerCase().contains(busqueda) || segundoNombre[i].toLowerCase().contains(busqueda)) {
                    encontrada = true;
                    System.out.println("--- Coincidencia encontrada ---");
                    System.out.println("Persona " + (i + 1) + ": ");
                    System.out.println("Primer nombre: " + primerNombre[i]);
                    System.out.println("Segundo nombre: " + segundoNombre[i]);
                    System.out.println("Primer apellido: " + primerApellido[i]);
                    System.out.println("Segundo apellido: " + segundoApellido[i]);
                    System.out.println("Email: " + email[i]);
                    System.out.println("Telefono: " + telefono[i]);
                    System.out.println("Direccion: " + direccion[i]);
                    System.out.println("Profecion: " + profecion[i]);
                    System.out.println("RH: " + rh[i]);
                    System.out.println("Documento de identidad: " + cedula[i]);
                }
            }

            if (!encontrada) {
                System.out.println("No se encontraron personas con ese nombre.");
            }
        }

    }
}
