import javax.swing.*;

public class Task_3 {
    public static void main(String[] args) {

        printColor();
    }

    public static void printColor() {

        int value = -678;
        if (value <= 0) {
            System.out.println("Красный");
        } else if ( value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
}

