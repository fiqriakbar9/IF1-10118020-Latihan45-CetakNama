/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cetaknama;

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
public class Printer {
    private int jmlCetak;
    String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama anda : "+nama);
    }
    
    public void cetak(int jmlCetak,String nama){
        System.out.println("Hasil Cetak : ");
        for(int i=1; i<=jmlCetak; i++){
            System.out.println(i+". "+nama);
        }
    }
    
}
