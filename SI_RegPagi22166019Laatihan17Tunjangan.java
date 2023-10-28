/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166019.laatihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * NAMA                 : Rachma Fadilah Kurnianto
 * KELAS                : PBO1
 * NIM                  : 222166019
 * Deskripsi Program    : Menghitung program tunjangan.
 */
public class SI_RegPagi22166019Laatihan17Tunjangan {
    public static void main(String[] args) {
        //Deklarasikan variabel
        double gajipokok = 6000000, tunjangan = 0, totalgaji, total;
        String status = "Menikah";
        
        //Input scanner
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("============Program Tunjangan===========");
        System.out.println("Berapa gaji pokok anda perbulan? : " +gajipokok);
        System.out.println("Status anda? (Menikah/Belum) : " +status);
        System.out.println();
        
        //Input perhitungan
        total = gajipokok + tunjangan;
        tunjangan = ((gajipokok * 35) / 100);
        
        //hasil akhhir
        System.out.println("============Hasil Perhitungan Gaji Anda===========");
        System.out.println("Gaji Pokok : " +gajipokok);
        System.out.println("Tunjangan : " +tunjangan);
        System.out.println("Total Gaji : " +total);
        
    }   
}

