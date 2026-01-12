package gr.aueb.cf.cf9.ch13.hw1;

/**
 * public static μέθοδοι για κοινές μαθηματικές λειτουργίες όπως εύρεση
 * του μέγιστου, ελάχιστου, και μέσου όρου ενός array από integers
 */
public class Mathhelper {

    private Mathhelper() {

    }

    /**
     * returns the maximum element of an array of integers
     * @param arr   the array of integers
     * @return      returns the maximum element of an array of integers
     */
    public static int findArrayMaxElement (int arr[]) {
        int maxElement = arr[0];
        int maxPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxPosition = i;
            }
        }
        return maxElement;
    }

    /**
     *  returns the minimum element of an array of integers
     * @param arr   arr the array of integers
     * @return      returns the minimum element of an array of integers
     */
    public static int findArrayMinElement (int arr[]) {
        int minElement = arr[0];
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
                minPosition = i;
            }
        }
        return minElement;
    }

    /**
     * returns the average of an array of integers
     * @param arr       arr the array of integers
     * @return          the average of the arr of integers
     */
    public static double findArrayAverage (int arr[]) {
        double average = 0;

        average = (double) (findArrSum(arr)) / arr.length;

        return (double) average;
    }

    /**
     * finds the total summary of the arrays' elements
     * @param arr       arr the array of integers
     * @return          returns the total summary of the arrays' elements
     */
    public static int findArrSum (int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
