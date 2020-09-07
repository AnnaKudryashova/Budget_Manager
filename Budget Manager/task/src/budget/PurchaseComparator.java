package budget;
import java.util.Comparator;
public class PurchaseComparator implements Comparator<Purchase> {
    @Override
    public int compare(Purchase o1, Purchase o2) {
        return Double.compare(o2.price, o1.price);
    }
}
