package budget;
import java.io.IOException;
import java.io.PrintWriter;
public class Save extends Action {
    Save(BudgetManager manager) {
        super(manager);
    }

    @Override
    void execute() {
        try {
            PrintWriter writer = new PrintWriter("purchases.txt");

            String str;
            for (Double income : manager.inflow) {
                str = String.format("income~%s", income);
                writer.println(str);
            }

            for (Purchase purchase : manager.history.list) {
                str = String.format("expense~%s~%s~%s",
                        purchase.getInternalCategory(), purchase.name, purchase.price);
                writer.println(str);
            }
            writer.close();
            System.out.println("Purchases were saved!");
        } catch (IOException e) {
            System.out.println("Failed to save file.");
        }

    }
}
