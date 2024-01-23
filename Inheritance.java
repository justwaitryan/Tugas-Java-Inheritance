/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

import  java.util.Scanner;
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunDatar bangunDatar = new BangunDatar();
        
        Persegi persegi = new Persegi();
        System.out.print("Masukkan sisi Persegi : ");
        persegi.sisi = input.nextInt();
        
        Lingkaran lingkaran = new Lingkaran();
        System.out.print("Masukkan jari-jari Lingkaran : ");
        lingkaran.r = input.nextInt();
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.print("Masukkan panjang Persegi Panjang : ");
        persegiPanjang.panjang = input.nextInt();
        System.out.print("Masukkan lebar Persegi Panjang : ");
        persegiPanjang.lebar = input.nextInt();
        
        Segitiga segitiga = new Segitiga();
        System.out.print("Masukkan alas segitiga : ");
        segitiga.alas = input.nextInt();
        System.out.print("Masukkan tinggi segitiga : ");
        segitiga.tinggi = input.nextInt();
        System.out.print("Masukkan sisi miring segitiga : ");
        segitiga.sisiMiring = input.nextInt();
        
        System.out.println("");
        
        bangunDatar.Luas();
        bangunDatar.Keliling();        
        persegi.Luas();
        persegi.Keliling();
        lingkaran.Luas();
        lingkaran.Keliling();
        persegiPanjang.Luas();
        persegiPanjang.Keliling();
        segitiga.Luas();
        segitiga.Keliling();
        
    }
    
}
