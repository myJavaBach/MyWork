package com.myspring.dirmethods;

public class Recursion6TowerOfHanoi {
//    static void move (int n, int start, int finish) {
//        if (n == 1) {
//            System.out.println("disk: " + n + " peremestit s " + start + " na " + finish);
//        }
//        else {
//            //vremennij sterjen (predpolojim start 1, finish 3 togda vremennij 6-1-3=2)
//            int tmp = 6 - start - finish;
//            move(n - 1, start, tmp);
//            System.out.println("disk: " + n + " peremestit s " + start + " na " + finish);
//            move(n - 1, tmp, finish);
//        }
//    }
//
//    public static void main(String[] args) {
//        move(3, 1, 3);
//    }


//    более изящное решение

    public static String move(int n, int start, int finish) {
        if (n == 1) {
            return start + " -> " + finish + ";";
        }
        else {
            String sol1, sol2, sol3;
            int tmp = 6 - start - finish;
            sol1 = move(n - 1, start, tmp);
            sol2 = start + " -> " + finish + ";";
            sol3 = move(n - 1, tmp, finish);
            return sol1 + sol2 + sol3;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        String StepToSolution = move(n, 1, 3);

        for (String step : StepToSolution.split(";")) {
            System.out.println(step);
        }
    }
}
