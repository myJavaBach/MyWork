package com.myspring.arttifactmyspring;

/* Форматированный вывод
 *  МАРКЕРЫ
 *  %d - целое число
 *  %f - вещественное число
 *  %c - символ
 *  %s - строка
 *
 *  ЗНАК ОПЕРАЦИИ
 *  \n - новая строка
 *  \t - табуляция
 *  \" - двойная кавычка
 *  \' - одинарная кавычка
 *  \\ - левый слеш
 */



public class Formatter1 {
    public static void main (String[] args) {

        System.out.print("Привет,");
        System.out.print("Мир!\n");   // переведет на след. строку
        System.out.println("\tHello"); // переведет на след. строку
        System.out.print("Mi\n");   // переведет на след. строку

        char myChar = '!';
        int a = 175;
        String str = "Вывод";
        System.out.printf("Сумма значений: \"%d\"\nФорматированный %s\t%c\t\n", a, str, myChar);

    }

}

