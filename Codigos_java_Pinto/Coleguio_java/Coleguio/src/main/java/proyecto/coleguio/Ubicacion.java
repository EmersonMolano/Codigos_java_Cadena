/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.coleguio;

/**
 *
 * @author Familia M.C
 */

public class Ubicacion extends Variable {

    public static void Ubicacion() {
        int opcionUbicacion;

        do {
            System.out.println("------------------------------------------------");
            System.out.println("1. Seleccionar Ubicación (Región → Centro → Sede)");
            System.out.println("2. Ingresar un Coordinador");
            System.out.println("3. Volver al menú principal");
            System.out.println("------------------------------------------------");
            System.out.print("Selecciona una opción: ");
            opcionUbicacion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer

            switch (opcionUbicacion) {
                case 1:
                    seleccionarUbicacionCompleta();
                    break;
                case 2:
                    ingresarCoordinador();
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcionUbicacion != 3);
    }

    public static void seleccionarUbicacionCompleta() {
        int reg, cen, sed;

        // Selección de Región
        System.out.println("---- REGIONES DISPONIBLES ----");
        System.out.println("1. Antioquia");
        System.out.println("2. Valle del Cauca");
        System.out.println("3. Bogotá");
        System.out.print("Selecciona la región: ");
        reg = sc.nextInt();
        sc.nextLine();

        switch (reg) {
            case 1:
                regional = "Antioquia";
                // Centros de Antioquia
                System.out.println("---- CENTROS EN ANTIOQUIA ----");
                System.out.println("1. Centro de Automatización Industrial");
                System.out.println("2. Centro Textil y de Gestión Industrial");
                System.out.print("Selecciona el centro: ");
                cen = sc.nextInt();
                sc.nextLine();
                switch (cen) {
                    case 1:
                        centro = "Centro de Automatización Industrial";
                        System.out.println("---- SEDES ----");
                        System.out.println("1. Sede Medellín");
                        System.out.print("Selecciona la sede: ");
                        sed = sc.nextInt();
                        sc.nextLine();
                        if (sed == 1) sede = "Sede Medellín";
                        break;
                    case 2:
                        centro = "Centro Textil y de Gestión Industrial";
                        System.out.println("---- SEDES ----");
                        System.out.println("1. Sede Itagüí");
                        System.out.print("Selecciona la sede: ");
                        sed = sc.nextInt();
                        sc.nextLine();
                        if (sed == 1) sede = "Sede Itagüí";
                        break;
                    default:
                        System.out.println("Centro no válido.");
                }
                break;

            case 2:
                regional = "Valle del Cauca";
                System.out.println("---- CENTROS EN VALLE ----");
                System.out.println("1. Centro Agropecuario");
                System.out.println("2. Centro de Electricidad y Automatización");
                System.out.print("Selecciona el centro: ");
                cen = sc.nextInt();
                sc.nextLine();
                switch (cen) {
                    case 1:
                        centro = "Centro Agropecuario";
                        System.out.println("---- SEDES ----");
                        System.out.println("1. Sede Palmira");
                        System.out.print("Selecciona la sede: ");
                        sed = sc.nextInt();
                        sc.nextLine();
                        if (sed == 1) sede = "Sede Palmira";
                        break;
                    case 2:
                        centro = "Centro de Electricidad y Automatización";
                        System.out.println("---- SEDES ----");
                        System.out.println("1. Sede Cali");
                        System.out.print("Selecciona la sede: ");
                        sed = sc.nextInt();
                        sc.nextLine();
                        if (sed == 1) sede = "Sede Cali";
                        break;
                    default:
                        System.out.println("Centro no válido.");
                }
                break;

            case 3:
                regional = "Bogotá";
                System.out.println("---- CENTROS EN BOGOTÁ ----");
                System.out.println("1. Centro de Diseño y Metrología");
                System.out.println("2. Centro de Gestión Industrial");
                System.out.print("Selecciona el centro: ");
                cen = sc.nextInt();
                sc.nextLine();
                switch (cen) {
                    case 1:
                        centro = "Centro de Diseño y Metrología";
                        System.out.println("---- SEDES ----");
                        System.out.println("1. Sede Bogotá Norte");
                        System.out.print("Selecciona la sede: ");
                        sed = sc.nextInt();
                        sc.nextLine();
                        if (sed == 1) sede = "Sede Bogotá Norte";
                        break;
                    case 2:
                        centro = "Centro de Gestión Industrial";
                        System.out.println("---- SEDES ----");
                        System.out.println("1. Sede Ricaurte");
                        System.out.print("Selecciona la sede: ");
                        sed = sc.nextInt();
                        sc.nextLine();
                        if (sed == 1) sede = "Sede Ricaurte";
                        break;
                    default:
                        System.out.println("Centro no válido.");
                }
                break;

            default:
                System.out.println("Región no válida.");
        }

        System.out.println("Ubicación registrada:");
        System.out.println("Regional: " + regional);
        System.out.println("Centro:   " + centro);
        System.out.println("Sede:     " + sede);
        System.out.println("\nProgramas disponibles según la sede seleccionada:");

        if (sede.equals("Sede Medellín")) {
            mostrarProgramas(automatizacionMedellin);
        } else if (sede.equals("Sede Itagüí")) {
            mostrarProgramas(textilItagui);
        } else if (sede.equals("Sede Palmira")) {
            mostrarProgramas(agropecuarioPalmira);
        } else if (sede.equals("Sede Cali")) {
            mostrarProgramas(electricidadCali);
        } else if (sede.equals("Sede Bogotá Norte")) {
            mostrarProgramas(disenoBogotaNorte);
        } else if (sede.equals("Sede Ricaurte")) {
            mostrarProgramas(gestionRicaurte);
        }

    }
    
    public static void ingresarCoordinador() {
        System.out.print("Ingresa el Nombre del Coordinador: ");
        nombreCoordinador = sc.nextLine();
    }
    public static void mostrarProgramas(String[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        System.out.println("▶ " + matriz[i][0] + ":");
        for (int j = 1; j < matriz[i].length; j++) {
            System.out.println("   - " + matriz[i][j]);
        }
    }
}

    
}
