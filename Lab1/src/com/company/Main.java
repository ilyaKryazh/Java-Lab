package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter hours \n");
        Integer hour = read.nextInt();

        System.out.print("Enter minutes \n");
        Integer min = read.nextInt();

        System.out.print("Enter seconds \n");
        Integer sec = read.nextInt();

        if (hour > 99 || min > 59 || sec > 59){
            System.out.print("Invalid format");
            System.exit(0);
        }

        System.out.print(hour + ":" + min + ":" + sec);
    }
}
