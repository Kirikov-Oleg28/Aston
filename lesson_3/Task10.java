package lesson_3;

import java.util.Arrays;
import java.util.Scanner;

class Task10 {
    public static void main(String[] args)
    {

        newMethod10();

    }

    public static void newMethod10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int len = scanner.nextInt();
        System.out.println("Введите значение элментов массива");
        int initialValue = scanner.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; ++i) {
            arr[i] = initialValue;
            System.out.println(arr[i] + " ");
        }
    }
}
