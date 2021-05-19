package com.myspring.codewars;

public class Kyu81boolToWord {

    public static String boolToWord(boolean b) {
// Лучшее альтернативное решение
//        return b ? "Yes" : "No";

// Мое решение
        String str = String.valueOf(b);

// мой if
        if (str == "true") {
// Проще if, и тогда String.valueOf(b) не надо:)
//        if (true) {
            str = "Yes";
        } else {
            str = "No";
        }
                return str;
    }

    public static void main(String[] args) {
//        boolean bool = true;
        boolean bool = false;

        System.out.println(boolToWord(bool));
    }
}
