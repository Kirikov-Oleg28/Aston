package org.example;

public class Factorial {
    public int calculateFactorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
