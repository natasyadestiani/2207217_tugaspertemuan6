/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbopertemuan6.segitiga;

public class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    // Constructor tanpa parameter
    public Segitiga() {
        alas = 0;
        tinggi = 0;
        sisi = 0;
    }

    // Constructor dengan parameter
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }

    // Method untuk menghitung luas segitiga
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    public double getKeliling() {
        return alas + tinggi + sisi;
    }

    // Setter untuk alas
    public void setAlas(double alasBaru) {
        alas = alasBaru;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }

    // Setter untuk sisi
    public void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
}
