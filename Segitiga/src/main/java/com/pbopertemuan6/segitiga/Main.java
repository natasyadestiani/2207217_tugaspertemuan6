/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbopertemuan6.segitiga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek segitiga1 dan memasukkan input
        System.out.println("Masukkan alas segitiga 1:");
        double alas1 = scanner.nextDouble();
        System.out.println("Masukkan tinggi segitiga 1:");
        double tinggi1 = scanner.nextDouble();
        System.out.println("Masukkan sisi segitiga 1:");
        double sisi1 = scanner.nextDouble();
        Segitiga segitiga1 = new Segitiga(alas1, tinggi1, sisi1);
        
        // Membuat objek segitiga2 dan memasukkan input
        System.out.println("\nMasukkan alas segitiga 2:");
        double alas2 = scanner.nextDouble();
        System.out.println("Masukkan tinggi segitiga 2:");
        double tinggi2 = scanner.nextDouble();
        System.out.println("Masukkan sisi segitiga 2:");
        double sisi2 = scanner.nextDouble();
        Segitiga segitiga2 = new Segitiga(alas2, tinggi2, sisi2);
        
        // Membuat objek segitiga3 dan memasukkan input
        System.out.println("\nMasukkan alas segitiga 3:");
        double alas3 = scanner.nextDouble();
        System.out.println("Masukkan tinggi segitiga 3:");
        double tinggi3 = scanner.nextDouble();
        System.out.println("Masukkan sisi segitiga 3:");
        double sisi3 = scanner.nextDouble();
        Segitiga segitiga3 = new Segitiga(alas3, tinggi3, sisi3);
        
        // Menutup scanner setelah selesai penggunaan
        scanner.close();
        
        // Menampilkan hasil pengujian
        System.out.println("\nSegitiga 1:");
        System.out.println("Luas: " + segitiga1.getLuas());
        System.out.println("Keliling: " + segitiga1.getKeliling());
        
        System.out.println("\nSegitiga 2:");
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());
        
        System.out.println("\nSegitiga 3:");
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
    }
}
