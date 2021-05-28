/*
*
* Простая рекурсия
*
*
* */

package com.myspring.dirmethods;

public class SimpleRecursion1 {

    static void recursion (int counter) {

        counter--;

        System.out.println("Pervaya polovina metoda: " + counter);

        if (counter != 0)
            recursion(counter);

        System.out.println("Vtoraya polovina metoda: " + counter);
    }

    public static void main(String[] args) {
        recursion(10);
    }
}
