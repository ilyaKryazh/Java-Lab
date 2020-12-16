package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter blacklist \n");
        String blacklist = read.nextLine();

        System.out.print("Enter phrase \n");
        String input = read.nextLine();

        boolean result = hasNoneLetters(input, blacklist);
        System.out.print(result);
    }

     static boolean hasNoneLetters(String read, String blacklist){

        String[] list = blacklist.toUpperCase().split("");
        String phrase = read.toUpperCase();

        for (String i: list) {
            if(phrase.contains(i)){
                return false;
            }
        }
        return true;
    }
}
