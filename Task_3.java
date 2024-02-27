import java.util.ArrayList;
import java.util.Collections;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("f10");
        collection.add("f15");
        collection.add("f2");
        collection.add("f4");
        collection.add("f4");

        Collections.sort(collection);

        String[] resultArray = new String[collection.size()];
        collection.toArray(resultArray);

        for (String element : resultArray) {
            System.out.println(element);
        }
    }
}
