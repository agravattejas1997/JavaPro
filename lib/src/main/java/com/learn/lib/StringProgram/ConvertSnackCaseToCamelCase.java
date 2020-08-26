package com.learn.lib.StringProgram;

public class ConvertSnackCaseToCamelCase {
    public static void main(String[] args) {

        String s ="tEjaS_agravat_pravin_bhai_";

        SnackToCamel(s);
    }

    private static void SnackToCamel(String s) {

        String[] strings = s.split("_");

        for (String s1 :strings)
        {
            s1 = s1.toLowerCase();
            System.out.print(s1.toUpperCase().charAt(0)+""+s1.substring(1)+"");
        }
    }

}
