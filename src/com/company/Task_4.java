package com.company;

public class Task_4 {
    public static void main(String[] args) {
        int[][] dvumern = {{-5, 2, 8, 0}, {4, -5, 6, -7}, {2, 1, -1, 0}};
        int Polozh = 0;
        int Otrith = 0;
        for (int r = 0; r < dvumern.length; r++) {
            for (int d = 0; d < dvumern[r].length; d++) {
                if (dvumern[r][d] > 0) {
                    Polozh += 1;
                } else if (dvumern[r][d] == 0) {
                    continue;
                } else {
                    Otrith += 1;
                }
            }
        }
        if (Polozh > Otrith) {
            System.out.println("Положительных чисел больше");
        } else if (Polozh == Otrith) {
            System.out.println("Положительных и отрицательных равное количество");
        } else {
            System.out.println("Отрицательных чисел больше");
        }
    }
}
