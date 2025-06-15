package com.mycompany.hospital;

public class Funeraria {
    public static Datos da = new Datos();

    public static void funeraria() {
        System.out.println("Asignación de la carroza fúnebre:");

        System.out.print("Asignar conductor para la carroza: ");
        da.carroza[0] = da.sc.nextLine();

        System.out.print("Asignar fallecido para la carroza: ");
        da.carroza[1] = da.sc.nextLine();

        System.out.println("\n--- Reporte Carroza Fúnebre ---");
        System.out.println("Conductor: " + da.carroza[0]);
        System.out.println("Fallecido: " + da.carroza[1]);
    }
}
