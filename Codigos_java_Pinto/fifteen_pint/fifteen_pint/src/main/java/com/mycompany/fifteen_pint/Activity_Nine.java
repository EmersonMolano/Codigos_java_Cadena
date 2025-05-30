package com.mycompany.fifteen_pint;

public class Activity_Nine {
    public static void main(String[] args){
        System.out.println("T(n) = 2T(n/4) + log(n) → Usar Master Theorem:");
        System.out.println("a=2, b=4, f(n)=log n => f(n) ∈ o(n^{log_b(a)}) = o(n^{0.5}) => caso 1: T(n) ∈ Θ(n^{log_4(2)}) = Θ(n^{0.5})");
    }
}
