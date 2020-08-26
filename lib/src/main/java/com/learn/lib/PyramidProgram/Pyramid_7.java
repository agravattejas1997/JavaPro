package com.learn.lib.PyramidProgram;

public class Pyramid_7
{
    public static void main(String[] args) {
        int n=5,c=1;

        for (int i = 0; i < n; i++) {

            for (int j = n; j >=n-i ; j--) {
                System.out.print(" "+c++);
            }
            System.out.println();
        }
    }
}
