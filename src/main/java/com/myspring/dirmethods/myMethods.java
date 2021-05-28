package com.myspring.dirmethods;

public class myMethods {

    public static int exampleVariableOne = 100;

    public static void main(String[] args) {
//        System.out.println(count());

        int count = 5;
        int count1 = 5;
        System.out.println("countbefore = " + count + " " + count1);


        for(count = 1; count <= 5; count++) {
            System.out.println("Hello");
            count1 = 10;

        }
        System.out.println("countafter = " + count + " " + count1);

    }
//  Вторая реализация -  циклом while

//    public static String count() {
//        while (exampleVariableOne > 0) {
//            if (exampleVariableOne == - 25) {
//                return "exampleVariableOne is 25";
//            }
//            exampleVariableOne--;
//        }
//        // returns the statement below if exampleVariableOne
//        // is never equal to 25
//        return "exampleVariableOne is never equal to 25";
//    }
}