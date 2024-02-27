public class Drill extends Tool {
    public Drill(Workable workable) {
        super(workable);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Вжжжж!");
    }
}
