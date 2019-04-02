package com.company;

import java.util.Scanner;

public class Main {

    static int calculateSum(int n)
    {
        if (n <= 0)
            return 0;

        int fibo[]=new int[n+1];
        fibo[0] = 0; fibo[1] = 1;

        // Initialize result
        int sum = fibo[0] + fibo[1];

        // Add remaining terms
        for (int i=2; i<=n; i++)
        {
            fibo[i] = fibo[i-1]+fibo[i-2];
            sum += fibo[i];
        }

        return sum;
    }

    static void reverseFibonacci(int n)
    {
        int a[] = new int[n];

        // assigning first and second elements
        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i < n; i++)
        {

            // storing sum in the
            // preceding location
            a[i] = a[i - 2] + a[i - 1];
        }

        for (int i = n - 1; i >= 0; i--)
        {

            // printing array in
            // reverse order
            System.out.print(a[i] +" ");
        }
    }

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

        System.out.println("\n\nSum of Fibonacci" +
                " numbers is : "+ calculateSum(n));


        System.out.println("\nReverse of Fibonacci numbers is : ");
        reverseFibonacci(n);

    }
}
