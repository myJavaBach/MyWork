package com.myspring.arttifactmyspring;

//import javax.swing.*; // подключаем ВЕСЬ сторонний класс - для графики
import javax.swing.JOptionPane; // подключаем сторонний класс - для графики
import java.util.Scanner; // подключаем сторонний класс - он терминальный


public class myInputScaner {

    //private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in); // второй равнозначный метод - но ПЕРВЫЙ предподчительней
        //int a = new Scanner(System.in).nextInt(); // третий равнозначный метод - но для ОДНОЙ переменной


        String s1 = JOptionPane.showInputDialog(""); // графическое окно для ввода
        JOptionPane.showMessageDialog(null,s1); // графическое окно для ВЫвода

        //String s1 = in.next(); //выведет до первого пробела, то есть на ПРИВЕТ МИР получим только ПРИВЕТ
//            System.out.println("Вести текст или целое число:");
//            String s1 = in.nextLine(); //выведет все на ПРИВЕТ МИР получим ПРИВЕТ МИР
        System.out.println("Значение переменной = "+s1);
//
//            System.out.println("Вести целое число:");
//            int a = in.nextInt();//             System.out.println("Значение переменной = "+a);
//
//
//            System.out.println("Вести число с запятой (ответ будет с точкой):");
//            double d = in.nextDouble(); //есть тонкость - вводим через запятую - результат через точку
//            System.out.println("Значение переменной = "+d);
    }

}