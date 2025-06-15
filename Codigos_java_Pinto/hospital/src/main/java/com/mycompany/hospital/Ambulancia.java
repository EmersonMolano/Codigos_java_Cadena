package com.mycompany.hospital;

public class Ambulancia {
    public static Datos da = new Datos();

    public static void ambulancia() {
        System.out.println("Asignación de ambulancias (máximo 10):");

        for (da.i = 0; da.i < 10; da.i++) {
            System.out.println("Ambulancia " + (da.i + 1) + ":");
            System.out.print("Asignar conductor (nombre): ");
            da.ambulancias[da.i][1] = da.sc.nextLine();
            System.out.print("Asignar paciente (nombre): ");
            da.ambulancias[da.i][2] = da.sc.nextLine();
            da.ambulancias[da.i][0] = "Ambulancia " + (da.i + 1);
        }

        System.out.println("\n--- Reporte de ambulancias ---");
        for (da.i = 0; da.i < 10; da.i++) {
            System.out.println(da.ambulancias[da.i][0] + " | Conductor: " + da.ambulancias[da.i][1] + " | Paciente: " + da.ambulancias[da.i][2]);
        }
    }
}
