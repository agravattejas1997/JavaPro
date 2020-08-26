package com.learn.lib.PyramidProgram;
/*


 */
public class Pyramid_4 {
    public static void main(String[] args) {

        int n =5;
        for (int i=0;i<n;i++)
        {
            for (int j=(n-i)*2;j>=0; j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i; k++)
            {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}