/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author User
 */
public class Persegi extends BangunDatar{
    float sisi;
    
    @Override
    float Luas(){
        float luas = sisi*sisi;
        System.out.println("Luas Persegi = " + luas);
        return 0;
    }
    float Keliling(){
        float keliling = sisi * 4;
        System.out.println("Keliling Persegi = " + keliling);
        return 0;
    }
}
