/*
* Между строчками должен быть пробел
* исключение после последней строчки не должно
* быть пробела
*
* */

package com.myspring.codewars;

public class Kyu84MultiplicationTableForNumber {

    public static String multiTable(int num) {

// вариант 1 более оптимизированный, чем мой

//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i <= 10; i++) {
//            int result = i * num;
//            sb.append(i + " * " + num + " = " + result + "\n");
//        }
//        return sb.toString().trim();


// вариант 2 через массив

//        String arr[] = new String[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = String.format("%d * %d = %d", i + 1, num, (i + 1) * num);
//        }
//        return String.join("\n", arr);

// вариант 3 через Тернарный оператор


        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += i + " * " + num + " = " + (i * num) + ((i < 10) ? "\n" : "");
        }
        return result;



// Мой код
//        StringBuilder sb = new StringBuilder();
//        int i = 0;
//        for (i = 1; i <= 9; i++) {
//            sb.append(i).append(" * ").append(num).append(" = ").append(i * num).append("\n");
//        }
//        sb.append(i).append(" * ").append(num).append(" = ").append(i * num);
//        return sb.toString();

    }

    public static void main(String[] args) {

        System.out.println(multiTable(5));

    }

}
