package Research.MultiTool;

public class Main {
    public static void main(String[] args) {
        Tool tool = new Hammer(new Drill());
        tool.work();

        System.out.println("\n=====\n");

        Tool tool1 = new Drill(new Hammer());
        tool1.work();
    }
}
