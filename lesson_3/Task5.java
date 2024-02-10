package lesson_3;

import javax.swing.*;

public class Task5 {
    public static void main(String[] args) {

        newMethod5(2016);
    }

    public static void newMethod5(int a) {

        System.out.println ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0);
    }
}