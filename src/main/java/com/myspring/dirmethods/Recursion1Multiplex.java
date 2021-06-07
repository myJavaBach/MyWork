/*
*
* Сложная рекурсия
* Вызов метода себя через другой метод
*
* */


package com.myspring.dirmethods;

public class Recursion1Multiplex {

    static  void recursion(int counter) {

        counter--;

        System.out.println("Pervja polovina metoda recursion: " + counter);

        if (counter != 0)
            method(counter);

        System.out.println("Vtoraja polovina metoda recursion: " + counter);
    }

    static void method(int counter) {

        System.out.println("Pervja polovina metoda method: " + counter);

        recursion(counter);

        System.out.println("Vtoraja polovina metoda method: " + counter);

    }

    public static void main(String[] args) {
        method(3);
    }
}


