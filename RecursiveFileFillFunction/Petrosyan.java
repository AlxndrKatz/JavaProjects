import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Petrosyan {

    public static void main(String[] args) throws IOException {
        System.out.println("Type DIR and press ENTER");
        try (Scanner scanner = new Scanner(System.in)) {

            String path = scanner.nextLine();
            //String path = "D:\JokeDir";
            System.out.println("Enter \'c\' to INSERT or \'d\' to DELETE \'Joke.java\'");
            String command = scanner.nextLine();

            if (command.equals("c")) {
                Runner.inspect(path, new Injector());
            }
            if (Objects.equals(command, "d")) {
                Runner.inspect(path, new Deleter());
            }
        }
    }
}
