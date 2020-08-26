package com.learn.lib.StringProgram;

public class FirstAndLastCharFromString {
    public static void main(String[] args) {
        String s ="Tejas";
        findFirstAndLastChar(s);
    }

    private static void findFirstAndLastChar(String s) {

        System.out.print("First Char : "+s.charAt(0)+"\t"+"Last Char : "+s.charAt(s.length()-1));
    }
}
