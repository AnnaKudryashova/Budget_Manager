package budget;
public class AddIncome extends Action {
    AddIncome(BudgetManager manager) {
        super(manager);
    }
    @Override
    void execute() {
        System.out.println("Enter income: ");
        double income = manager.scanner.nextDouble();
        manager.inflow.add(income);
        System.out.println("Income was added!");
    }
}
