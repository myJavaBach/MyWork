/*
* Алгоритм решения квадратного уравнения ax2 + bx + c = 0
*
*
* */

package com.myspring.dirloop;

import java.util.Scanner;

public class theoremVieta {

    public static void inMethod(double a, double b, double c) {

        double diskriment = b * b - 4 * a * c;
        double koren1;
        double koren2;

        if (diskriment < 0) {
            System.out.print(" korney NET ");
        } else if (diskriment == 0) {
            koren1 = - b / (2 * a);
            System.out.print("koren ODIN i raven " + koren1);
        } else {
            koren1 = (- b + Math.sqrt(diskriment)) / (2 * a);
            koren2 = (- b - Math.sqrt(diskriment)) / (2 * a);
            System.out.println("korney DVA i ravni " + koren1 + " i " + koren2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        inMethod(d, e, f);
    }
}
