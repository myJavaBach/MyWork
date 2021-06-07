/*
*
* Для праздника Профессор купил голубые, красные и жёлтые воздушные шары.
* Всего n штук. Жёлтых и голубых вместе — a. Красных и голубых — b штук.
* Сколько голубых, красных и жёлтых шаров купил Профессор?
*
*
* */

package com.myspring.tasks;

import java.util.Scanner;

public class ProfessorAndBall {
    public static void main(String[] args) {
        Scanner insc = new Scanner(System.in);
        System.out.println("Vsego sharov: ");
        int sum = insc.nextInt();
        System.out.println("a: ");
        int a = insc.nextInt();
        System.out.println("b: ");
        int b = insc.nextInt();

        int blue;
        int red;
        int yellow;

        red = sum - a;
        blue = b - red;
        yellow = a - blue;

        System.out.print("red: " + red + " blue: " + blue + " yellow: " + yellow);
    }
}
