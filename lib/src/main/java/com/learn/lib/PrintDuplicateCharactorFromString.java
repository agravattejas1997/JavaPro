package com.learn.lib;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicateCharactorFromString {
    public static void main(String[] args) {

        // Duplicate Character:

        String nm="javaj2ee";
        checkDuplicateChar(nm);



    }

    public static void checkDuplicateChar(String s)
    {
        HashMap<Character,Integer> hashMap = new HashMap<>();

        int length =s.length();
        for (char c:s.toCharArray())
        {

            if (hashMap.containsKey(c))
            {
                hashMap.put(c,hashMap.get(c)+1);



            }
            else
            {
                hashMap.put(c,1);
            }


        }


        for (Map.Entry entry:hashMap.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}


