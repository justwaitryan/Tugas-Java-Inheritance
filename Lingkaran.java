/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author User
 */
public class Lingkaran extends BangunDatar {
    float r;
     float Luas(){
        float luas = r*r*22/7;
        System.out.println("Luas Lingkaran = " + luas);
        return 0;
    }
    float Keliling(){
        float keliling = r*2*22/7;
        System.out.println("Keliling Lingkaran = " + keliling);
        return 0;
    }
}
