package com.mycompany.hospital;

import java.util.Scanner;

public class Utilidades {
    public static Datos da = new Datos();
    
    // Función para limpiar pantalla (simulada)
    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    
    // Función para validar entrada numérica
    public static int validarEntero(String mensaje, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int valor;
        while (true) {
            System.out.print(mensaje);
            try {
                valor = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
                if (valor >= min && valor <= max) {
                    return valor;
                } else {
                    System.out.println("❌ Valor fuera de rango. Debe estar entre " + min + " y " + max);
                }
            } catch (Exception e) {
                System.out.println("❌ Entrada inválida. Ingresa un número.");
                sc.nextLine(); // Limpiar buffer
            }
        }
    }
    
    // Función para validar entrada de texto
    public static String validarTexto(String mensaje, int longitudMinima) {
        Scanner sc = new Scanner(System.in);
        String texto;
        while (true) {
            System.out.print(mensaje);
            texto = sc.nextLine().trim();
            if (texto.length() >= longitudMinima) {
                return texto;
            } else {
                System.out.println("❌ El texto debe tener al menos " + longitudMinima + " caracteres.");
            }
        }
    }
    
    // Función para mostrar menú de opciones
    public static void mostrarMenu(String[] opciones) {
        System.out.println("\n" + "=".repeat(40));
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i]);
        }
        System.out.println("0. Salir");
        System.out.println("=".repeat(40));
    }
    
    // Función para formatear texto con bordes
    public static void mostrarTitulo(String titulo) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("           " + titulo);
        System.out.println("=".repeat(50));
    }
    
    // Función para mostrar estadísticas rápidas
    public static void mostrarEstadisticasRapidas() {
        System.out.println("\n📊 ESTADÍSTICAS RÁPIDAS");
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
        
        System.out.println("👨‍⚕️ Conductores: " + conductoresRegistrados + "/10");
        System.out.println("🏥 Pacientes: " + pacientesRegistrados + "/100");
        System.out.println("🚑 Ambulancias en uso: " + ambulanciasEnUso + "/10");
        System.out.println("-".repeat(30));
    }
}