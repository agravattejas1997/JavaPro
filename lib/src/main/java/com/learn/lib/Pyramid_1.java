package com.learn.lib;

public class Pyramid_1 {
    public static void main(String[] arg) {
        // Pyramid 1


        int no = 6;
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            for (int j = no; j > i; j--) {
                System.out.print("*");

            }

            System.out.println();


        }


    }
}
