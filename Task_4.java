import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task_4 {

    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 17, Gender.MAN),
                new Student("Екатерина", 17, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN),
                new Student("Роман", 19, Gender.MAN)
        );


        double averageAgeOfMaleStudents = students.stream()
                .filter(student -> student.getGender() == Gender.MAN)
                .mapToInt(Student::getAge)
                .average()
                .orElse(0);

        System.out.println("\nСредний возраст студентов мужского пола: " + averageAgeOfMaleStudents);


        List<Student> conscriptionCandidates = students.stream()
                .filter(student -> student.getGender() == Gender.MAN && student.getAge() >= 18 && student.getAge() <= 27)
                .collect(Collectors.toList());

        System.out.println("\nСтуденты мужского пола, которым грозит призыв: ");
        for (Student student : conscriptionCandidates) {
            System.out.println(student.getName());
        }
    }

    enum Gender {
        MAN,
        WOMAN
    }

    static class Student {
        private String name;
        private int age;
        private Gender gender;

        public Student(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }
    }
}