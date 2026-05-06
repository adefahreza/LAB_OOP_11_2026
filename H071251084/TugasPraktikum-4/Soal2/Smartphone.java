class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    Smartphone(String brand, int seriesNumber, double price, int stock,double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price, stock);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + seriesNumber);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage Capacity: " + storageCapacity + "GB\n");
    }
}