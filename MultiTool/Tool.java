public abstract class Tool implements Workable{
    Workable workable;

    public Tool(Workable workable) {
        this.workable = workable;
    }

    @Override
    public void work() {
        if (workable == null) {

        } else {
            workable.work();
        }
    }
}
