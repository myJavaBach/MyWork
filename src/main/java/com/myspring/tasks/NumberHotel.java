/*
* Отель имеет n этажей. Лобби, ресторан и тренажерный зал расположены на первом этаже.
* Номера находятся со 2-го по n-ый этажи.
* На каждом этаже расположено m стандартных номеров.
* Если каждый стандартный номер вмещает 3 гостя,
* какое наибольшее количество гостей может поместиться во всех стандартных номерах отеля?
*
*
* */

package com.myspring.tasks;

import java.util.Scanner;

public class NumberHotel {

    public static int quantity(int floor, int room) {
        int sum = (floor - 1) * room * 3;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vesti kolich. floor: ");
        int f = sc.nextInt();
        System.out.println("vesti kolich room");
        int r = sc.nextInt();

        System.out.println("Kolich. gostey " + quantity(f, r));
    }



}
