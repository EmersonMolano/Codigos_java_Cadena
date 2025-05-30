package com.mycompany.fifteen_pint;

public class Activity_Teen {
    
     public static int parcial(int m) {
        if (m == 1) return 1;
        return 2 * parcial(m - 1);
    }

    public static int total(int n) {
        if (n == 1) return 1;
        return total(n - 1) + parcial(n);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total(" + n + ") = " + total(n)); // 1 + 2 + 4 + 8 = 15
    }
}
