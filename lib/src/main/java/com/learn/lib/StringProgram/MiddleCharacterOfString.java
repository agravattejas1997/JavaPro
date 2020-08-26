package com.learn.lib.StringProgram;

public class MiddleCharacterOfString {

    public static void main(String[] args) {
        String str ="GeeksForGeeks";
        char c = middleChar(str);
        System.out.println(c);
    }

    private static char middleChar(String str) {
        return str.charAt(str.length()/2);


    }
}
