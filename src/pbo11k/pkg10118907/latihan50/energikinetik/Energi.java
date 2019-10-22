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
public class Energi {
    private double massa, kecepatan_akhir, kecepatan_awal;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan_akhir() {
        return kecepatan_akhir;
    }

    public void setKecepatan_akhir(double kecepatan_akhir) {
        this.kecepatan_akhir = kecepatan_akhir;
    }

    public double getKecepatan_awal() {
        return kecepatan_awal;
    }

    public void setKecepatan_awal(double kecepatan_awal) {
        this.kecepatan_awal = kecepatan_awal;
    }
    
    public double hitungEnergiKinetik(double massa, double kecepatan_akhir) {
        return 0.5 * massa * (kecepatan_akhir * kecepatan_akhir);
    }
    
    public double hitung_usaha(double massa, double kecepatan_awal, double kecepatan_akhir) {
        return 0.5 * massa * ((kecepatan_akhir * kecepatan_akhir) - (kecepatan_awal * kecepatan_awal));
    }
}
