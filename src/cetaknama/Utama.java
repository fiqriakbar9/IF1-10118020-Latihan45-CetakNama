/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cetaknama;

import java.util.Scanner;


/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan cetak nama
 * sesuai nama yang di input beserta jumlahnya
 * 
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer ptr = new Printer();
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.printf("Masukkan nama anda : ");
        ptr.setNama(scanner.nextLine());
        System.out.printf("Mau cetak nama berapa kali? : ");
        ptr.setJmlCetak(scanner.nextInt());
        ptr.cetak(ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
        
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
        
    }
    
}
