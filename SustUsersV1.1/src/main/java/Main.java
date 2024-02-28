import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //src/main/resources/data.csv
        System.out.println("Enter csv file path:");
        File source = new File(scanner.nextLine());;
        System.out.println("Enter MAX Water consumption:");
        final int MAX_WATER = scanner.nextInt();
        System.out.println("Enter MAX gas consumption:");
        final int MAX_GAS = scanner.nextInt();
        System.out.println("Enter MAX electricity consumption");
        final int MAX_ELECTRO = scanner.nextInt();

        CsvReader csvReader = new CsvReader();
        List<Consumer> consumerList = csvReader.getData(source);
        ConsumerFilter consumerFilter = new ConsumerFilter();
        List<Consumer> filteredData = consumerFilter.filter(MAX_WATER, MAX_GAS, MAX_ELECTRO, consumerList);
        CsvWriter writer = new CsvWriter();
        writer.write(filteredData, source);
    }
}
