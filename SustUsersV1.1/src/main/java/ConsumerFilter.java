import java.util.ArrayList;
import java.util.List;

public class ConsumerFilter {
    public List<Consumer> filter(int maxWater, int maxGas, int maxElectro, List<Consumer> consumers) {
        List<Consumer> sustainableConsumers = new ArrayList<>();
        for (Consumer consumer : consumers) {
            if (consumer.getWaterConsumption() < maxWater
                    && (consumer.getGasConsumptionDay() + consumer.getGasConsumptionNight()) < maxGas
                    && (consumer.getElectroConsumptionDay() + consumer.getElectroConsumptionNight()) < maxElectro) {
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
