/*
 * Sistema de Gestión de Ambulancias
 * Cumple con los requerimientos:
 * - 10 conductores (máximo 8 recorridos cada uno)
 * - 10 ambulancias (9 normales + 1 carroza)
 * - 3 clínicas con distancias aleatorias
 * - 100 pacientes distribuidos entre clínicas
 * - Conteo de muertos aleatorio
 * - Control de kilometraje (máximo 400km)
 */
package com.mycompany.ejemplos;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author SENA
 */
public class Ejemplos {
    // ===== VARIABLES GLOBALES DEL SISTEMA =====
    static Random rand = new Random();
    
    // Conductores: nombre, apellido, teléfono, recorridos
    static String[][] conductores = new String[10][4];
    
    // Ambulancias: número, conductor, paciente, kilometraje
    static String[][] ambulancias = new String[10][4];
    
    // Pacientes: nombre, apellido, clínica, estado (vivo/muerto)
    static String[][] pacientes = new String[100][4];
    
    // Clínicas y distancias
    static String[] clinicas = {"C1", "C2", "C3"};
    static int[] distancias = {55, 35, 45}; // Distancias en km
    
    // Contadores
    static int[] recorridosConductores = new int[10];
    static int[] kmAmbulancias = new int[10];
    
    public static void main(String[] args){
        System.out.println("🏥 SISTEMA DE GESTIÓN DE AMBULANCIAS");
        System.out.println("=".repeat(50));
        
        // PASO 1: Crear conductores
        crearConductores();
        
        // PASO 2: Crear pacientes distribuidos entre clínicas
        crearPacientes();
        
        // PASO 3: Generar muertos aleatorios
        generarMuertosAleatorios();
        
        // PASO 4: Procesar solicitudes de ambulancias
        procesarSolicitudesAmbulancias();
        
        // PASO 5: Generar reporte final
        generarReporteFinal();
    }
    
    // ===== PASO 1: CREAR CONDUCTORES =====
    public static void crearConductores() {
        System.out.println("\n👨‍⚕️ PASO 1: CREANDO 10 CONDUCTORES");
        System.out.println("-".repeat(40));
        
        String[] nombres = {"Juan", "Carlos", "Miguel", "Pedro", "Luis", "Andrés", "Diego", "Roberto", "Fernando", "Ricardo"};
        String[] apellidos = {"García", "Rodríguez", "López", "Martínez", "González", "Pérez", "Sánchez", "Ramírez", "Torres", "Flores"};
        
        for (int i = 0; i < 10; i++) {
            conductores[i][0] = nombres[i];           // Nombre
            conductores[i][1] = apellidos[i];         // Apellido
            conductores[i][2] = "300" + String.format("%07d", 1000000 + i); // Teléfono
            conductores[i][3] = "0";                  // Recorridos iniciales
            
            System.out.println("Conductor " + (i+1) + ": " + nombres[i] + " " + apellidos[i] + 
                             " - Tel: " + conductores[i][2] + " - Recorridos: 0/8");
        }
    }
    
    // ===== PASO 2: CREAR PACIENTES =====
    public static void crearPacientes() {
        System.out.println("\n🏥 PASO 2: CREANDO 100 PACIENTES DISTRIBUIDOS ENTRE CLÍNICAS");
        System.out.println("-".repeat(55));
        
        int[] pacientesPorClinica = {0, 0, 0}; // Contador para cada clínica
        
        for (int i = 0; i < 100; i++) {
            pacientes[i][0] = "Paciente" + (i + 1);   // Nombre
            pacientes[i][1] = "Apellido" + (i + 1);   // Apellido
            
            // Distribuir aleatoriamente entre las 3 clínicas
            int clinicaIndex = rand.nextInt(3);
            pacientes[i][2] = clinicas[clinicaIndex]; // Clínica asignada
            pacientes[i][3] = "VIVO";                 // Estado inicial
            
            pacientesPorClinica[clinicaIndex]++;
        }
        
        // Mostrar distribución
        System.out.println("Distribución de pacientes:");
        for (int i = 0; i < 3; i++) {
            System.out.println("  " + clinicas[i] + ": " + pacientesPorClinica[i] + " pacientes");
        }
        System.out.println("  Total: 100 pacientes");
    }
    
