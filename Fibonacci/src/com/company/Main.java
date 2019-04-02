package com.company;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        new Main().calc(317811, 1);
    }

    public void calc(Integer start, Integer end) {
        Integer f = (int) (start / ((1 + Math.sqrt(5)) / 2));
        System.out.println(f);
        if (f == end) {
            return;
        }
        calc(++f, end);
    }
}
