package com.learn.lib.IntegerProgram;

public class CountEvenOrOdd {
    public static void main(String[] arg)
    {
        int no = 2254;
        int even=0,odd=0;

        while (no>0)
        {
            if (no%2==0)
                even++;
            else
                odd++;

            no=no/10;
        }
        System.out.println("Even : "+even);
        System.out.println("Odd : "+odd);

    }
}
