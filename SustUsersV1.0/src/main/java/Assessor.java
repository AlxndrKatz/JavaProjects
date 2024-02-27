import java.util.ArrayList;
import java.util.List;

public class Assessor {
    static List<Consumer> assess (int maxWater, int maxGas, int maxElectro, List<Consumer> consumers) {
        List<Consumer> sustainableConsumers = new ArrayList<>();
        for (Consumer consumer : consumers) {
            if (consumer.getWaterConsumption() < maxWater
                    && (consumer.getGasConsumptionDay() + consumer.getGasConsumptionNight()) < maxGas
                    && (consumer.getElectroConsumptionDay() + consumer.getElectroConsumptionNight()) < maxElectro) {
                sustainableConsumers.add(consumer);
            }
        }
        return sustainableConsumers;
    }
}
