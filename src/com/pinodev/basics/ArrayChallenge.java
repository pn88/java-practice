package com.pinodev.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] table = new int[length];
        for (int i = 0; i < table.length; i++) {
            System.out.println("Enter the " + (i + 1) + " number");
            table[i] = scanner.nextInt();
        }
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i]);
        }
        Arrays.sort(table);
        System.out.println(Arrays.toString(table));
    }
}