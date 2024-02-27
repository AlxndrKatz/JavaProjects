import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class Injector implements Function{
    @Override
    public void adjust(File parent) throws IOException {
        File source = new File("src/main/resources/Joke.java");
        String newFileName = "Joke.java";
        File newFile = new File(parent, "Joke.java");
        try (BufferedReader reader = Files.newBufferedReader(source.toPath(), Charset.defaultCharset());
             BufferedWriter writer = Files.newBufferedWriter(newFile.toPath())) {
            List<String> sourceContent = Files.readAllLines(source.toPath());
            newFile.createNewFile();
            for (String line : sourceContent) {
                writer.write(line);
                writer.newLine();
            }
        }
        if (newFile.exists()) {
            System.out.println(parent.getPath() + " " + newFileName + " INSERTED");
        }
    }
}
