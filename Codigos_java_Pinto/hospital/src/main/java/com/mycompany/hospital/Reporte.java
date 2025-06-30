package com.mycompany.hospital;

public class Reporte {
    public static Datos da = new Datos();
    
    public static void generarReporte() {
        mostrarTitulo("REPORTE GENERAL DEL SISTEMA");
        
        // Reporte de conductores
        reporteConductores();
        
        // Reporte de pacientes
        reportePacientes();
        
        // Reporte de ambulancias
        reporteAmbulancias();
        
        // Reporte de fallecidos
        reporteFallecidos();
        
        // Reporte de estadísticas generales
        reporteEstadisticasGenerales();
    }
    
    private static void reporteConductores() {
        System.out.println("\n👨‍⚕️ --- CONDUCTORES REGISTRADOS ---");
        int conductoresRegistrados = 0;
        int conductoresConRecorridos = 0;
        
        for (int i = 0; i < 10; i++) {
            if (da.conductores[i][0] != null) {
                conductoresRegistrados++;
                if (da.recorridosConductores[i] > 0) {
                    conductoresConRecorridos++;
                }
                System.out.println("Conductor " + (i+1) + ": " + da.conductores[i][0] + " " + da.conductores[i][1] + 
                                 " - Tel: " + da.conductores[i][2] + " - Recorridos: " + da.recorridosConductores[i] + "/8");
            }
        }
        System.out.println("📊 Total conductores: " + conductoresRegistrados + "/10");
        System.out.println("📊 Conductores con recorridos: " + conductoresConRecorridos);
    }
    
    private static void reportePacientes() {
        System.out.println("\n🏥 --- PACIENTES REGISTRADOS ---");
        int pacientesRegistrados = 0;
        int pacientesFallecidos = 0;
        
        for (int i = 0; i < 100; i++) {
            if (da.pacientes[i][0] != null) {
                pacientesRegistrados++;
                if (da.estaMuerto[i]) {
                    pacientesFallecidos++;
                }
            }
        }
        System.out.println("📊 Total pacientes: " + pacientesRegistrados + "/100");
        System.out.println("📊 Pacientes fallecidos: " + pacientesFallecidos);
        System.out.println("📊 Pacientes vivos: " + (pacientesRegistrados - pacientesFallecidos));
    }
    
    private static void reporteAmbulancias() {
        System.out.println("\n🚑 --- ESTADO DE AMBULANCIAS ---");
        int ambulanciasEnUso = 0;
        int ambulanciasDisponibles = 0;
        int totalKmRecorridos = 0;
        
        for (int i = 0; i < 10; i++) {
            int restante = 400 - da.kmAmbulancias[i];
            totalKmRecorridos += da.kmAmbulancias[i];
            
            if (da.kmAmbulancias[i] > 0) {
                ambulanciasEnUso++;
            }
            if (restante > 0) {
                ambulanciasDisponibles++;
            }
            
            String estado = restante > 0 ? "✅ Disponible" : "❌ Sin disponibilidad";
            System.out.println("Ambulancia " + (i+1) + ": " + da.kmAmbulancias[i] + " km usados, " + 
                             restante + " km disponibles - " + estado);
        }
        System.out.println("📊 Ambulancias en uso: " + ambulanciasEnUso + "/10");
        System.out.println("📊 Ambulancias disponibles: " + ambulanciasDisponibles + "/10");
        System.out.println("📊 Total km recorridos: " + totalKmRecorridos + " km");
    }
    
    private static void reporteFallecidos() {
        System.out.println("\n💀 --- FALLECIDOS REGISTRADOS ---");
        int fallecidosRegistrados = 0;
        
        for (int i = 0; i < 15; i++) {
            if (da.muertos[i][0] != null) {
                fallecidosRegistrados++;
                System.out.println((i+1) + ". " + da.muertos[i][0] + " - Causa: " + da.muertos[i][1]);
            }
        }
        System.out.println("📊 Total fallecidos registrados: " + fallecidosRegistrados + "/15");
    }
    
    private static void reporteEstadisticasGenerales() {
        System.out.println("\n📈 --- ESTADÍSTICAS GENERALES ---");
        
        // Calcular promedios
        int totalRecorridos = 0;
        int conductoresConRecorridos = 0;
        for (int i = 0; i < 10; i++) {
            if (da.recorridosConductores[i] > 0) {
                totalRecorridos += da.recorridosConductores[i];
                conductoresConRecorridos++;
            }
        }
        
        double promedioRecorridos = conductoresConRecorridos > 0 ? (double) totalRecorridos / conductoresConRecorridos : 0;
        
        System.out.println("📊 Promedio de recorridos por conductor: " + String.format("%.1f", promedioRecorridos));
        System.out.println("📊 Total de recorridos realizados: " + totalRecorridos);
        System.out.println("📊 Eficiencia del sistema: " + calcularEficiencia() + "%");
    }
    
    private static int calcularEficiencia() {
        int ambulanciasDisponibles = 0;
        int conductoresDisponibles = 0;
        
        for (int i = 0; i < 10; i++) {
            if (da.kmAmbulancias[i] < 400) ambulanciasDisponibles++;
            if (da.recorridosConductores[i] < 8) conductoresDisponibles++;
        }
        
        return (ambulanciasDisponibles + conductoresDisponibles) * 5; // Porcentaje simple
    }
    
    private static void mostrarTitulo(String titulo) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("                    " + titulo);
        System.out.println("=".repeat(60));
    }
} 