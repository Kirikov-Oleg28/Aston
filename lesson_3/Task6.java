package lesson_3;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0;  i <  arr.length;  i++) {
            if (arr[i] == 0)
                arr[i]++;
            else
                arr[i]--;
        }
        System.out.println(Arrays.toString(arr));
    }
}