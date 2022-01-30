package com.company;

public class Task_3 {
    public static void main(String[] args) {
        int dlinaMassiva3 = 10;
        int[] Invent = new int[dlinaMassiva3];
        for (int l = 0; l < Invent.length; l++) {
            Invent[l] = (int) (Math.random() * 10);
            System.out.print(Invent[l] + " ");
        }
        System.out.println();
        for (int r = Invent.length - 1; r >= 0; r--) {
            System.out.print(+Invent[r] + " ");
        }
    }
}
