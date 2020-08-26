package com.learn.lib.IntegerProgram;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int no=13;
        int tmp=no;
        int rem;
        int arm = 0;
        while (no!=0)
        {
            rem = no%10;
            arm += rem*rem*rem;
            no=no/10;
        }
        if (arm==tmp) {
            System.out.println("Yes : " + tmp + " Is Armstrong : " + arm);
        }
        else
            System.out.println("No : "+"Is Not Armstrong : "+tmp);
    }
}
