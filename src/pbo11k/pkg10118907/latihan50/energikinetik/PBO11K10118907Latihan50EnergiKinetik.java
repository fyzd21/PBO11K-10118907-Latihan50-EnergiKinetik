/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan50.energikinetik;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan energi kinetik menggunakan konsep OOP
 * 
 */
public class PBO11K10118907Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program penghitung energi kinetik");
        Energi e = new Energi();
        e.setMassa(145);
        e.setKecepatan_akhir(25);
        System.out.println("Massa benda : "+e.getMassa()+" g");
        System.out.println("Kecepatan benda : "+e.getKecepatan_akhir()+" m/s");
        System.out.println("\nEnergi kinetik benda : "+e.hitungEnergiKinetik(e.getMassa(), e.getKecepatan_akhir())+" Joule");
        e.setKecepatan_awal(0);
        System.out.println("\nUsaha yang dilakukan pada benda : "+e.hitung_usaha(e.getMassa(), e.getKecepatan_awal(), e.getKecepatan_akhir())+" Joule");
        
    }
    
}
