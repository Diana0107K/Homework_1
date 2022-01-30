package com.company;

public class Task_6 {

        public static void main(String[] args) {
            int[][] kv1 = {{1, 2, 6, 4}, {4, 3, 2, 6}, {4, 2, 3, 5}, {3, 5, 7, 9}};
            int[][] kv2 = {{2, 3, 6, 4}, {8, 3, 4, 6}, {4, 9, 3,0}, {1, 5, 5, 9}};
            System.out.println("Сумма матриц: ");
            for (int i = 0; i < kv1.length; i++){
                for (int j = 0; j < kv1[i].length; j++) {
                    int sum = kv2[i][j] + kv1[i][j];
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Разность матриц: ");
            for (int i = 0; i < kv1.length; i++){
                for (int j = 0; j < kv1[i].length; j++) {
                    int razn = kv1[i][j] - kv2[i][j];
                    System.out.print(razn + " ");
                }
                System.out.println();
            }
        }
    }
