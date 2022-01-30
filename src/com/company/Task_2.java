package com.company;

public class Task_2 {

    public static void main(String[] args) {
        int m = 20;
        int sumChetn = 0;
        int[] Fib = new int[m];
        for (int j = 0; j < m; j++) {
            if (j < 2) {
                Fib[j] = j;
            } else {
                Fib[j] = Fib[j - 1] + Fib[j - 2];
            }
            System.out.print(Fib[j] + " ");
            if (Fib[j] % 2 == 0) {
                sumChetn += Fib[j];
            }
        }
        System.out.println();
        System.out.println("Сумма четных до " + m + " = " + sumChetn);
    }
}
