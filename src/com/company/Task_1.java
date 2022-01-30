package com.company;

public class Task_1 {

    public static void main(String[] args) {
        int n = 9;
        int dlinaMassiva = 12;
        int sumBezN = 0;
        int[] cromeN = new int[dlinaMassiva];
        for (int i = 0; i < cromeN.length; i++) {
            cromeN[i] = (int) (Math.random() * 10);
            System.out.print(cromeN[i]);
            if (cromeN[i] == n) {
                continue;
            }
            sumBezN += cromeN[i];
        }
        System.out.println();
        System.out.println("Сумма без n = " + sumBezN);
    }
}