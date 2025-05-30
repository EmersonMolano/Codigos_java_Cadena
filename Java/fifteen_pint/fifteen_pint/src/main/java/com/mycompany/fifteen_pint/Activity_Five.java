/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.fifteen_pint;

/**
 *
 * @author Familia M.C
 */

import java.util.Scanner;

public class Activity_Five {
        public static void main(String[] args) {
        
        int number,i,h = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escribe hasta que necesitas: ");
        number = scanner.nextInt();
                
        for ( i = 1; i <= number; i++) {
            
            h = h +i;
            
            System.out.println("The number is: " + h);
        }
        
        System.out.println("Hello World!");
        
        
        scanner.close();
    }
}
