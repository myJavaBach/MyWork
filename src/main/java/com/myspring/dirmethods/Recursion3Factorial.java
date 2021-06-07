/*
* Факториал
* n! = n * (n-1) * (n-2) * (n-3) *...* 2 * 1 =
*
*
* 2! = 3! / 3
*
* */



package com.myspring.dirmethods;

public class Recursion3Factorial {
    private static int depth = 0;

    static int factor(int n) {
        in(n);

        if (check(n))
            return 1;
        else {
            int vnutrfactor = factor(n - 1);
            int proiz = n * vnutrfactor;
            out(n);
            System.out.println("Vnutrnnij Faktorial: " + vnutrfactor);
            System.out.println("Proizved: " + proiz);
            return proiz;
        }
    }

    public static boolean check(int y) {
        spaces();
        System.out.println("(y == 0): " + (y == 0));
        return y == 0;
    }
    public static void in(int z){
        spaces();
        System.out.println("(" + z + ")--> ");
        depth++;
    }
    public static void out(int d){
        depth--;
        spaces();
        System.out.println("<--(" + d + ")");
    }
    public static void spaces(){
        for (int k = 0; k < depth; k++) {
            System.out.print("  ");
        }
    }


    public static void main(String[] args) {

        int factorial = factor(5);

        System.out.println("\nITOGO Faktorial: " + factorial);
    }
}
