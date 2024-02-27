import java.util.ArrayList;
import java.util.Collections;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Highload");
        collection.add("High");
        collection.add("High");
        collection.add("Load");
        collection.add("Highload");
        collection.add("Load");

        int countHigh = Collections.frequency(collection, "High");
        System.out.println("\nОбъект 'High' встречается: " + countHigh + " раз(а)");

        String firstElement = collection.isEmpty() ? "0" : collection.get(0);
        System.out.println("\nПервым в коллекции расположен: " + firstElement);

        String lastElement = collection.isEmpty() ? "0" : collection.get(collection.size() - 1);
        System.out.println("\nПоследним в коллекции расположен: " + lastElement);
    }
}