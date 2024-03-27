/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2Modul413020220041;

/*
@author 13020220014
Nama : Muh Ilham Nur hidayat Akbar
Materi : Tugas 4 Evaluasi Praktikum 1
Waktu : 27-03-2024, 16.00
*/

public class Mahasiswa extends Orang {
    private String stb;

    public Mahasiswa() {
        super();
        this.stb = "13020220041";
    }

    public Mahasiswa(String stb, String nama) {
        this.nama = nama;
        this.stb = stb;
    }

    public static void info() {
        System.out.println("Ini adalah class Mahasiswa");
    }
}