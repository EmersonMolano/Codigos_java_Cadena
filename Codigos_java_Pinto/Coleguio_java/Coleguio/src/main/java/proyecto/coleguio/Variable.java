/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.coleguio;

import java.util.Scanner;

/**
 *
 * @author Familia M.C
 */
public class Variable {
    public static Scanner sc = new Scanner(System.in);
    public static int election = 0;
    
    //Ubicacion
    
    public static String regional;
    public static String centro;
    public static String sede;
    public static String nombreCoordinador;
    
    public static String[][] automatizacionMedellin = {
    {"Línea de Tecnologías de la Información", "Análisis y Desarrollo de Software", "Diseño e Integración de Automatización Mecatrónica"},
    {"Línea de Automatización", "Electricidad Industrial", "Electrónica Aplicada"}
    };

    public static String[][] textilItagui = {
        {"Línea Textil", "Diseño de Moda", "Gestión de Producción Textil"},
        {"Línea de Gestión", "Gestión Empresarial", "Logística Empresarial"}
    };

    public static String[][] agropecuarioPalmira = {
        {"Línea Agropecuaria", "Producción Agrícola", "Producción Pecuaria"},
        {"Línea Ambiental", "Manejo de Recursos Naturales", "Gestión Ambiental"}
    };

    public static String[][] electricidadCali = {
        {"Línea de Electricidad", "Instalaciones Eléctricas", "Automatización Industrial"},
        {"Línea de Energías Renovables", "Sistemas Fotovoltaicos", "Energía Eólica"}
    };

    public static String[][] disenoBogotaNorte = {
        {"Línea de Diseño", "Diseño Industrial", "Modelado 3D"},
        {"Línea de Metrología", "Metrología Industrial", "Control de Calidad"}
    };

    public static String[][] gestionRicaurte = {
        {"Línea de Gestión", "Gestión de Talento Humano", "Gestión de Proyectos"},
        {"Línea de Producción", "Producción Industrial", "Logística de Producción"}
    };

    //Ambientes
    public static int ambienteCantidad;
    public static int ambienteEspecializado;
    
    //Aprendices
    public static int aprendizCantidad;
    public static String regionActual = regional;
}
