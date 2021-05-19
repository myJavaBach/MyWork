package com.myspring.arttifactmyspring;

public class Formatter2 {

    public static void main(String[] args) {

        int cut = 4;
        String s = "Hello world";
        String f = "%." + (s.length() - cut) + "s";
        System.out.printf(f, "hello world");

        String str = "0123456789";

    }
}
