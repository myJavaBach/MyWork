/*
 * Упражнение 1.2
 *	Эта программа отображает таблицу перевода галлонов в литры.
 *	Присвойте файлу с исходным кодом имя GalToLitTable.java
 */


package com.myspring.arttifactmyspring;


public class GalToLitTable {
    public static void main(String[] args) {
        double gal, liters;
        int counter;

        counter = 0; //Счетчик который инициализируется нулевым значением

        for (gal = 1;gal <= 100;gal++) {
            liters = gal * 3.7854;

            System.out.println(gal + " галлонам соответствует " + liters + " литра.");

            counter++; //Увеличиваем счетчик строк на 1 на каждой итерации цикла

            if (counter == 10) { //Если значение счетчика равно 10, вывести пустую строку
                System.out.println();
                counter = 0; //Сбросить счетчик строк
            }
        }
    }
}
