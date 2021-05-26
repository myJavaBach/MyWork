package com.myspring.codewars;

public class Kyu85SummationFactorial {

    public static int summation(int n) {

// Вообще крутой
        return  n*(n+1)/2;

//  Мой вариант
//        int sum = 1;
//
//        for (int i = 2; i < n + 1; i++) {
//            sum += i;
//        }
//
//        return sum;
    }

    public static void main(String[] args) {

        System.out.println(summation(8));
    }
}
