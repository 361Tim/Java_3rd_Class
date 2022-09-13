package at.tim.basics.arrays;

public class array {
    public static void main(String[] args) {

        int sum = 0;

        int[] arr = {12,20,30,40,57,61,75,87,89,11};



        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
