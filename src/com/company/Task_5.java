package com.company;

public class Task_5 {
    public static void main(String[] args) {
        int[][] Treugol = {{1, 0, 0, 0}, {6, 7, 0, 0}, {2, 9, 8, 0}, {1, 3, 0, 8}};
        int sumVerh = 0;
        for (int h = 0; h < Treugol.length; h++) {
            for (int s = 0; s < Treugol[h].length; s++) {
                System.out.print(Treugol[h][s] + " ");
            }
            System.out.println();
            for (int s = h + 1; s < Treugol[h].length; s++) {
                sumVerh += Treugol[h][s];
            }
        }
        if (sumVerh == 0) {
            System.out.println("Массив является нижней треугольной матрицей");
        } else {
            System.out.println("Массив не является нижней треугольной матрицей");
        }
    }
}
