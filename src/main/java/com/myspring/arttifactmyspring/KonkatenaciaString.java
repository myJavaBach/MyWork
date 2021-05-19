package com.myspring.arttifactmyspring;

public class KonkatenaciaString {

    public static void main(String[] args) {

        System.out.println("Hello");

        m(); //1 вызов метода

        int number;
        number = -20;
        char simvolnumber = 70; // можно цифры - эта соответствует F
        char simvol = 'd'; //можно ТОЛЬКО одну букву, если несколько, то это уже строка

        char ch = '\"'; //создаем кавычки

        System.out.printf("%d, %c, %c\n", number, simvolnumber, simvol);
        System.out.println("Hello " + ch + number + ch + " " + simvolnumber + " " + simvol);
        System.out.println(simvol);

        number = 40; //поменяли значение
        System.out.println(number);

        int num = 121;
        number = num; //записываем одну переменную в другую
        System.out.println(number);


    }

    public static void m() {              //1 чтоб метод отработал (так как он находиться вне зоны метода main)
        System.out.println("Pasha");      //1 надо вызвать его

    }
}
