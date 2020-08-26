package com.learn.lib.PyramidProgram;

public class Pyramid_5 {
    public static void main(String[] args) {

        int n=5;
        for (int i=0;i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                System.out.print(" ");
            }

            for (int k=n;k>=n-i;k--)
            {
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
