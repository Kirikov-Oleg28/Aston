package lesson_3;

public class Task2 {

    public static void main(String[] args) {

        newMethod2(-9);

    }
    static void newMethod2(int a) {
        if (a >= 0)
            System.out.println("Число положительное");
        else {
            System.out.println("Число отрицательное");;
        }
    }
}