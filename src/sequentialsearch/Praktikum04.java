/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Praktikum04 {
    
    public static void main(String[] args){
        Scanner hd = new Scanner(System.in);
        String cari;
        System.out.print("Masukkan sebuah kata/kalimat: ");
        cari = hd.nextLine();
        
        
        int a = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'a') {
                a++;
            }
        }
        int d = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == '1') {
                d++;
            }
        }
        int u = 0; 
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'u') {
                u++;
            }
        }
        int e = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'e') {
                e++;
            }
        }
        int o = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'o') {
                o++;
            }
            
        }
        System.out.println("Jumlah huruf a pada kalimat di atas adalah " + a);
        System.out.println("Jumlah huruf d pada kalimat di atas adalah " + d);
        System.out.println("Jumlah huruf u pada kalimat di atas adalah " + u);
        System.out.println("Jumlah huruf e pada kalimat di atas adalah " + e);
        System.out.println("Jumlah huruf o pada kalimat di atas adalah " + o);
        
        
    }
}
