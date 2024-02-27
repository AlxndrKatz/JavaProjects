package Research.MultiTool;

public abstract class Tool implements Workable{
    Workable workable;

    public Tool(Workable workable) {
        this.workable = workable;
    }

    public Tool() {
        work();
    }

    @Override
    public void work() {

    }
}
