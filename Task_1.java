import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        System.out.println("Случайно-сгенерированные числа:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }

        int countEven = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                countEven++;
            }
        }

        System.out.println("\nКоличество чётных чисел: " + countEven);
    }
}
