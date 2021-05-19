package com.myspring.codewars;

public class Kyu82FunctTakesTwoParam {

    static String greet(String name, String owner) {

// предложенный
        return "Hello " + (name.equalsIgnoreCase(owner) ? "boss":"guest");
// предложенный
//      return owner.equalsIgnoreCase(name) ? "Hello boss" : "Hello guest";
// Мой вариант
//       String greeting = (owner.equalsIgnoreCase(name)) ? "Hello boss" : "Hello guest";
//       return greeting;
    }


    public static void main(String[] args) {

//        String greeting = greet("Petr", "guest");
        String greeting = greet("Petr", "PetR");
        System.out.println(greeting);

    }
}
