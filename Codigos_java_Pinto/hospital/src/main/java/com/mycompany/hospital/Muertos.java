package com.mycompany.hospital;

public class Muertos {
    public static Datos da = new Datos();

    public static void muertos() {
        int cantidad;
        System.out.print("¿Cuántos fallecidos deseas registrar? (máximo 15): ");
        while (true) {
            cantidad = da.sc.nextInt();
            da.sc.nextLine();
            if (cantidad > 0 && cantidad <= 15) {
                break;
            } else {
                System.out.print("Número inválido. Ingresa un número entre 1 y 15: ");
            }
        }
        
        System.out.println("Ingrese los datos de los fallecidos: ");
        for (da.i = 0; da.i < cantidad; da.i++) {
            
            System.out.println("Fallecido " + (da.i + 1) + ":");
            System.out.print("Nombre: ");
            da.muertos[da.i][0] = da.sc.nextLine();
            System.out.print("Causa de muerte: ");
            da.muertos[da.i][1] = da.sc.nextLine();
        }

        System.out.println("\n--- Lista de Fallecidos Registrados ---");
        for (da.i = 0; da.i < cantidad; da.i++) {
            System.out.println((da.i + 1) + ". " + da.muertos[da.i][0] + " - Causa: " + da.muertos[da.i][1]);
        }
    }
}
