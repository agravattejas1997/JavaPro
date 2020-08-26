package com.learn.lib.StringProgram;

public class FirstAndLastCharSwap {
    public static void main(String[] args) {

        String s1 = "Tejas";
        swapChar(s1);

    }

    private static void swapChar(String s1) {

        if (s1.length()<2)
            System.out.println(s1);

        char[] chars = s1.toCharArray();
        char tmp = chars[0];
        chars[0]=chars[chars.length-1];
        chars[chars.length-1] = tmp;

        for (char c : chars)
        {
            System.out.print(c);
        }

    }

}
