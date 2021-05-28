/*
*
* Конвертирует из десятичной в двоичную систему
*
* */

package com.myspring.dirmethods;

public class ConverterDigittoBinary {

    static void converter(int n) {

        int temp;

        temp = n % 2;

        System.out.println("Pervaya polovina metoda: " + temp);


        if (n >= 2)
            converter(n / 2);

        System.out.println("Vtoraya polovina metoda: " + temp);
    }

    public static void main(String[] args) {

        converter(100);
    }
}
