package com.mycompany.hospital;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class SistemaAmbulancias {
    public static Datos da = new Datos();
    private static Random rand = new Random();
    
    public static void ejecutarSistemaCompleto() {
        System.out.println("🏥 SISTEMA DE GESTIÓN DE AMBULANCIAS");
        System.out.println("=".repeat(50));
        
        // 1. Distribuir 100 pacientes entre las 3 clínicas
        distribuirPacientes();
        
        // 2. Generar muertos aleatorios
        generarMuertosAleatorios();
        
        // 3. Procesar solicitudes de ambulancias
        procesarSolicitudesAmbulancias();
        
        // 4. Generar reporte final
        generarReporteFinal();
    }
    
    private static void distribuirPacientes() {
        System.out.println("\n📋 DISTRIBUCIÓN DE 100 PACIENTES ENTRE CLÍNICAS");
        System.out.println("-".repeat(40));
        
        // Crear 100 pacientes
        for (int i = 0; i < 100; i++) {
            da.pacientes[i][0] = "Paciente" + (i + 1);
            da.pacientes[i][1] = "Apellido" + (i + 1);
            da.pacientes[i][2] = "Tel" + (300000000 + i);
            da.pacientes[i][3] = String.valueOf(20 + rand.nextInt(60)); // Edad 20-80
            da.pacientes[i][4] = "Tipo" + (rand.nextInt(4) + 1); // Tipo sangre
        }
        
        // Distribuir aleatoriamente entre clínicas
        int[] pacientesPorClinica = {0, 0, 0};
        for (int i = 0; i < 100; i++) {
            int clinica = rand.nextInt(3);
            pacientesPorClinica[clinica]++;
        }
        
        System.out.println("Pacientes en C1: " + pacientesPorClinica[0]);
        System.out.println("Pacientes en C2: " + pacientesPorClinica[1]);
        System.out.println("Pacientes en C3: " + pacientesPorClinica[2]);
        System.out.println("Total pacientes: " + 100);
    }
    
    private static void generarMuertosAleatorios() {
        System.out.println("\n💀 GENERACIÓN DE MUERTOS ALEATORIOS");
        System.out.println("-".repeat(40));
        
        // Seleccionar aleatoriamente entre 10-20 pacientes como muertos
        int cantidadMuertos = 10 + rand.nextInt(11); // 10-20 muertos
        
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < 100; i++) indices.add(i);
        Collections.shuffle(indices);
        
        for (int i = 0; i < cantidadMuertos; i++) {
            int index = indices.get(i);
            da.estaMuerto[index] = true;
            da.muertos[i][0] = da.pacientes[index][0] + " " + da.pacientes[index][1];
            da.muertos[i][1] = "Causa" + (rand.nextInt(5) + 1);
        }
        
        System.out.println("Pacientes fallecidos: " + cantidadMuertos);
        System.out.println("Pacientes vivos: " + (100 - cantidadMuertos));
    }
    
    private static void procesarSolicitudesAmbulancias() {
        System.out.println("\n🚑 PROCESAMIENTO DE SOLICITUDES DE AMBULANCIAS");
        System.out.println("-".repeat(40));
        
        // Generar solicitudes aleatorias (entre 15-25)
        int solicitudes = 15 + rand.nextInt(11);
        System.out.println("Solicitudes a procesar: " + solicitudes);
        
        for (int i = 0; i < solicitudes; i++) {
            procesarSolicitud(i + 1);
        }
    }
    
    private static void procesarSolicitud(int numeroSolicitud) {
        // Seleccionar clínica aleatoria
        int clinicaIndex = rand.nextInt(3);
        String clinica = da.clinicas[clinicaIndex];
        int distancia = da.distancias[clinicaIndex];
        
        System.out.println("\n📞 Solicitud " + numeroSolicitud + " desde " + clinica + " (Distancia: " + distancia + " km)");
        
        // Buscar conductor disponible
        int conductorIndex = buscarConductorDisponible();
        if (conductorIndex == -1) {
            System.out.println("❌ No hay conductores disponibles");
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
    
    private static int buscarConductorDisponible() {
        for (int i = 0; i < 10; i++) {
            if (da.conductores[i][0] != null && da.recorridosConductores[i] < 8) {
                return i;
            }
        }
        return -1;
    }
    
    private static int buscarAmbulanciaDisponible(int distancia) {
        for (int i = 0; i < 9; i++) { // Solo 9 ambulancias, la 10 es carroza
            if (da.kmAmbulancias[i] + (distancia * 2) <= 400) {
                return i;
            }
        }
        return -1;
    }
    
    private static void asignarServicio(int conductorIndex, int ambulanciaIndex, String clinica, int distancia) {
        // Registrar recorrido
        da.recorridosConductores[conductorIndex]++;
        da.kmAmbulancias[ambulanciaIndex] += distancia * 2; // Ida y vuelta
        
        // Registrar en historial
        int recorridosConductor = da.recorridosConductores[conductorIndex];
        da.historialAmbulancias[ambulanciaIndex][recorridosConductor - 1] = 
            "Viaje a " + clinica + " - Conductor: " + da.conductores[conductorIndex][0] + 
            " - Distancia: " + (distancia * 2) + " km";
        
        System.out.println("✅ Ambulancia " + (ambulanciaIndex + 1) + " asignada");
        System.out.println("👨‍⚕️ Conductor: " + da.conductores[conductorIndex][0] + " " + da.conductores[conductorIndex][1]);
        System.out.println("📏 Distancia total: " + (distancia * 2) + " km");
        System.out.println("🔄 Recorridos del conductor: " + da.recorridosConductores[conductorIndex] + "/8");
    }
    
    private static void generarReporteFinal() {
        System.out.println("\n📊 REPORTE FINAL DEL SISTEMA");
        System.out.println("=".repeat(50));
        
        // Reporte de conductores
        System.out.println("\n👨‍⚕️ ESTADO DE CONDUCTORES:");
        for (int i = 0; i < 10; i++) {
            if (da.conductores[i][0] != null) {
                String estado = da.recorridosConductores[i] >= 8 ? "❌ Sin disponibilidad" : "✅ Disponible";
                System.out.println("Conductor " + (i+1) + ": " + da.conductores[i][0] + " " + da.conductores[i][1] + 
                                 " - Recorridos: " + da.recorridosConductores[i] + "/8 - " + estado);
            }
        }
        
        // Reporte de ambulancias
        System.out.println("\n🚑 ESTADO DE AMBULANCIAS:");
        for (int i = 0; i < 10; i++) {
            int restante = 400 - da.kmAmbulancias[i];
            String tipo = (i == 9) ? "CARROZA" : "AMBULANCIA";
            String estado = restante > 0 ? "✅ Disponible" : "❌ Sin disponibilidad";
            System.out.println(tipo + " " + (i+1) + ": " + da.kmAmbulancias[i] + " km recorridos, " + 
                             restante + " km disponibles - " + estado);
        }
        
        // Estadísticas generales
        System.out.println("\n📈 ESTADÍSTICAS GENERALES:");
        int totalRecorridos = 0;
        int totalKm = 0;
        for (int i = 0; i < 10; i++) {
            totalRecorridos += da.recorridosConductores[i];
            totalKm += da.kmAmbulancias[i];
        }
        
        System.out.println("Total recorridos realizados: " + totalRecorridos);
        System.out.println("Total kilómetros recorridos: " + totalKm + " km");
        System.out.println("Promedio de recorridos por conductor: " + String.format("%.1f", (double)totalRecorridos/10));
        System.out.println("Promedio de km por ambulancia: " + String.format("%.1f", (double)totalKm/10));
    }
} 