/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.hospital;
import static com.mycompany.hospital.Datos.sc;

/**
 *
 * @author Emerson Calet Molano
 */
public class Main{

    public static void main(String[] args) {
        int number = 0;

        do {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Conductor");
            System.out.println("2. Pacientes");
            System.out.println("3. Muertos");
            System.out.println("4. Funeraria");
            System.out.println("5. Ambulancia");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            number = sc.nextInt();

            // Validar entrada
            while (number < 0 || number > 5) {
                System.out.print("Valor fuera de rango. Por favor ingrese otro: ");
                number = sc.nextInt();
            }

            // Procesar la opción seleccionada
            switch (number) {
                case 1:
                    Conductor.conductor();
                    break;
                case 2:
                    Pacientes.pacientes();
                    break;
                case 3:
                    Muertos.muertos();
                    break;
                case 4:
                    Ambulancia.ambulancia();
                    break;
                case 5:
                    Funeraria.funeraria();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
            }

        } while (number != 0);
    }
}
