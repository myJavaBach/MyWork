/*
* Простое число - это число,
* которое делится нацело без остатка только на 1 и на самого себя.
* Также известно, что любое целое число, большее 1, является либо простым,
* либо может быть выражено как произведение простых чисел.
*
* */

package com.myspring.dirloop;

public class LoopPrimeNumbers {

    public static void main(String[] args) {

//        for (int i = 2; i <= 100; i ++) {
//            boolean isPrime = true;
//
//            for (int j = 2; j < i; j ++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        if (isPrime) {
//            System.out.println(i);
//        }

// используя циклы с метками

        out_for:
        for (int i = 50; i <= 100; i ++) {
            for (int j = 2; j < i; j ++) {
                if (i % j == 0) {
                    continue out_for;
                }
            }
            System.out.println(i);
        }



    }

}
