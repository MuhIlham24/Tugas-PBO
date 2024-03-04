/*  NIM: 13020220041
    Nama: Muh Ilham Nur Hidayat Akbar
    Hari/Tgl: Minggu/4-03-2024
    Waktu Pengerjaan = 21.10 - 22.15
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedRead{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan NIM: ");
        String nim = reader.readLine();
        
        System.out.print("Masukkan nama: ");
        String nama = reader.readLine();
        
        System.out.print("Masukkan jurusan: ");
        String jurusan = reader.readLine();
        
        System.out.print("Masukkan fakultas: ");
        String fakultas = reader.readLine();

        System.out.println("\n");
        
        System.out.println("Data yang dimasukkan:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        
        reader.close();
    }
}
