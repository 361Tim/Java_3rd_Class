package at.tim.basics.arrays;

import java.util.Random;

public class array2 {
    public static void main(String[] args) {

        int sum = 0;

        int[] arr = new int[50];

        Random ranNumber = new Random();


        for (int i = 0; i < arr.length; i++) {

            arr[i] = ranNumber.nextInt(100);

            System.out.println(arr[i]);

            sum += arr[i];


        }
        System.out.println("summe: " + sum);
    }
}
