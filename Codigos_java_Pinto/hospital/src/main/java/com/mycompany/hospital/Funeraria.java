package com.mycompany.hospital;

import static com.mycompany.hospital.BuscarConductor.buscarConductor;

public class Funeraria {
    public static Datos da = new Datos();

    public static void funeraria() {
        System.out.println("Asignación de carroza fúnebre:");

        System.out.print("Nombre del conductor: ");
        String conductor = da.sc.nextLine();
        int conductorIndex = buscarConductor(conductor);

        if (conductorIndex == -1 || da.recorridosConductores[conductorIndex] >= 8) {
            System.out.println("Conductor inválido o ya hizo 8 recorridos.");
            return;
        }

        System.out.print("Nombre del fallecido: ");
        String fallecido = da.sc.nextLine();

        da.carroza[0] = conductor;
        da.carroza[1] = fallecido;
        da.recorridosConductores[conductorIndex]++;
        da.kmAmbulancias[9] += da.distanciaFuneraria * 2;
        da.historialAmbulancias[9][da.recorridosConductores[conductorIndex] - 1] = "Viaje funeraria";

        System.out.println("--- Carroza Fúnebre ---");
        System.out.println("Conductor: " + conductor + ", Fallecido: " + fallecido);
    }

}
