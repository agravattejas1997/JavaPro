package com.learn.lib.StringProgram;

public class ReverseString {

    public static void main(String[] arg)
    {
        String nm ="Tejas";

        int len =nm.length();

        String rev = recursive(nm);


        System.out.println(rev);
    }

    private static String recursive(String nm) {

        if (nm.length()<2)
        {
            return nm;
        }
        String s = recursive(nm.substring(1));
        return s+nm.charAt(0);
    }

}
