import java.io.File;
import java.io.IOException;

public class Runner {
    public static void inspect(String path, Function function) throws IOException {
        File file = new File(path);
        if (file.isDirectory()) {
            function.adjust(file);
        }

        File[] content = file.listFiles();
        if (content != null) {
            for (File subdir : content) {
                inspect(subdir.getPath(), function);
            }
        }
    }
}
