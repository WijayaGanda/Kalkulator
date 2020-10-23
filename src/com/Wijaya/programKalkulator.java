package com.Wijaya;

import java.util.Scanner;

public class programKalkulator {
    public static void main(String[] args) {
        Kalkulator hitung = new Kalkulator();
        double penjumlahan1, penjumlahan2, pengurangan1, pengurangan2, perkalian1, perkalian2, pembagian1, pembagian2;

        //penjumlahan
        Scanner input = new Scanner(System.in);
        System.out.println("Penjumlahan");
        System.out.println("Masukkan angka pertama");
        penjumlahan1 = input.nextDouble();
        System.out.println("Masukkan angka kedua");
        penjumlahan2 = input.nextDouble();
        System.out.println("Hasil Penjumlahan " + hitung.getPenjumlahan(penjumlahan1, penjumlahan2));

        //pengurangan
        System.out.println("Pengurangan");
        System.out.println("Masukkan angka pertama");
        pengurangan1 = input.nextDouble();
        System.out.println("Masukkan angka kedua");
        pengurangan2 = input.nextDouble();
        System.out.println("Hasil Pengurangan " + hitung.getPengurangan(pengurangan1, pengurangan2));

        //perkalian
        System.out.println("Perkalian");
        System.out.println("Masukkan angka pertama");
        perkalian1 = input.nextDouble();
        System.out.println("Masukkan angka kedua");
        perkalian2 = input.nextDouble();
        System.out.println("Hasil Perkalian " + hitung.getPerkalian(perkalian1, perkalian2));

        //pembagian
        System.out.println("Pembagian");
        System.out.println("Masukkan angka pertama");
        pembagian1 = input.nextDouble();
        System.out.println("Masukkan angka kedua");
        pembagian2 = input.nextDouble();
        System.out.println("Hasil Pembagian " + hitung.getPembagian(pembagian1, pembagian2));
    }
}
