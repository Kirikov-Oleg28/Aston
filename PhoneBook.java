import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            phoneBook.get(lastName).add(phoneNumber);
        } else {
            Set<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(lastName, phoneNumbers);
        }
    }

    public Set<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Oleg", "123456789");
        phoneBook.add("Stas", "987654321");
        phoneBook.add("Dima", "234534574");
        phoneBook.add("Petr", "223456345722");
        phoneBook.add("Viktorya", "555666777");
        phoneBook.add("Lena", "555666777");
        phoneBook.add("Oleg", "435345735");
        phoneBook.add("Stas", "679708989-");

        System.out.println("Phone numbers for Oleg: " + phoneBook.get("Oleg"));
        System.out.println("Phone numbers for Stas: " + phoneBook.get("Stas"));
    }
}