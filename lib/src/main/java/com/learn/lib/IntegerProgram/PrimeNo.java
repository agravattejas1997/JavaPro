package com.learn.lib.IntegerProgram;

public class PrimeNo {

    public static void main(String[] args) {
        int no=29;
        boolean flag = false;
        for (int i=2;i<=no/2;i++)
        {
            if (no%i==0)
            {

            }
            else
            {
                System.out.println(i);

            }
        }
        if (!flag)
            System.out.println(no+" Is Prime");
        else
            System.out.println(no+" Not Prime");
    }
}

