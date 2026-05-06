package Soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        KARYAWAN KONTRAK
        KaryawanKontrak adezar = new KaryawanKontrak("adezar", "H123", 500000);
        System.out.println("Karyawan Tetap: ");
        System.out.print("how much present : ");int absenKK = input.nextInt();
        for (int i = 0; i < absenKK; i++ ){
            adezar.hadir();
        }
        adezar.tampilkanInfo();

//        KARYAWAN TETAP
        KaryawanTetap adefah = new KaryawanTetap("adefah","H0987", 2000000, 500000);
        System.out.print("how much present : ");int absenKT = input.nextInt();
        for (int i = 0; i < absenKT; i++ ){
            adefah.hadir();
        }
        adefah.tampilkanInfo();

    }
}