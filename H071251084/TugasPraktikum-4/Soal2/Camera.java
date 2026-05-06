class Camera extends Product {
    int resolution;
    String lensType;

    Camera(String brand, int seriesNumber, double price, int stock,int resolution, String lensType) {
        super(brand, seriesNumber, price, stock);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + seriesNumber);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
        System.out.println("Resolution: " + resolution + "MP");
        System.out.println("Lens Type: " + lensType + "\n");
    }
}