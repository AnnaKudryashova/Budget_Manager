package budget;
public class ShowList extends Action{
    ShowList(BudgetManager manager) {
        super(manager);
    }
    @Override
    void execute() {
        int category;
        while (true) {
            if (manager.history.list.size() == 0) {
                System.out.print("Purchase list is empty!");
                break;
            }
            System.out.println("Choose the type of purchases\n" +
                    "1) Food\n" +
                    "2) Clothes\n" +
                    "3) Entertainment\n" +
                    "4) Other\n" +
                    "5) All\n" +
                    "6) Back");
            category = manager.scanner.nextInt();
            System.out.println();
            if (category == 6) {
                break;
            }
            manager.history.printByCategory(category);
        }
    }
}
