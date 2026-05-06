abstract class Product {
    String brand;
    int seriesNumber;
    double price;
    int stock; // fitur tambahan

    Product(String brand, int seriesNumber, double price, int stock) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
        this.stock = stock;
    }

    abstract void displayInfo();

    void kurangiStok() {
        if (stock > 0) {
            stock--;
        }
    }

    boolean isAvailable() {
        return stock > 0;
    }
}