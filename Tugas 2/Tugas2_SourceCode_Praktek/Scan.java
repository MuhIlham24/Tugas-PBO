/*  NIM: 13020220041
    Nama: Muh Ilham Nur Hidayat Akbar
    Hari/Tgl: Minggu/4-03-2024
    Waktu Pengerjaan = 20.00 - 21.00
*/


import java.util.Scanner;

public class Scan{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan NIM:");
        String nim = scanner.nextLine();
        
        System.out.println("Masukkan nama:");
        String nama = scanner.nextLine();
        
        System.out.println("Masukkan jurusan:");
        String jurusan = scanner.nextLine();
        
        System.out.println("Masukkan fakultas:" );
        String fakultas = scanner.nextLine();

        System.out.println("\n");
        
        System.out.println("Data yang dimasukkan: ");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        
        scanner.close();
    }
}
