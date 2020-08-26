package com.learn.lib.IntegerProgram;

public class PrimeNoRange {
    public static void main(String[] args) {

        printPrime(5);
    }
    private static void printPrime(int no)
    {
        for (int i=2;i<=no;i++)
        {
            if (isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;

        }
        return true;
    }
}
