package com.mycompany.hospital;

public class Muertos {
    public static Datos da = new Datos();

    public static void muertos() {
        System.out.println("Ingrese los datos de los fallecidos (máximo 15): ");
        for (da.i = 0; da.i < 15; da.i++) {
            System.out.println("Fallecido " + (da.i + 1) + ":");
            System.out.print("Nombre: ");
            da.muertos[da.i][0] = da.sc.nextLine();
            System.out.print("Causa de muerte: ");
            da.muertos[da.i][1] = da.sc.nextLine();
        }

        System.out.println("\n--- Lista de Fallecidos Registrados ---");
        for (da.i = 0; da.i < 15; da.i++) {
            System.out.println((da.i + 1) + ". " + da.muertos[da.i][0] + " - Causa: " + da.muertos[da.i][1]);
        }
    }
}
