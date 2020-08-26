package com.learn.lib.IntegerProgram;

public class FactorialNumber {
    public static void main(String arg[])
    {
        int n= fact(5);
        System.out.println(n);
    }

    private static int fact(int no)
    {
        if (no==1 || no==0)
        {
            return 1;
        }

        return no*fact(no-1);
    }
}
