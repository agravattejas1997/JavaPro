package com.learn.lib.StringProgram;

public class CountNoOfWordsInString {
    public static void main(String [] args)
    {
        String s1 = " Tejas Agravat Im Tejas Tejasssss  ";
        int c = countWord(s1);
        System.out.println(c);


    }

    private static int countWord(String s1) {
        return s1.isEmpty()? 0:s1.trim().split(" ").length;
    }

}
