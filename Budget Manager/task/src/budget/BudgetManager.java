package budget;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BudgetManager {
    Scanner scanner = new Scanner(System.in);
    List<Double> inflow = new ArrayList<>();
    PurchaseHistory history = new PurchaseHistory();
    void start() {
        Action action;
        int choice;
        main:
        while (true) {
            System.out.println("Choose your action:\n" +
                    "1) Add income\n" +
                    "2) Add purchase\n" +
                    "3) Show list of purchases\n" +
                    "4) Balance\n" +
                    "5) Save\n" +
                    "6) Load\n" +
                    "7) Analyze (Sort)\n" +
                    "0) Exit");
            choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    action = new AddIncome(this);
                    action.execute();
                    break;
                case 2:
                    action = new AddPurchase(this);
                    action.execute();
                    break;
                case 3:
                    action = new ShowList(this);
                    action.execute();
                    break;
                case 4:
                    action = new ShowBalance(this);
                    action.execute();
                    break;
                case 5:
                    action = new Save(this);
                    action.execute();
                    break;
                case 6:
                    action = new Load(this);
                    action.execute();
                    break;
                case 7:
                    action = new Analyze(this);
                    action.execute();
                    break;
                case 0:
                    System.out.println();
                    break main;
            }
            System.out.println();
        }
        System.out.print("Bye!");
    }
}
