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
public class Praktikum01 {
    
    public static void main(String[] args){
        int A = 0;
        int cari;
        Scanner dell = new Scanner(System.in);
        int[] data = new int[]{74, 98, 72, 74, 72, 90, 81, 72};
        System.out.println("Data pada array : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Masukkan nilai yang dicari");
        cari = dell.nextInt();
        
        
        for (int a = 0; a < data.length; a++) {
            if (cari == data[a]) {
                A++;
            }
        }
        
            System.out.println(" Nilai " + cari + " ditemukan sebanyak " + A + " kali");
            if (A==0) {
                System.out.println("Data tidak ditemukan!");
        }
      
        
        
    }
}
