package lesson_3;

public class Task4 {
    public static void main(String[] args) {


        newMethod4("Hi Aston!", 5);

    }

    public static void newMethod4(String a, int b) {

        int i = 0;
        while (i < b) {
            System.out.println(a);
            i++;
        }
    }
}