import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("   ==== BANGUN RUANG ====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");

        System.out.println("\n   ==== BANGUN DATAR ====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        System.out.println("-----------------------------------------");

        System.out.print("PILIHAN: ");
        int pilih = input.nextInt();

        System.out.println("-----------------------------------------");

        switch (pilih) {

            case 1:
                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();
                Kubus kubus = new Kubus(s);
                System.out.println("Luas: " + kubus.hitungLuas());
                System.out.println("Volume: " + kubus.hitungVolume());
                break;

            case 2:
                System.out.print("Panjang: ");
                double p = input.nextDouble();
                System.out.print("Lebar: ");
                double l = input.nextDouble();
                System.out.print("Tinggi: ");
                double t = input.nextDouble();
                Balok balok = new Balok(p, l, t);
                System.out.println("Luas: " + balok.hitungLuas());
                System.out.println("Volume: " + balok.hitungVolume());
                break;

            case 3:
                System.out.print("Jari-jari: ");
                double r = input.nextDouble();
                Bola bola = new Bola(r);
                System.out.println("Luas: " + bola.hitungLuas());
                System.out.println("Volume: " + bola.hitungVolume());
                break;

            case 4:
                System.out.print("Jari-jari: ");
                double rt = input.nextDouble();
                System.out.print("Tinggi: ");
                double tt = input.nextDouble();
                Tabung tabung = new Tabung(rt, tt);
                System.out.println("Luas: " + tabung.hitungLuas());
                System.out.println("Volume: " + tabung.hitungVolume());
                break;

            case 5:
                System.out.print("Sisi: ");
                double sisi = input.nextDouble();
                Persegi persegi = new Persegi(sisi);
                System.out.println("Luas: " + persegi.hitungLuas());
                System.out.println("Keliling: " + persegi.hitungKeliling());
                break;

            case 6:
                System.out.print("Panjang: ");
                double pj = input.nextDouble();
                System.out.print("Lebar: ");
                double lb = input.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(pj, lb);
                System.out.println("Luas: " + pp.hitungLuas());
                System.out.println("Keliling: " + pp.hitungKeliling());
                break;

            case 7:
                System.out.print("Jari-jari: ");
                double rl = input.nextDouble();
                Lingkaran lingkaran = new Lingkaran(rl);
                System.out.println("Luas: " + lingkaran.hitungLuas());
                System.out.println("Keliling: " + lingkaran.hitungKeliling());
                break;

            case 8:
                System.out.print("Masukkan Sisi 1 trapesium: ");
                double a = input.nextDouble();
                System.out.print("Masukkan Sisi 2 trapesium: ");
                double b = input.nextDouble();
                System.out.print("Masukkan Sisi 3 trapesium: ");
                double c = input.nextDouble();
                System.out.print("Masukkan Sisi 4 trapesium: ");
                double d = input.nextDouble();
                System.out.print("Masukkan Tinggi trapesium: ");
                double tinggi = input.nextDouble();

                Trapesium trapesium = new Trapesium(a, b, c, d, tinggi);
                System.out.println("Luas: " + trapesium.hitungLuas());
                System.out.println("Keliling: " + trapesium.hitungKeliling());
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}