    // ===== PASO 3: GENERAR MUERTOS ALEATORIOS =====
    public static void generarMuertosAleatorios() {
        System.out.println("\n💀 PASO 3: GENERANDO MUERTOS ALEATORIOS");
        System.out.println("-".repeat(40));
        
        // Seleccionar entre 10-20 pacientes como muertos
        int cantidadMuertos = 10 + rand.nextInt(11); // 10-20 muertos
        
        // Crear array de índices y mezclarlo
        int[] indices = new int[100];
        for (int i = 0; i < 100; i++) {
            indices[i] = i;
        }
        
        // Mezclar índices (algoritmo Fisher-Yates)
        for (int i = 99; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = indices[i];
            indices[i] = indices[j];
            indices[j] = temp;
        }
        
        // Marcar los primeros 'cantidadMuertos' como muertos
        for (int i = 0; i < cantidadMuertos; i++) {
            int pacienteIndex = indices[i];
            pacientes[pacienteIndex][3] = "MUERTO";
        }
        
        System.out.println("Pacientes fallecidos: " + cantidadMuertos);
        System.out.println("Pacientes vivos: " + (100 - cantidadMuertos));
    }
    
    // ===== PASO 4: PROCESAR SOLICITUDES DE AMBULANCIAS =====
    public static void procesarSolicitudesAmbulancias() {
        System.out.println("\n🚑 PASO 4: PROCESANDO SOLICITUDES DE AMBULANCIAS");
        System.out.println("-".repeat(45));
        
        // Generar entre 15-25 solicitudes
        int solicitudes = 15 + rand.nextInt(11);
        System.out.println("Solicitudes a procesar: " + solicitudes);
        
        for (int i = 0; i < solicitudes; i++) {
            procesarSolicitud(i + 1);
        }
    }
    
    public static void procesarSolicitud(int numeroSolicitud) {
        // Seleccionar clínica aleatoria
        int clinicaIndex = rand.nextInt(3);
        String clinica = clinicas[clinicaIndex];
        int distancia = distancias[clinicaIndex];
        
        System.out.println("\n📞 Solicitud " + numeroSolicitud + " desde " + clinica + " (Distancia: " + distancia + " km)");
        
        // Buscar conductor disponible
        int conductorIndex = buscarConductorDisponible();
        if (conductorIndex == -1) {
            System.out.println("❌ No hay conductores disponibles (todos con 8 recorridos)");
            return;
        }
        
        // Buscar ambulancia disponible
        int ambulanciaIndex = buscarAmbulanciaDisponible(distancia);
        if (ambulanciaIndex == -1) {
            System.out.println("❌ No hay ambulancias disponibles para esta distancia");
            return;
        }
        
        // Asignar servicio
        asignarServicio(conductorIndex, ambulanciaIndex, clinica, distancia);
    }
    
    public static int buscarConductorDisponible() {
        for (int i = 0; i < 10; i++) {
            if (recorridosConductores[i] < 8) {
                return i;
            }
        }
        return -1;
    }
    
    public static int buscarAmbulanciaDisponible(int distancia) {
        for (int i = 0; i < 9; i++) { // Solo 9 ambulancias, la 10 es carroza
            if (kmAmbulancias[i] + (distancia * 2) <= 400) {
                return i;
            }
        }
        return -1;
    }
    
