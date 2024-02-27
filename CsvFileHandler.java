import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvFileHandler {

    private static final String CSV_SEPARATOR = ";";

    public static void save(AppData data, String filePath) {
        try (PrintWriter writer = new PrintWriter(new File(filePath))) {
            StringBuilder headers = new StringBuilder();
            for (String header : data.getHeaders()) {
                headers.append(header).append(CSV_SEPARATOR);
            }
            writer.println(headers.toString());

            for (List<Integer> row : data.getData()) {
                StringBuilder sb = new StringBuilder();
                for (Integer value : row) {
                    sb.append(value).append(CSV_SEPARATOR);
                }
                writer.println(sb.toString());
            }

            System.out.println("Данные успешно записаны в файл: " + filePath);
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка записи данных в файл: " + e.getMessage());
        }
    }

    public static AppData load(String filePath) {
        List<String> headers = new ArrayList<>();
        List<List<Integer>> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            if (line != null) {
                String[] headerTokens = line.split(CSV_SEPARATOR);
                for (String header : headerTokens) {
                    headers.add(header.trim());
                }

                while ((line = reader.readLine()) != null) {
                    String[] dataTokens = line.split(CSV_SEPARATOR);
                    List<Integer> row = new ArrayList<>();
                    for (String token : dataTokens) {
                        row.add(Integer.parseInt(token.trim()));
                    }
                    data.add(row);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }

        return new AppData(headers, data);
    }

    public static void main(String[] args) {
        List<String> headers = List.of("Value 1", "Value 2", "Value 3");
        List<List<Integer>> data = new ArrayList<>();
        data.add(List.of(1, 100, 25));
        data.add(List.of(2, 200, 30));
        data.add(List.of(3, 300, 55));

        AppData appData = new AppData(headers, data);

        save(appData, "data.csv");

        AppData loadedData = load("data.csv");
        loadedData.getHeaders().forEach(System.out::println);
        loadedData.getData().forEach(System.out::println);
    }
}
