import java.io.IOException;
import java.util.List;

public interface DataReader {
    List<DataObject> getData() throws IOException;
}
