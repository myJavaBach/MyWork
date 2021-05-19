package com.myspring.codewars;

public class Kyu83RemoveFirstandLastCharacter {

    public static String remove(String str) {

//        int a = str.length() - 1;
//        String substr2 = str.substring(1,a);
//        return substr2;

//        return str.substring(1,str.length() - 1);

        return str.replaceAll("^.|.$", "");

    }


    public static void main(String[] args) {

//        int cut = 4;
//        String s = "Hello world";
//        String f = "%." + (s.length() - cut) + "s";
//        System.out.printf(f, "hello world");

        String str = "0123456789";

        System.out.println(remove(str));

    }
}




