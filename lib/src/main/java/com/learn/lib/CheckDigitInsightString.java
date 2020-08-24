package com.learn.lib;

public class CheckDigitInsightString {

    public static void main(String[] arg)
    {
        String s ="1Tejas";
        if (checkDigit(s))
        {
            System.out.println("Yes Digit");
        }
        else
            System.out.println("No Digit");

    }
    private static boolean checkDigit(String string)
    {
        if (string!=null)
        {
            for (char c:string.toCharArray())
            {
                if (c>='0' && c<='9')
                {
                    return true;
                }
                else
                    return false;
            }
        }
        return false;
    }

}
