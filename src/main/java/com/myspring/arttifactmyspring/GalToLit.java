/*
 *	Упражнение 1.1
 *	Программа перевода галлонов в литры.
 *	Присвойте файлу с исходным кодом имя GalToLit.java
 */

package com.myspring.arttifactmyspring;

public class GalToLit {
    public static void main(String[] args) {

        double gal; //  в этой переменной хранится значение
        //  выражающее объем жидкости в галлонах
        double liters; //  в этой переменной хранится значение
        //  выражающее объем жидкости в Литрах

        gal = 10; //начальное значение соот-т 10 галлонов
        liters = gal * 3.7854; //перевести в литры

        System.out.println( + " галлонам соответсвует " + liters + " литров");
    }
}
