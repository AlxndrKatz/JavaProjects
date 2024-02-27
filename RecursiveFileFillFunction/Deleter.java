import java.io.File;
import java.io.IOException;

public class Deleter implements Function{
    @Override
    public void adjust(File parent) throws IOException {
        String targetFileName = "Joke.java";
        String filePath = parent.getPath() + File.separator + targetFileName;
        File targetFile = new File(filePath);
        targetFile.delete();
        if (!(targetFile.exists())) {
            System.out.println(parent.getPath() + " " + targetFileName + " DELETED");
        }
    }
}
