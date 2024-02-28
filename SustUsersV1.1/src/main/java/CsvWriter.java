import java.io.*;
import java.util.List;

public class CsvWriter implements DataWriter{
    @Override
    public void write(List<Consumer> consumers, File inputFile) throws IOException {
        File sustList = new File("src/main/resources/sust.csv");
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(sustList))) {
            String header = reader.readLine();
            if (!(consumers.isEmpty())) {
                bufferedWriter.write(header);
                bufferedWriter.newLine();
                for (Consumer consumer : consumers) {
                    bufferedWriter.write(consumer.toString());
                    bufferedWriter.newLine();
                }
            }
        }
    }
}
