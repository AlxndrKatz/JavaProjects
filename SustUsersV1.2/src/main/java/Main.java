import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //src/main/resources/data.csv
        System.out.println("Enter csv file path:");
        File source = new File(scanner.nextLine());
        int[] maxConsumption = new int[3];
        System.out.println("Enter MAX Water consumption:");
        final int MAX_WATER = scanner.nextInt();
        maxConsumption[0] = MAX_WATER;
        System.out.println("Enter MAX gas consumption:");
        final int MAX_GAS = scanner.nextInt();
        maxConsumption[1] = MAX_GAS;
        System.out.println("Enter MAX electricity consumption");
        final int MAX_ELECTRO = scanner.nextInt();
        maxConsumption[2] = MAX_ELECTRO;

        DataReader reader = new CsvReader(source);
        List<DataObject> consumerList = reader.getData();
        DataFilter filter = new ConsumerFilter(maxConsumption,consumerList);
        List<DataObject> filteredData = filter.filter();
        DataWriter writer = new CsvWriter(source, filteredData);
        writer.write();
    }
}
