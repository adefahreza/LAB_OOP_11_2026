class Laptop extends Product {
    int ramSize;
    String processorType;

    Laptop(String brand, int seriesNumber, double price, int stock,int ramSize, String processorType) {
        super(brand, seriesNumber, price, stock);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + seriesNumber);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
        System.out.println("Processor Type: " + processorType);
        System.out.println("RAM Size: " + ramSize + "GB\n");
    }
}