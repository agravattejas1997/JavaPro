package com.learn.lib.PyramidProgram;

public class Pyramid_6 {
    public static void main(String[] args) {
        int n=5;

        for (int i = 1; i <=n; i++) {

            int c =1;
            for (int j = n; j >n-i ; j--) {

                System.out.print(" "+c);
                c++;
            }
            System.out.println();
        }
    }
}
