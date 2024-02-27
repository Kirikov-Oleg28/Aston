import java.util.Scanner;
import java.util.ArrayList;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> logins = new ArrayList<>();

        System.out.println("Введите логины (для завершения введите пустую строку):");

        while (true) {
            String login = scanner.nextLine();
            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }

        System.out.println("Логины, начинающиеся на букву 'f':");
        for (String login : logins) {
            if (login.toLowerCase().startsWith("f")) {
                System.out.println(login);
            }
        }
    }
}