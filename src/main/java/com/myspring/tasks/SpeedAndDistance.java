/*
* Три богатыря шли из Бразилии в Киевскую Русь.
* Шли они со скоростью n метров в минуту и должны пройти r расстояние километров.
* Сколько дней им понадобится для преодоления пути?
*
* */

package com.myspring.tasks;

import java.util.Scanner;

public class SpeedAndDistance {

    public static double day(double sp, double di) {
        double resul;
        return resul =di / ((sp / 1000) * 1440);
    }

    public static void main(String[] args) {
        Scanner insc = new Scanner(System.in);
        System.out.print("Ввести скорость: ");
        double speed = insc.nextDouble();
        System.out.print("Ввести расстояние: ");
        double dist = insc.nextDouble();
        // отмечу, что double отформатировали до 0 знаков после запятой
        System.out.println("для расстояния: " + dist + "  км необходимо: " + String.format("%.0f", day (speed, dist)) + " дней");
    }
}
