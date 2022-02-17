/**
 * java1. HomeWorkThree
 *
 * @author ZakharovVN
 * @version 17.02.2022
 */

import java.util.Arrays;

public class HomeWorkThree {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();


    }

    static void taskOne() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 1) ? 0 : 1;

        }
        System.out.println(Arrays.toString(array));
    }

    static void taskTwo() {
        int[] arrr = new int[100];
        for (int i = 0; i < arrr.length; i++) {
            arrr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrr));
    }

    static void taskThree() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    static void taskFour() {
        int[][] data = new int[5][5];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i == j) {
                    data[i][j] = 1;
                }
                System.out.print(data[i][j] + " ");


            }
            System.out.println();

        }

    }

    static void taskFive() {
        int[] newArray = getNewArray(5, 777);
        System.out.println(Arrays.toString(newArray));}


    static int[] getNewArray ( int len, int initialValue){
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;

    }
}
