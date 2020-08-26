package com.learn.lib.IntegerProgram;

public class ArmstrongRange {
    public static void main(String[] args) {
        int no=700;
        for (int i=1;i<=no;i++)
        {
            if (isArmStrong(i))
            {
                System.out.print(i+ " ");
            }
        }
    }
    private static boolean  isArmStrong(int no)
    {
        int arm =0;
        int rem=1;
        int temp=no;
        while (no!=0)
        {
            rem = no%10;
            arm+=rem*rem*rem;
            no/=10;
        }
        if (temp == arm)
            return true;
        return false;
    }
}
