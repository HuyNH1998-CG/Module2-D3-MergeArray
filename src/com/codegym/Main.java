package com.codegym;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Input to array1 element " + i + " :");
            array1[i] = input.nextInt();
        }
        for (int j = 0; j < array2.length; j++) {
            System.out.println("Input to array2 element " + j + " :");
            array2[j] = input.nextInt();
        }
        int position = 0;
        for (int k : array1) {
            array3[position] = k;
            position++;
        }
        for (int g : array2){
            array3[position] = g;
            position++;
        }
        System.out.println(Arrays.toString(array3));
    }
}
