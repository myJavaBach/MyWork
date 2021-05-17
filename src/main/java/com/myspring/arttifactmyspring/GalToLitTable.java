/*
 * Упражнение 1.2
 *	Эта программа отображает таблицу перевода галлонов в литры.
 *	Присвойте файлу с исходным кодом имя GalToLitTable.java
 */


package com.myspring.arttifactmyspring;


public class GalToLitTable {
    public static void main(String[] args) {
        double , liters;
        int counter;

        counter = 0; //Счетчик который инициализируется нулевым значением

        for ( = 1;  <= 100;  ++) {
            liters =  * 3.7854;

            System.out.println( + " галлонам соответствует " + liters + " литра.");

            counter++; //Увеличиваем счетчик строк на 1 на каждой итерации цикла

            if (counter == 10) { //Если значение счетчика равно 10, вывести пустую строку
                System.out.println();
                counter = 0; //Сбросить счетчик строк
            }
        }
    }
}
