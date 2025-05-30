package com.mycompany.fifteen_pint;

public class Activity_Fourteen {
    public static void main(String[] args){
        System.out.println("Trivial: Θ(n^2), DyV: T(n) = 2T(n/2) + 2n log n");
        System.out.println("f(n) ∉ Θ(n) → caso 2 del Master Theorem no aplica, caso 3: f(n) ∈ ω(n^{log_2(2)}) = ω(n)");
        System.out.println("Verifica condición regularidad: sí → T(n) ∈ Θ(n log^2 n) → más eficiente que Θ(n^2)");
    }
}
