import java.io.File;
import java.io.IOException;
import java.util.List;

public interface DataReader {
    List<Consumer> getData(File inputFile) throws IOException;
}
