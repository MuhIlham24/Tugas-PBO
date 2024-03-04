/*  NIM: 13020220041
    Nama: Muh Ilham Nur Hidayat Akbar
    Hari/Tgl: Minggu/4-03-2024
    Waktu Pengerjaan = 23.20 - 23.57
*/

import java.util.Scanner;

public class Waktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        int totalDetik = scanner.nextInt();
        int detikSekarang = totalDetik % 60;
        int totalMenit = totalDetik / 60;
        int menitSekarang = totalMenit % 60;
        int totalJam = totalMenit / 60;
        int jamSekarang = totalJam % 24;
	
	String waktuFormat = String.format("%02d:%02d:%02d", jamSekarang, menitSekarang, detikSekarang);
       
        System.out.println("Waktu sekarang: " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang);

        scanner.close();
    }
}
