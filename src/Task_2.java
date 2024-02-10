public class Task_2 {
    public static void main(String[] args) {

        checkSumSign();
    }

    public static void checkSumSign() {

        int a = 1;
        int b = -10;
        int c = a + b;
        if (c >= 0)
            System.out.println("Сумма положительна");
        else {
            System.out.println("Сумма отрицательна");
        }
    }
}
