package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter number \n");
        int input = read.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        do{
            arr.add(input % 10);

            input /= 10;
        }while (input > 0);

        int res = 0;

        for(int val : arr) {
            res += val;
        }

        System.out.print(res);

    }
}
