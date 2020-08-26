package com.learn.lib.StringProgram;

public class RemoveFirstAndLastCharacter {
    public static void main(String[] args) {

        String s1 ="Java";
        removeFirstAndLastChar(s1);
    }

    private static void removeFirstAndLastChar(String s1) {

        System.out.println(""+s1.substring(1,s1.length()-1));
    }
}
