package ru.geekbrains.java_1.lesson_2.homework;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(changeZeroOne(arr1)));

        int[] arr2 = new int[8];
        System.out.println(Arrays.toString(fillArray(arr2)));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(increaseSmall(arr3)));

        int[] arr4 = {1, -4, 3, 0, 11, -25};
        minMax(arr4);

        int[][] square = new int[5][5];
        fillDiagonal(square);

    }

    private static int[] changeZeroOne(int... arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        return arr;
    }

    private static int[] fillArray(int... arr){
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        return arr;
    }

    private static int[] increaseSmall(int... arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? (arr[i] * 2) : arr[i];
        }
        return arr;
    }

    private static int[] minMax(int... arr){
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i != arr.length; i ++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        int[] arrmm = {min, max};
        System.out.println(Arrays.toString(arrmm));
        return arrmm;
    }

    private static int[][] fillDiagonal(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j){
                    arr[i][j] = 1;
                }
                if (i + j == arr.length - 1){
                    arr[i][j] = 1;
                }
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }


}
