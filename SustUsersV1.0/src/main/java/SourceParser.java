public class SourceParser {
    public static Consumer generateConsumer (String[] input) {
        Consumer consumer = new Consumer(Integer.parseInt(input[0]), input[1], Integer.parseInt(input[2]),
                Integer.parseInt(input[3]), Integer.parseInt(input[4]),
                Integer.parseInt(input[5]), Integer.parseInt(input[6]));
        return consumer;
    }
}
