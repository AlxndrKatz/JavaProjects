import java.io.*;
import java.util.List;

public class CsvWriter implements DataWriter {
    public File inputFile;
    List<DataObject> filteredData;

    public CsvWriter(File inputFile, List<DataObject> filteredData) {
        this.inputFile = inputFile;
        this.filteredData = filteredData;
    }

    @Override
    public void write() throws IOException {
        File sustList = new File("src/main/resources/sust.csv");
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(sustList))) {
            String header = reader.readLine();
            if (!(filteredData.isEmpty())) {
                bufferedWriter.write(header);
                bufferedWriter.newLine();
                for (DataObject consumer : filteredData) {
                    bufferedWriter.write(consumer.toString());
                    bufferedWriter.newLine();
                }
            }
        }
    }
}