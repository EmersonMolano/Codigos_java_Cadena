/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresar_datos;
import static ingresar_datos.ingresar.sc;

/**
 *
 * @author Familia M.C
 */
public class ingresar_datos {
    
    public static ingresar in = new ingresar();
    
    public static void ingresar_datos(){
        System.out.println("-------------------------------------------------");

        int cantidad = 1; // Puedes pedir al usuario cuántas personas quiere ingresar
        for (int j = 0; j < cantidad; j++) {
            System.out.println("Persona " + (in.c + 1) + ": ");
            sc.nextLine();
            // Primer nombre
            String nuevoPrimerNombre;
            do {
                System.out.print("Primer nombre: ");
                nuevoPrimerNombre = sc.nextLine();
                if (verificar.existeDato(in.primerNombre, nuevoPrimerNombre, in.c)) {
                    System.out.println("¡Este nombre ya está registrado! Ingresa uno diferente.");
                }
            } while (verificar.existeDato(in.primerNombre, nuevoPrimerNombre, in.c));
            in.primerNombre[in.c] = nuevoPrimerNombre;
            
            // Segundo nombre
            String nuevoSegundoNombre;
            do {
                System.out.print("Segundo nombre: ");
                nuevoSegundoNombre = sc.nextLine();
                if (verificar.existeDato(in.segundoNombre, nuevoSegundoNombre, in.c)) {
                    System.out.println("¡Este nombre ya está registrado! Ingresa uno diferente.");
                }
            } while (verificar.existeDato(in.segundoNombre, nuevoSegundoNombre, in.c));
            in.segundoNombre[in.c] = nuevoSegundoNombre;

            // Primer apellido
            String nuevoPrimerApellido;
            do {
                System.out.print("Primer apellido: ");
                nuevoPrimerApellido = sc.nextLine();
                if (verificar.existeDato(in.primerApellido, nuevoPrimerApellido, in.c)) {
                    System.out.println("¡Este apellido ya está registrado! Ingresa uno diferente.");
                }
            } while (verificar.existeDato(in.primerApellido, nuevoPrimerApellido, in.c));
            in.primerApellido[in.c] = nuevoPrimerApellido;

            // Segundo apellido
            String nuevoSegundoApellido;
            do {
                System.out.print("Segundo apellido: ");
                nuevoSegundoApellido = sc.nextLine();
                if (verificar.existeDato(in.segundoApellido, nuevoSegundoApellido, in.c)) {
                    System.out.println("¡Este apellido ya está registrado! Ingresa uno diferente.");
                }
            } while (verificar.existeDato(in.segundoApellido, nuevoSegundoApellido, in.c));
            in.segundoApellido[in.c] = nuevoSegundoApellido;

            // Email
            String nuevoEmail;
            do {
                System.out.print("Email: ");
                nuevoEmail = sc.nextLine();
                if (verificar.existeDato(in.email, nuevoEmail, in.c)) {
                    System.out.println("¡Este email ya está registrado! Ingresa uno diferente.");
                }
            } while (verificar.existeDato(in.email, nuevoEmail, in.c));
            in.email[in.c] = nuevoEmail;

            // Teléfono
            long nuevoTelefono;
            do {
                System.out.print("Telefono: ");
                nuevoTelefono = sc.nextLong();
                sc.nextLine(); // Limpiar el buffer
                if (verificar.existeDatoLong(in.telefono, nuevoTelefono, in.c)) {
                    System.out.println("¡Este teléfono ya está registrado! Ingresa uno diferente.");
                }
            } while (verificar.existeDatoLong(in.telefono, nuevoTelefono, in.c));
            in.telefono[in.c] = nuevoTelefono;

            // Dirección
            String nuevaDireccion;
            do {
                System.out.print("Direccion: ");
                nuevaDireccion = sc.nextLine();
                if (verificar.existeDato(in.direccion, nuevaDireccion, in.c)) {
                    System.out.println("¡Esta dirección ya está registrada! Ingresa una diferente.");
                }
            } while (verificar.existeDato(in.direccion, nuevaDireccion, in.c));
            in.direccion[in.c] = nuevaDireccion;

            // Profesión
            String nuevaProfesion;
            do {
                System.out.print("Profecion: ");
                nuevaProfesion = sc.nextLine();
                if (verificar.existeDato(in.profecion, nuevaProfesion, in.c)) {
                    System.out.println("¡Esta profesión ya está registrada! Ingresa una diferente.");
                }
            } while (verificar.existeDato(in.profecion, nuevaProfesion, in.c));
            in.profecion[in.c] = nuevaProfesion;

            // RH
            String nuevoRH;
            do {
                System.out.print("RH: ");
                nuevoRH = sc.nextLine();
                if (verificar.existeDato(in.rh, nuevoRH, in.c)) {
                    System.out.println("¡Este RH ya está registrado! Ingresa uno diferente.");
                }
            } while (verificar.existeDato(in.rh, nuevoRH, in.c));
            in.rh[in.c] = nuevoRH;

            // Documento de identidad
            String nuevaCedula;
            do {
                System.out.print("Documento de identidad: ");
                nuevaCedula = sc.nextLine();
                if (verificar.existeDato(in.cedula, nuevaCedula, in.c)) {
                    System.out.println("¡Este documento ya está registrado! Ingresa uno diferente.");
                }
            } while (verificar.existeDato(in.cedula, nuevaCedula, in.c));
            in.cedula[in.c] = nuevaCedula;
            
            in.c++; // ¡Aumenta el contador después de cada persona!
        }
        System.out.println("-------------------------------------------------");

    }


}
