package lesson_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        newMethod1(10, 21);
    }

    public static boolean newMethod1(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }
}