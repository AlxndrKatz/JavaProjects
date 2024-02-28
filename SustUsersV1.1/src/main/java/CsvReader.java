import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public List<Consumer> getData(File inputFile) throws IOException {
        List<Consumer> consumers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            SourceParser parser = new SourceParser();
            reader.readLine();
            String line = reader.readLine();

            while (line != null) {
                String[] input = line.split("\\|");
                Consumer consumer = parser.createConsumerData(input);
                consumers.add(consumer);
                line = reader.readLine();
            }
        }
        return consumers;
    }
}
