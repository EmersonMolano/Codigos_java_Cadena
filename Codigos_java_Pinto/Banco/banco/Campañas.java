/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import static com.mycompany.banco.Banco.campañas;
import static com.mycompany.banco.Banco.nombreCampaña;
import static com.mycompany.banco.Banco.teclado;
import static com.mycompany.banco.Banco.tipo;

/**
 *
 * @author User
 */
public class Campañas {
     public static void campañas() {
        do {
            System.out.println("\n--- Menú de Campañas ---");
            System.out.println("1. Campaña de Interés");
            System.out.println("2. Campaña de Factura");
            System.out.println("3. Campaña Nueva");
            System.out.println("4. Ver campañas registradas");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");
            tipo = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            switch (tipo) {
                case 1 -> {
                    System.out.print("Nombre de la campaña de Interés: ");
                    nombreCampaña = teclado.nextLine().trim();
                    if (!nombreCampaña.isEmpty()) {
                        campañas.add("[Interés] " + nombreCampaña);
                        System.out.println("Campaña registrada.");
                    } else {
                        System.out.println("Nombre no válido.");
                    }
                }
                case 2 -> {
                    System.out.print("Nombre de la campaña de Factura: ");
                    nombreCampaña = teclado.nextLine().trim();
                    if (!nombreCampaña.isEmpty()) {
                        campañas.add("[Factura] " + nombreCampaña);
                        System.out.println("Campaña registrada.");
                    } else {
                        System.out.println("Nombre no válido.");
                    }
                }
                case 3 -> {
                    System.out.print("Nombre de la nueva campaña: ");
                    nombreCampaña = teclado.nextLine().trim();
                    if (!nombreCampaña.isEmpty()) {
                        campañas.add("[Nueva] " + nombreCampaña);
                        System.out.println("Campaña registrada.");
                    } else {
                        System.out.println("Nombre no válido.");
                    }
                }
                case 4 -> {
                    if (campañas.isEmpty()) {
                        System.out.println("No hay campañas registradas.");
                    } else {
                        System.out.println("Campañas registradas:");
                        for (String c : campañas) {
                            System.out.println(" - " + c);
                        }
                    }
                }
                case 0 -> System.out.println("Volviendo al menú principal...");
                default -> {
                    if (tipo != 0) System.out.println("Opción no válida.");
                }
            }
        } while (tipo != 0);
    }
}
