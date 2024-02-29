import java.util.List;

public interface DataFilter {
    List<DataObject> filter(List<DataObject> dataObjects);
}
