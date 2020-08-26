package com.learn.lib.IntegerProgram;

public class CommonElementTwoArray {

    public static void main(String[] args)
    {
        int[] a1 ={10,20,30,40,50};
        int[] a2 ={10,50,60,80,30};
        String s ="Tejas";
        System.out.println(s);
        s +=" Agravat";
        System.out.println(s);



        if (a1.length==a2.length)
        {
            for (int i=0;i<a1.length;i++)
            {
                for (int j=0;j<a1.length;j++)
                {
                    if (a1[i]==a2[j])
                    {
                        System.out.println(a1[i]);
                    }
                }
            }
        }

    }
}
