/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;
import java.util.Random;
//import java.util.Arrays;
//import java.util.Random;
/**
 *
 * @author SENA
 */
public class Clinica{
    //clinicas 3s
    public static Datos da = new Datos();
    
    public static void clinica(){
        System.out.println("--- Sistema de Solicitudes de Ambulancia ---");
        
        int solicitudes = 0;
        System.out.print("¿Cuántas solicitudes de ambulancia deseas procesar? (máximo 10): ");
        while (true) {
            solicitudes = da.sc.nextInt();
            da.sc.nextLine();
            if (solicitudes > 0 && solicitudes <= 10) {
                break;
            } else {
                System.out.print("Número inválido. Ingresa un número entre 1 y 10: ");
            }
        }

        System.out.println("\n--- Procesando Solicitudes ---");
        for (int i = 0; i < solicitudes; i++) {
            int clinica = new Random().nextInt(3);
            System.out.println("\nSolicitud " + (i+1) + " desde " + da.clinicas[clinica]);
            System.out.println("Distancia: " + da.distancias[clinica] + " km");
            
            // Simular asignación de ambulancia
            int ambulanciaDisponible = buscarAmbulanciaDisponible();
            if (ambulanciaDisponible != -1) {
                System.out.println("✓ Ambulancia " + (ambulanciaDisponible + 1) + " asignada");
                System.out.println("Tiempo estimado de llegada: " + (da.distancias[clinica] * 2) + " minutos");
            } else {
                System.out.println("✗ No hay ambulancias disponibles");
            }
        }
    }
    
    private static int buscarAmbulanciaDisponible() {
        for (int i = 0; i < 9; i++) { // Solo 9 ambulancias, la 10 es carroza
            if (da.kmAmbulancias[i] < 400) {
                return i;
            }
        }
        return -1;
    }
}

