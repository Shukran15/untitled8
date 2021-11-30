package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {34, 14, 5, 24, 22, 44, 55, 86, 65, 88, 43, 78, 53, 89, 32, 2, 6, 76, 45, 99};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);

        Scanner input = new Scanner(System.in);

        if (sum % 2 == 0 ) {
            System.out.println("ЧЕТНО");
        } else
            System.out.println("НЕЧЕТНО");


    }
}

