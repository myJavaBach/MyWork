/*
* Нахождение наибольший общий делитель
*
* */


package com.myspring.dirmethods;


// Первый вариант
public class RecursionNaibObDelitel {

    static int calculate(int a, int b) {

        if (a % b == 0)
            return  b;
        else
            return calculate(b, a % b);
    }

    public static void main(String[] args) {

        System.out.println("nahojdenie naibol ob delitelja");

        int a =676 , b = 3676;

        System.out.println("a = " + a + ", b = " + b + ", NOD = " + calculate(a, b) + ";");
//        System.out.println("a = " + a + ", b = " + b + ", NOD = " + calculate2(a, b) + ";");
    }

// Второй вариант

    static  int calculate2(int a, int b) {

        while (b != 0)
            b = a % (a = b);
        return a;
    }
}
