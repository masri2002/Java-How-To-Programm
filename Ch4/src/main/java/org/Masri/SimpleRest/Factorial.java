package org.Masri.SimpleRest;

public class Factorial {
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;
    }
}