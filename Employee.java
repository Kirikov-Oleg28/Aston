import java.util.Arrays;

public class Employee {

    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n " +
                        "Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);
    }
    public static void main(String[] args) {

        Employee[] persArray = new Employee[6];
        persArray[0] = new Employee("Вячеслав Кобрин", "Генеральный директор", "vk@primer,ru", "+79996665544", 250000, 55);
        persArray[1] = new Employee("Иван Зайцев", "Директор по развитию", "vz@primer,ru", "+79998884455", 127000, 42);
        persArray[2] = new Employee("Дмитрий Медведев", "Охранник", "dm@primer,ru", "+79997771234", 19000, 21);
        persArray[3] = new Employee("Олеся Лисина", "Ведущий разработчик", "ol@primer,ru", "+79995554789", 120000, 28);
        persArray[4] = new Employee("Кристина Волкова", "Директор по работе с клиентами", "kv@primer,ru", "+79994445896", 138000, 48);
        persArray[5] = new Employee("Олег Кириков", "Директор ", "kv@primer,ru", "+79994445896", 138000, 37);

        System.out.println(Arrays.toString(persArray));
    }
}