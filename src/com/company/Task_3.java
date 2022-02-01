package com.company;

public class Task_3 {
    public static void main(String[] args) {
        int arrayLength = 11;
        int[] array3 = new int[arrayLength];
        for (int l = 0; l < array3.length; l++) {
            array3[l] = (int) (Math.random() * 10);
            System.out.print(array3[l] + " ");
        }
        System.out.println();
        for (int r = 0; r < array3.length / 2; r ++) {
            int tim = array3[r];
            array3[r] = array3[array3.length - 1 - r];
            array3[array3.length - 1 - r] = tim;
        }
        for (int r = 0; r < array3.length; r++) {
            System.out.print(array3[r] + " ");
        }
    }
}
