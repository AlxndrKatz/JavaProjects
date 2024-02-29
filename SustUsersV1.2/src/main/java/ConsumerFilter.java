import java.util.ArrayList;
import java.util.List;

public class ConsumerFilter implements DataFilter {
    int[] maxConsumption;
    List<DataObject> consumers;


    public ConsumerFilter(int[] maxConsumption, List<DataObject> consumers) {
        this.maxConsumption = maxConsumption;
        this.consumers = consumers;
    }
    @Override
    public List<DataObject> filter() {
        List<DataObject> sustainableConsumers = new ArrayList<>();
        for (DataObject consumer : consumers) {
            if (consumer.getWaterConsumption() < maxConsumption[0]
                    && (consumer.getGasConsumptionDay() + consumer.getGasConsumptionNight()) < maxConsumption[1]
                    && (consumer.getElectroConsumptionDay() +
                    consumer.getElectroConsumptionNight()) < maxConsumption[2]) {
                sustainableConsumers.add(consumer);
                System.out.println("Found matching consumer: " + consumer.getName());
            }
        }
        if (sustainableConsumers.isEmpty()) {
            System.out.println("Matching consumers not found");
        }
        return sustainableConsumers;
    }
}

