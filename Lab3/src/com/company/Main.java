package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter sentence \n");

        String input = read.nextLine();

        String[] words = input.split("\\W+");

        int elem = words[0].length();

        for (int i = 1; i < words.length; i++){
            if(words[i].length() > elem){
                elem = words[i].length();
            }
        }
        System.out.print(elem);
    }
}
