import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static List<Consumer> getConsumers(File inputFile) throws IOException {
        List<Consumer> consumers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            reader.readLine();
            String line = reader.readLine();

            while (line != null) {
                String[] input = line.split("\\|");
                Consumer consumer = SourceParser.generateConsumer(input);
                consumers.add(consumer);
                line = reader.readLine();
            }
        }
        return consumers;
    }
}
