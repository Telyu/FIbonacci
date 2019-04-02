package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here

        Scanner ucok = new Scanner(System.in);
        int i = 1, t1 = 0, t2 = 1;
        System.out.println("Input Jumlah Angka Fibonacci: ");
        int n = ucok.nextInt();
        System.out.print("\nFirst " + n + " terms: \n");

        while (i <= n)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }
}
