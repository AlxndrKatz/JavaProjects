public class Consumer {
    int id;
    String name;
    int waterConsumption;
    int gasConsumptionDay;
    int gasConsumptionNight;
    int electroConsumptionDay;
    int electroConsumptionNight;


    public Consumer(int id, String name, int waterConsumption, int gasConsumptionDay,
                    int gasConsumptionNight, int electroConsumptionDay, int electroConsumptionNight) {
        this.id = id;
        this.name = name;
        this.waterConsumption = waterConsumption;
        this.gasConsumptionDay = gasConsumptionDay;
        this.gasConsumptionNight = gasConsumptionNight;
        this.electroConsumptionDay = electroConsumptionDay;
        this.electroConsumptionNight = electroConsumptionNight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWaterConsumption() {
        return waterConsumption;
    }

    public int getGasConsumptionDay() {
        return gasConsumptionDay;
    }


    public int getGasConsumptionNight() {
        return gasConsumptionNight;
    }


    public int getElectroConsumptionDay() {
        return electroConsumptionDay;
    }


    public int getElectroConsumptionNight() {
        return electroConsumptionNight;
    }


    @Override
    public String toString() {
        return id + "|"
                + name  + "|"
                + waterConsumption + "|"
                + gasConsumptionDay + "|"
                + gasConsumptionNight + "|"
                + electroConsumptionDay + "|"
                + electroConsumptionNight;
    }
}
