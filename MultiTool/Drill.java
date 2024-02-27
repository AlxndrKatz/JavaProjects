package Research.MultiTool;

public class Drill extends Tool{
    public Drill(Workable workable) {
        super(workable);
    }

    public Drill() {
        super.work();
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Вжжжж!");
    }
}
