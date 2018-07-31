package com.academy.lesson03;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Task11Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int arr = scanner.nextInt();

        Random random = new Random();
        int[] arr1 = new int[arr];
        for (int i = 0; i < arr; i++){
            arr1[i] = random.nextInt(10);
        }
        System.out.println("Исходный: "+ Arrays.toString(arr1));

        for (int i = 0; i < arr1.length / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
        }
        System.out.println("Обратный: " + Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println("Отсортированный: " + Arrays.toString(arr1));











    }
}
