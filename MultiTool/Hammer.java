public class Hammer extends Tool {
    public Hammer(Workable workable) {
        super(workable);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Тук-тук!");
    }
}
