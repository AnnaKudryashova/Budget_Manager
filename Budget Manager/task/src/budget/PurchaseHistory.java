package budget;
import java.util.ArrayList;
import java.util.List;
public class PurchaseHistory {
    List<Purchase> list = new ArrayList<>();
    void add(int category, String name, double price) {
        list.add(new Purchase(price, name, category));
    }
    private String getCategory(int category) {
        switch (category) {
            case 1:
                return "Food";
            case 2:
                return "Clothes";
            case 3:
                return "Entertainment";
            default:
            case 4:
                return "Other";
        }
    }
    void printByCategory(int category) {
        double total = 0.00;
        final String categoryStr = getCategory(category);
        int found = 0;
        if (category == 5) {
            System.out.println("All: ");
        } else {
            System.out.printf("%s: \n", categoryStr);
        }
        for (Purchase purchase : list) {
            if (category == 5) {
                purchase.print();
                total += purchase.price;
                found++;
            } else {
                if (purchase.category.equals(categoryStr)) {
                    purchase.print();
                    total += purchase.price;
                    found++;
                }
            }
        }
        if (found == 0) {
            System.out.println("Purchase list is empty!\n");
        } else {
            System.out.printf("Total sum: $%.2f\n\n", total);
        }
    }
}
