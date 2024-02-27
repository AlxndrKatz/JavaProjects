public class Main {
    public static void main(String[] args) {
        Tool tool = new Hammer(new Drill(null));
        tool.work();

        System.out.println("\n=====\n");

        Tool tool1 = new Drill(new Hammer(null));
        tool1.work();
    }
}
