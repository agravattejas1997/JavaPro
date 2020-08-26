package com.learn.lib.StringProgram;

public class CamelCaseToSnackCase {
    public static void main(String[] args) {
        String str = "TejasAgravatPravinBhai";
        camelToSnack(str);
    }

    private static void camelToSnack(String str) {

        String res = "";
        res +=str.toLowerCase().charAt(0);
        for (int i =1;i<str.length();i++)
        {

            if (Character.isUpperCase(str.charAt(i)))
            {
                res+= "_"+str.charAt(i);
            }
            else
                res +=str.charAt(i);
        }
        res=res.toLowerCase();
        System.out.print(res);

    }
}
