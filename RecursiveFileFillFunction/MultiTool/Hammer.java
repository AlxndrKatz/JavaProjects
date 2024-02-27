package Research.MultiTool;

public class Hammer extends Tool{
    public Hammer(Workable workable) {
        super(workable);
    }

    public Hammer() {
        super.work();
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Тук-тук!");
    }
}
