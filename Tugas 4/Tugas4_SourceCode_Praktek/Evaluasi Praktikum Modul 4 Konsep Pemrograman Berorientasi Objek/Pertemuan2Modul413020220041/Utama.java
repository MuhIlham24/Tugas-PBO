/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2Modul413020220041;

/*
@author 13020220041
Nama : Muh Ilham Nur hidayat Akbar
Materi : Tugas 4 Evaluasi Praktikum 1
Waktu : 27-03-2024, 15.40
*/

public class Utama {
    public static void main(String[] args) {
        Orang orang = new Orang();
        orang.nama = "Ilham";
        System.out.println("Stb : " + orang.nama);
        
        Orang.info();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Muh Ilham";
        System.out.println("Stb Mahasiswa : " + mahasiswa.nama);
        
        Mahasiswa.info();
    }
}
