import java.util.List;

public interface Filter{

    List<Consumer> filter(int value1, int value2, int value3, List<Consumer> consumers);
}
