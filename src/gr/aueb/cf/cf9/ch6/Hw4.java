package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

public class Hw4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr =  {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 0;

        System.out.println("Please enter a number.");

        key = scanner.nextInt();

        int[] resultArr = getLowAndHighIndexOf(arr, key);

        System.out.println("{" + resultArr[0] + ", " + resultArr[1] + "}");

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {

        if (arr == null) return new int[] {-1, -1};

        int lowIndex = 0;
        int highIndex = arr.length - 1;
        int[] keyArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lowIndex = i;
                break;
            }
        }

        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] == key) {
                highIndex = j;
                break;
            }
        }

        return new int[] {arr[lowIndex], arr[highIndex]};
    }
}

