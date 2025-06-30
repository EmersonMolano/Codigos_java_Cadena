package com.mycompany.hospital;
import java.util.Scanner;

public class Datos {
    //------Scanner--------
    public static Scanner sc = new Scanner(System.in);

    //-----Contadores-------
    public static int counter = 0, i, j;

    // -----Conductor-------
    public static String[][] conductores = new String[10][3];
    //--nombre, apellido, celular--

    //------Paciente--------
    
    public static String[][] pacientes = new String[100][5];
    //--nombre, apellido, tel, edad, sangre
    
    //------Fallecidos------
    public static String[][] muertos = new String[15][2];
    //--nombre, causa--

    //------- Ambulancias --------
    public static String[][] ambulancias = new String[10][3];
    //-- numero de ambulancia, conductor asignado, paciente asignado--

    //------ Carroza funebre -------
    public static String[] carroza = new String[2];
    //-- conductor asignado, fallecido asignado--
    
    //---------- Clinica -----------
    public static String[] clinicas = {"C1", "C2", "C3"};
    public static int[] distancias = {55, 35, 55};
    public static int distanciaFuneraria = 15;
    public static int[] distanciasClinica = {55, 35, 55};

    // Recorridos por conductor (máx. 8)
    public static int[] recorridosConductores = new int[10];

    // Kilómetros por ambulancia (máx. 400)
    public static int[] kmAmbulancias = new int[10];

    // Historial de viajes por ambulancia (máx. 10 recorridos cada una)
    public static String[][] historialAmbulancias = new String[10][10];

    // Estado: si paciente murió
    public static boolean[] estaMuerto = new boolean[100];
}
