import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //D:\JavaProjects\Javaproj\SandBox\SustUsers\src\main\resources\data.csv
        System.out.println("Enter csv file path:");
        File inputFile = new File(scanner.nextLine());;
        System.out.println("Enter MAX Water consumption:");
        final int MAX_WATER_CONSUMPTION = scanner.nextInt();
        System.out.println("Enter MAX gas consumption:");
        final int MAX_GAS_CONSUMPTION = scanner.nextInt();
        System.out.println("Enter max electricity consumption");
        final int MAX_ELECTRO_CONSUMPTION = scanner.nextInt();

        CsvWriter.write(Assessor.assess(MAX_WATER_CONSUMPTION,
                MAX_GAS_CONSUMPTION, MAX_ELECTRO_CONSUMPTION, CsvReader.getConsumers(inputFile)), inputFile);
    }
}
