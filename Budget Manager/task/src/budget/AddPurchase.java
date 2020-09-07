package budget;
public class AddPurchase extends Action{
    AddPurchase(BudgetManager manager) {
        super(manager);
    }
    @Override
    void execute() {
        int category;
        String name;
        double price;
        while (true) {
            System.out.println("Choose the type of purchase\n" +
                    "1) Food\n" +
                    "2) Clothes\n" +
                    "3) Entertainment\n" +
                    "4) Other\n" +
                    "5) Back");
            category = manager.scanner.nextInt();
            if (category == 5) {
                break;
            }
            System.out.println("\nEnter purchase name:");
            manager.scanner.nextLine();
            name = manager.scanner.nextLine();
            System.out.println("Enter its price:");
            price = manager.scanner.nextDouble();
            manager.history.add(category, name, price);
            System.out.println("Purchase was added!\n");
        }
    }
    }
