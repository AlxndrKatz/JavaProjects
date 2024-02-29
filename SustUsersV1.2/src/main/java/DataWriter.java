import java.io.IOException;
import java.util.List;

public interface DataWriter {
    void write(List<DataObject> filteredData) throws IOException;
}
