import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader implements DataReader {
    File inputFile;

    public CsvReader(File inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    public List<DataObject> getData() throws IOException {
        List<DataObject> consumers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            ConsumerGenerator parser = new ConsumerGenerator();
            reader.readLine();
            String line = reader.readLine();

            while (line != null) {
                String[] input = line.split("\\|");
                DataObject consumer = parser.generateData(input);
                consumers.add(consumer);
                line = reader.readLine();
            }
        }
        return consumers;
    }
}