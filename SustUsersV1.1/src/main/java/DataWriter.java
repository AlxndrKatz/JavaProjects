import java.io.File;
import java.io.IOException;
import java.util.List;

public interface DataWriter {
    void write(List<Consumer> consumers, File inputFile) throws IOException;
}
