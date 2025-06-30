package com.mycompany.hospital;
import static com.mycompany.hospital.BuscarConductor.buscarConductor;
import java.util.Random;
public class Ambulancia {
    public static Datos da = new Datos();
    public static void ambulancia() {
        Random rand = new Random();
        int ambulanciasAsignadas = 0;

        System.out.println("--- Sistema de Asignación de Ambulancias ---");
        System.out.print("¿Cuántas ambulancias deseas asignar? (máximo 9): ");
        int cantidad = da.sc.nextInt();
        da.sc.nextLine();
        
        if (cantidad <= 0 || cantidad > 9) {
            System.out.println("Cantidad inválida. Se asignarán 9 ambulancias por defecto.");
            cantidad = 9;
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Ambulancia " + (i + 1) + " ---");

            // Verificar si la ambulancia ya tiene kilometraje máximo
            if (da.kmAmbulancias[i] >= 400) {
                System.out.println("⚠️ Ambulancia " + (i + 1) + " ha alcanzado su límite de 400 km.");
                continue;
            }

            System.out.print("Nombre del conductor: ");
            String conductor = da.sc.nextLine();

            int conductorIndex = buscarConductor(conductor);
            if (conductorIndex == -1) {
                System.out.println("❌ Conductor no encontrado. Verifica el nombre.");
                continue;
            }
            
            if (da.recorridosConductores[conductorIndex] >= 8) {
                System.out.println("❌ Conductor ya completó sus 8 recorridos máximos.");
                continue;
            }

            int clinicaIndex = rand.nextInt(3);
            int distancia = da.distanciasClinica[clinicaIndex];

            if (da.kmAmbulancias[i] + distancia * 2 > 400) {
                System.out.println("❌ Ambulancia excedería el límite de 400 km.");
                continue;
            }

            System.out.print("Nombre del paciente: ");
            String paciente = da.sc.nextLine();

            // Verificar si el paciente existe
            if (!pacienteExiste(paciente)) {
                System.out.println("⚠️ Paciente no registrado en el sistema.");
            }

            // Asignar ambulancia
            da.ambulancias[i][0] = "Ambulancia " + (i + 1);
            da.ambulancias[i][1] = conductor;
            da.ambulancias[i][2] = paciente;

            // Registrar recorrido
            da.kmAmbulancias[i] += distancia * 2;
            da.recorridosConductores[conductorIndex]++;
            da.historialAmbulancias[i][da.recorridosConductores[conductorIndex] - 1] = "Viaje a " + da.clinicas[clinicaIndex];

            System.out.println("✅ Ambulancia asignada exitosamente");
            System.out.println("📍 Destino: " + da.clinicas[clinicaIndex]);
            System.out.println("📏 Distancia: " + distancia * 2 + " km (ida y vuelta)");
            ambulanciasAsignadas++;
        }
        
        System.out.println("\n--- Resumen de Asignaciones ---");
        System.out.println("Ambulancias asignadas: " + ambulanciasAsignadas + " de " + cantidad);
        mostrarEstadoAmbulancias();
    }
    
    private static boolean pacienteExiste(String nombre) {
        for (int i = 0; i < 100; i++) {
            if (da.pacientes[i][0] != null && da.pacientes[i][0].equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    private static void mostrarEstadoAmbulancias() {
        System.out.println("\n--- Estado Actual de Ambulancias ---");
        for (int j = 0; j < 10; j++) {
            int restante = 400 - da.kmAmbulancias[j];
            String estado = restante > 0 ? "✅ Disponible" : "❌ Sin disponibilidad";
            System.out.println("Ambulancia " + (j+1) + ": " + da.kmAmbulancias[j] + " km usados, " + restante + " km disponibles - " + estado);
        }
    }
}
