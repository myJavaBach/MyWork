package com.myspring.dirmethods;

public class Recursion2Super {
    private static int depth = 0;

    public static void recursion(int x) {
        in(x);
        if (check(x)) {
            recursion(2 * x);
        }
        out(x);
    }

    public static boolean check(int y) {
        spaces();
        System.out.println("(y < 15): " + (y < 15));
        return y < 15;
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
        recursion(1);
    }


}

