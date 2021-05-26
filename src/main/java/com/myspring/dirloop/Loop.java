/*
*
*   Learn LOOP
*
*
* */

package com.myspring.dirloop;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // program - число созданное программой
        // user - число введенное пользователем
        int user;
        int program;

        //количество попыток ввода пользователем
        int count = 0;

        // Метод Math.random() — в Java используется для генерации случайного числа в диапазоне от 0.0 до 1.0.
        // Различные диапазоны могут быть достигнуты с помощью арифметики.

        // Генерируем случайное целое число от -10 до 10 (исключая ноль)
        // (так как метод генерирует double, то приводим его к int)
        do {
            program = (int) (Math.random() * 21) - 10;
        } while (program == 0);

        System.out.println("Я загадал число от -10 до 10, отгадайте его.");
        System.out.println("Введите ваше число: ");

        Scanner input = new Scanner(System.in);

        // hasNextInt() — метод проверяет, является ли следующая порция введенных данных числом,
        // или нет (возвращает, соответственно, true или false)

        // Проверяем, есть ли в потоке ввода целое число
        if (input.hasNextInt() ) {
            do {
                //считаем количество попыток, которое потребовалось пользователю, чтобы угадать число
                ++count;

                // Метод nextInt() считывает и возвращает введенное число.
                // В нашей программе он используется для того, чтобы присвоить значение переменной user

                // Читаем с потока ввода целое число
                user = input.nextInt();

                if (user == program) {
                    System.out.println("Вы угадали! Число попыток: " + "" + count);
                } else {
                    // Проверяем входит ли число в отрезок -10+10
                    if (user >= -10 && user <= 10) {
                        System.out.println("Вы не угадали. ");


                        // подсказка пользователю, что он ошибся в знаке, если программа загадала положительное число
                        if (program < 0) {
                            System.out.println("Мое число отрицательное...");
                        } else {
                            System.out.println("Мое число положительное...");
                        }

                        // если число загаданное программой меньше...
                        if (program < user) {
                            System.out.println("Мое число меньше...");
                        } else {
                            System.out.println("Мое число больше...");
                        }


                    } else {
                        System.out.println("Ваше число вообще не из нужного отрезка.");
                    }
                }
            } while (user != program);

        } else {
            System.out.println("Ошибка. вы не ввели целое число!");
        }
        System.out.println("Goodbye!");
    }
}
