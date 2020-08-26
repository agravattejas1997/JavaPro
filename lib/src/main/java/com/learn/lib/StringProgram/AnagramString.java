package com.learn.lib.StringProgram;

public class AnagramString {

    public static void main(String[] arg)
    {
        String word = "army";
        String anagram="mary";

        boolean b = isAnagram(word,anagram);
        System.out.println();
        if (b)
            System.out.println(word +" - "+anagram+" : "+"Both String Are Anagram");
        else
            System.out.println(word +" - "+anagram+" : "+"Both String Are Not Anagram");
    }

    private static boolean isAnagram(String word, String anagram) {

        String  anag = anagram;
        if (word.length()!=anag.length())
        {
            return false;
        }

        for (char c: word.toCharArray())
        {
            int index = anag.indexOf(c);
            System.out.println(index);
            if (index!=-1) {
                anag = anag.substring(0,index)+anag.substring(index+1,anag.length());
                System.out.println(anag);
            }
            else
                return false;

        }
        return anag.isEmpty();

    }
}
