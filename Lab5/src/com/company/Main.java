package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter x \n");
        int x = read.nextInt();

        System.out.print("Enter n \n");
        int n = read.nextInt();
         int[] multiplies = findMultiples(x, n);


        for (int i: multiplies) {
            System.out.print(i + "\n");
        }
    }

    static int[] findMultiples(int x, int n){
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            n *= i + 1;
            arr[i] = n;
        }
            return arr;
    }
}
