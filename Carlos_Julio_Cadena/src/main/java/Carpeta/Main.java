/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carpeta;

/**
 *
 * @author Familia M.C
 */
public class Main {
    public static void main(String[] args){
        
        //Archivos sueltos
        Archivo a1 = new Archivo("notas.txt");
        Archivo a2 = new Archivo("foto.jpg");
    
        //Subcarpeta
        Carpeta subCarpeta = new Carpeta("Imagenes");
        subCarpeta.agregar(new Carpeta("selfie.png"));
        subCarpeta.agregar(new Carpeta("fondo.jpg"));
        
        // Carpeta principal
        Carpeta carpetaPrincipal = new Carpeta("Documentos");
        carpetaPrincipal.agregar(a1);
        carpetaPrincipal.agregar(a2);
        carpetaPrincipal.agregar(subCarpeta);
        
        // Mostrar contenido total
        
        System.out.println(carpetaPrincipal.mostrarContenido());
        
    }
}
