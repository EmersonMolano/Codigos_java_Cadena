package com.mycompany.hospital;
import static com.mycompany.hospital.Datos.sc;

public class Conductor {
    
    public static Datos da = new Datos();
    public static int counter = 0, i , j;

    public static void conductor() {
        System.out.println("Ingresa los datos de los conductores: ");

        //----Diez conductores con nombre, apellido y telefono---//
        for (da.i = 0; da.i < 1; da.i++) {
            System.out.println("Conductor " + (da.i + 1) + ":");

            System.out.print("Nombre: ");
            sc.nextLine();
            da.conductores[da.i][0] = sc.nextLine();

            System.out.print("Apellido: ");
            da.conductores[da.i][1] = sc.nextLine();

            System.out.print("Teléfono: ");
            da.conductores[da.i][2] = sc.nextLine();
        }
        //---------Mostrar conductores-----------//
        System.out.println("--- Lista de conductores Registrados ---");
        for (da.i = 0; da.i < 1; da.i++) {
            System.out.println("Conductor " + (da.i + 1) + ": " + da.conductores[da.i][0] + " " + da.conductores[da.i][1] + " - Tel: " + da.conductores[da.i][2]);
        }
    
    }
}
