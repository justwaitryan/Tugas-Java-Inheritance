package inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;
    float sisiMiring;
    
    @Override
     float Luas(){
        float luas = alas*tinggi/2;
        System.out.println("Luas Segitiga = " + luas);
        return 0;
    }
    float Keliling(){
        float keliling = alas + sisiMiring*2;
        System.out.println("Keliling Segitiga = " + keliling);
        return 0;
    }
}
