// import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Product[] products = new Product[100];
    static int count = 0;

    static void tampilMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Semua Produk");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar");
        System.out.print(">>> Pilih menu (1-4): ");
    }

    static void tambahProduk() {
        if (count >= products.length) {
            System.out.println("Kapasitas penuh!");
            return;
        }

        System.out.print("Masukkan nama produk: ");
        String brand = input.nextLine();

        System.out.print("Masukkan nomor seri: ");
        int series = input.nextInt();

        System.out.print("Masukkan Harga: ");
        double price = input.nextDouble();

        System.out.print("Masukkan stok: ");
        int stock = input.nextInt();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int tipe = input.nextInt();

        if (tipe == 1) {
            System.out.print("Masukkan ukuran layar (inci): ");
            double screen = input.nextDouble();
            System.out.print("Masukkan kapasitas penyimpanan (GB): ");
            int storage = input.nextInt();

            products[count++] = new Smartphone(brand, series, price, stock, screen, storage);

        } else if (tipe == 2) {
            input.nextLine();
            System.out.print("Masukkan tipe processor: ");
            String processor = input.nextLine();
            System.out.print("Masukkan ukuran RAM: ");
            int ram = input.nextInt();

            products[count++] = new Laptop(brand, series, price, stock, ram, processor);

        } else if (tipe == 3) {
            System.out.print("Masukkan resolusi: ");
            int resolution = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan tipe lensa: ");
            String lens = input.nextLine();

            products[count++] = new Camera(brand, series, price, stock, resolution, lens);
        }
        input.nextLine();
    }

    static void tampilkanProduk() {
        System.out.println("\nDaftar Produk:\n");

        if (count == 0) {
            System.out.println("Belum ada produk.");
        } else {
            for (int i = 0; i < count; i++) {
                products[i].displayInfo();
            }
        }
    }

    static void beliProduk() {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int cari = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < count; i++) {
            if (products[i].seriesNumber == cari) {
                ditemukan = true;

                if (products[i].isAvailable()) {
                    products[i].kurangiStok();
                    System.out.println("Anda telah membeli produk:");
                    products[i].displayInfo();
                } else {
                    System.out.println("Stok produk habis.");
                }
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }

        public static void main(String[] args) {
        int pilihan;

        do {
            tampilMenu();
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    tampilkanProduk();
                    break;
                case 3:
                    beliProduk();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }
}
