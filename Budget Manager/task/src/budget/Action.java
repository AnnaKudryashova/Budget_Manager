package budget;
public abstract class Action {
    public BudgetManager manager;
    Action(BudgetManager manager) {
        this.manager = manager;
    }
    abstract void execute();
}