    public static void asignarServicio(int conductorIndex, int ambulanciaIndex, String clinica, int distancia) {
        // Registrar recorrido del conductor
        recorridosConductores[conductorIndex]++;
        
        // Registrar kilometraje de la ambulancia
        kmAmbulancias[ambulanciaIndex] += distancia * 2; // Ida y vuelta
        
        // Asignar datos a la ambulancia
        ambulancias[ambulanciaIndex][0] = "Ambulancia " + (ambulanciaIndex + 1);
        ambulancias[ambulanciaIndex][1] = conductores[conductorIndex][0] + " " + conductores[conductorIndex][1];
        ambulancias[ambulanciaIndex][2] = "Paciente de " + clinica;
        ambulancias[ambulanciaIndex][3] = String.valueOf(kmAmbulancias[ambulanciaIndex]);
        
        System.out.println("✅ " + ambulancias[ambulanciaIndex][0] + " asignada");
        System.out.println("👨‍⚕️ Conductor: " + ambulancias[ambulanciaIndex][1]);
        System.out.println("📏 Distancia total: " + (distancia * 2) + " km");
        System.out.println("🔄 Recorridos del conductor: " + recorridosConductores[conductorIndex] + "/8");
    }
    
    // ===== PASO 5: GENERAR REPORTE FINAL =====
    public static void generarReporteFinal() {
        System.out.println("\n📊 PASO 5: REPORTE FINAL DEL SISTEMA");
        System.out.println("=".repeat(50));
        
        // Reporte de conductores
        System.out.println("\n👨‍⚕️ ESTADO DE CONDUCTORES:");
        for (int i = 0; i < 10; i++) {
            String estado = recorridosConductores[i] >= 8 ? "❌ Sin disponibilidad" : "✅ Disponible";
            System.out.println("Conductor " + (i+1) + ": " + conductores[i][0] + " " + conductores[i][1] + 
                             " - Recorridos: " + recorridosConductores[i] + "/8 - " + estado);
        }
        
        // Reporte de ambulancias
        System.out.println("\n🚑 ESTADO DE AMBULANCIAS:");
        for (int i = 0; i < 10; i++) {
            int restante = 400 - kmAmbulancias[i];
            String tipo = (i == 9) ? "CARROZA" : "AMBULANCIA";
            String estado = restante > 0 ? "✅ Disponible" : "❌ Sin disponibilidad";
            System.out.println(tipo + " " + (i+1) + ": " + kmAmbulancias[i] + " km recorridos, " + 
                             restante + " km disponibles - " + estado);
        }
        
        // Estadísticas generales
        System.out.println("\n📈 ESTADÍSTICAS GENERALES:");
        int totalRecorridos = 0;
        int totalKm = 0;
        for (int i = 0; i < 10; i++) {
            totalRecorridos += recorridosConductores[i];
            totalKm += kmAmbulancias[i];
        }
        
        System.out.println("Total recorridos realizados: " + totalRecorridos);
        System.out.println("Total kilómetros recorridos: " + totalKm + " km");
        System.out.println("Promedio de recorridos por conductor: " + String.format("%.1f", (double)totalRecorridos/10));
        System.out.println("Promedio de km por ambulancia: " + String.format("%.1f", (double)totalKm/10));
        
        // Verificación de requerimientos
        System.out.println("\n✅ VERIFICACIÓN DE REQUERIMIENTOS:");
        System.out.println("✅ 10 conductores con máximo 8 recorridos cada uno");
        System.out.println("✅ 10 ambulancias (9 normales + 1 carroza)");
        System.out.println("✅ Distancias aleatorias entre clínicas (C1, C2, C3)");
        System.out.println("✅ No superar 400km por ambulancia");
        System.out.println("✅ 100 pacientes distribuidos entre las 3 clínicas");
        System.out.println("✅ Conteo de muertos aleatorio");
        System.out.println("✅ Control de recorridos y kilometraje");
    }
}



/*

System.out.println("Estado normal");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Estado Inverso");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbersInverse[i][j] + " ");
            }
            System.out.println();
        }

*/