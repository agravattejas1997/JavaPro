package com.learn.lib.StringProgram;

//public class StringPangram {
//    static int size =26;
//
//    private static boolean isLetter(char c)
//    {
//        if (!Character.isLetter(c))
//            return false;
//        return true;
//    }
//    private static boolean allLetter(String str, int len)
//    {
//        str=str.toLowerCase();
//        boolean[] present = new boolean[size];
//
//        for (int i=0;i<len;i++)
//        {
//            if (isLetter(str.charAt(i)))
//            {
//                present[str.charAt(i)-'a'] =true;
//            }
//
//        }
//        for (int i=0;i<size;i++)
//        {
//            if (!present[i])
//                return false;
//
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//
//        String s ="ABCDEFGHIJABD123KLmnopqrstuvwxyzZY";
//        if (allLetter(s,s.length()))
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//
//
//    }
//}

public class StringPangram {
    public static void main(String[] args) {
        boolean present = true;
        String s = "abcdefghijklmnopqrstuvwxyz";
        for (char c = 'a'; c <= 'z'; c++) {
            if (!s.contains(String.valueOf(c))) {
                present = false;
                break;
            }
        }
        if (present)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
