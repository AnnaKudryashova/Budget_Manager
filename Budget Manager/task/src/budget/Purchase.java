package budget;
public class Purchase {
    double price;
    String name;
    String category;
    private int internalCategory;
    Purchase(double price, String name, int category) {
        switch (category) {
            case 1:
                this.category = "Food";
                break;
            case 2:
                this.category = "Clothes";
                break;
            case 3:
                this.category = "Entertainment";
                break;
            case 4:
                this.category = "Other";
                break;
        }
        this.internalCategory = category;
        this.price = price;
        this.name = name;
    }
    void print() {
        System.out.printf("%s $%.2f\n", name, price);
    }
    int getInternalCategory() {
        return internalCategory;
    }
}
