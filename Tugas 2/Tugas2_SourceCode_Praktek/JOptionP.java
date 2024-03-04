/*  NIM: 13020220041
    Nama: Muh Ilham Nur Hidayat Akbar
    Hari/Tgl: Minggu/4-03-2024
    Waktu Pengerjaan = 22.15 - 23.20
*/

import javax.swing.JOptionPane;

public class JOptionP{
    public static void main(String[] args) {
        String nim = JOptionPane.showInputDialog("Masukkan NIM:");
        String nama = JOptionPane.showInputDialog("Masukkan nama:");
        String jurusan = JOptionPane.showInputDialog("Masukkan jurusan:");
        String fakultas = JOptionPane.showInputDialog("Masukkan fakultas:");
        
        String message = "Data yang dimasukkan:\n" +
                "NIM: " + nim + "\n" +
                "Nama: " + nama + "\n" +
                "Jurusan: " + jurusan + "\n" +
                "Fakultas: " + fakultas;
        
        JOptionPane.showMessageDialog(null, message);
    }
}
