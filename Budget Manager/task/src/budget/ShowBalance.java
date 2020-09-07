package budget;
public class ShowBalance extends Action {
    ShowBalance(BudgetManager manager) {
        super(manager);
    }
    @Override
    void execute() {
        double balance = manager.inflow.stream()
                .mapToDouble(Double::doubleValue).sum();
        for (Purchase purchase : manager.history.list) {
            balance -= purchase.price;
        }
        if (balance < 0.00) {
            balance = 0.00;
        }
        System.out.printf("Balance: $%.2f\n", balance);
        System.out.println();
    }
}
