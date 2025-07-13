package Paqueteria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author La manada del Sena
 */
public class Pedido {
    public static void main(String[] args) {
        
    // Productos simples
    Producto martillo = new Producto("Martillo", 20);
    Producto telefono = new Producto("Teléfono", 200);
    Producto auriculares = new Producto("Auriculares", 50);
    Producto cargador = new Producto("Cargador", 25);

    // Caja pequeña con productos
    Caja cajaChica = new Caja(5);//El 5 es un precio adicional por la caja
    cajaChica.agregar(auriculares);
    cajaChica.agregar(cargador);

    // Caja mediana con un producto y otra caja
    Caja cajaMediana = new Caja(8);
    cajaMediana.agregar(telefono);
    cajaMediana.agregar(cajaChica);

    // Caja grande (pedido principal)
    Caja pedido = new Caja(10);
    pedido.agregar(martillo);
    pedido.agregar(cajaMediana);

    // Mostrar precio total
    System.out.println("Precio total del pedido: $" + pedido.obtenerPrecio());
    }
}
