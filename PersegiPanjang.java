/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author User
 */
public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;
    
    @Override
     float Luas(){
        float luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
        return 0;
    }
    float Keliling(){
        float keliling = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang= " + keliling);
        return 0;
    }
}
