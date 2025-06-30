/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.hospital;

/**
 *
 * @author Emerson Calet Molano
 */
public class Main{
    public static Datos da = new Datos();
    public static void main(String[] args) {
        int number = 0;
        System.out.println("----Menu del Hospital----");
        do {
            System.out.println("Que deseas hacer?");
            System.out.println("1. Conductor-");
            System.out.println("2. Pacientes-");
            System.out.println("3. Muerto-s");
            System.out.println("4. Funeraria-");
            System.out.println("5. Ambulancia-");
            System.out.println("6. Clinica-");
            System.out.println("7. Generar Reporte-");
            System.out.println("8. Estadísticas Rápidas-");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            number = da.sc.nextInt();
            da.sc.nextLine();
            
            // Validar entrada
            while (number < 0 || number > 8) {
                System.out.print("Valor fuera de rango. Por favor ingrese otro: ");
                number = da.sc.nextInt();
                da.sc.nextLine();
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
                    Funeraria.funeraria();
                    break;
                case 5:
                    Ambulancia.ambulancia();
                    break;
                case 6:
                    Clinica.clinica();
                    break;
                case 7:
                    Reporte.generarReporte();
                    break;
                case 8:
                    mostrarEstadisticasRapidas();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
            }

        } while (number != 0);
    }
    
    private static void mostrarEstadisticasRapidas() {
        System.out.println("ESTADÍSTICAS RÁPIDAS");
        System.out.println("-".repeat(30));
        
        // Contar conductores registrados
        int conductoresRegistrados = 0;
        for (int i = 0; i < 10; i++) {
            if (da.conductores[i][0] != null) conductoresRegistrados++;
        }
        
        // Contar pacientes registrados
        int pacientesRegistrados = 0;
        for (int i = 0; i < 100; i++) {
            if (da.pacientes[i][0] != null) pacientesRegistrados++;
        }
        
        // Contar ambulancias en uso
        int ambulanciasEnUso = 0;
        for (int i = 0; i < 10; i++) {
            if (da.kmAmbulancias[i] > 0) ambulanciasEnUso++;
        }
        
        System.out.println("Conductores: " + conductoresRegistrados + "/10");
        System.out.println("Pacientes: " + pacientesRegistrados + "/100");
        System.out.println("Ambulancias en uso: " + ambulanciasEnUso + "/10");
        System.out.println("-".repeat(30));
    }
}
