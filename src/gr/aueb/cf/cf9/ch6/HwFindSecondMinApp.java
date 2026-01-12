package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

public class HwFindSecondMinApp {

    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 45, 32, 15};

        selectionSort(arr);
        printArr(arr);
        System.out.println("2ο μικρότερο: " + arr[1]);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void printArr(int arr[]) {

        for (int i = 0; i <= arr.length -1; i++) {
            System.out.printf("%d" + " ", arr[i]);
        }
        System.out.println();

    }
}