package com.learn.lib.StringProgram;

public class ReverseWordsWithVowels {

    public static void main(String[] args) {

        String s ="This Is Java";
        int n = reverse(s);
        System.out.println();
        System.out.println(n);
    }

    private static int reverse(String s) {

        int vc = 0;
        String[] words = s.split(" ");
        for (int i = words.length-1; i >=0; i--) {
            System.out.print(words[i]+" ");
            s = s.toLowerCase();

        }
        for (char c : s.toCharArray())
        {
            if (c=='a' || 'e' == c || c== 'i' || c=='o' || c=='u')
            {
                vc++;
            }
        }
        return vc;
    }
}
