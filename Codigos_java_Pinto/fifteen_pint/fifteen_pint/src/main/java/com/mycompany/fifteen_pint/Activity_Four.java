/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fifteen_pint;

/**
 *
 * @author Familia M.C
 */
public class Activity_Four{
    
        public static void G(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i + " " + j + " " + x);
            }
        }
        if (x > 0) {
            for (int i = 1; i <= 4; i++) {
                G(x / 2);
            }
        }
    }

    public static void main(String[] args) {
        G(4);
    }
}
