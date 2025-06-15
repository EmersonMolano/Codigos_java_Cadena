package com.mycompany.hospital;
import static com.mycompany.hospital.Datos.sc;

public class Pacientes {

    public static Datos da = new Datos();

    public static void pacientes() {
        int cantidad;

        //----------Eleccion----------
        System.out.print("¿Cuántos pacientes deseas registrar? (máximo 100): ");
        while (true) {
            cantidad = sc.nextInt();
            sc.nextLine();
            if (cantidad > 0 && cantidad <= 100) {
                break;
            } else {
                System.out.print("Número inválido. Ingresa un número entre 1 y 100: ");
            }
        }

        //-------Rellenar datos------
        for (da.j = 0; da.j < cantidad; da.j++) {
            System.out.println("Paciente " + (da.j + 1) + ":");

            System.out.print("Nombre: ");
            da.pacientes[da.j][0] = sc.nextLine();

            System.out.print("Apellido: ");
            da.pacientes[da.j][1] = sc.nextLine();

            System.out.print("Teléfono: ");
            da.pacientes[da.j][2] = sc.nextLine();

            System.out.print("Edad: ");
            da.pacientes[da.j][3] = String.valueOf(sc.nextInt());
            sc.nextLine();

            System.out.print("Tipo de Sangre: ");
            da.pacientes[da.j][4] = sc.nextLine();
        }

        //------Mostrar Pacientes reguistrados-------
        System.out.println("--- Lista de pacientes Registrados ---");
        for (da.i = 0; da.i < cantidad; da.i++) {

            System.out.println((da.i + 1) + ". " + 
                da.pacientes[da.i][0] + " " + da.pacientes[da.i][1] + " - Tel: " + da.pacientes[da.i][2] +
                " - Edad: " + da.pacientes[da.i][3] + " - Sangre: " + da.pacientes[da.i][4]);
        }
    }
}
