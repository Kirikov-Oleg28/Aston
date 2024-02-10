package lesson_3;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = 0;  i < 100;  ++i) {
            arr[i] =i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}