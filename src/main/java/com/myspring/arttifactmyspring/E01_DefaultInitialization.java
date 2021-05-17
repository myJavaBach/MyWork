package com.myspring.arttifactmyspring;

public class E01_DefaultInitialization {
    int i;
    char c;
    public E01_DefaultInitialization() {
        System.out.println("i = " + 1);
        System.out.println("c = [" + c + ']');
    }
    public static void main(String[] args) {
        new E01_DefaultInitialization();
    }
} /* Output:
i = 0
c = [ ]
*///:~