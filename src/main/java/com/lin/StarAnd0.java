package com.lin;

import java.util.Scanner;

public class StarAnd0 {
    public static void main(String[] args) {
        System.out.println("first number: ");
        Scanner first = new Scanner(System.in);
        int one = first.nextInt();
        System.out.println("second number: ");
        Scanner second = new Scanner(System.in);
        int two = second.nextInt();
        for (int i = 0; i <two - one ; i++) {
            for (int j = 0; j < 20; j++) {
                if (j<one -1 ||j>two-1) {
                    System.out.print("0");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
