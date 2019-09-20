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
public class SequentialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cari;
       boolean found = false; 
       String[] data =new String[] {"Bakso", "Mie Lebay", "Sate Ayam", "Rawon", "Soto"};
       Scanner del = new Scanner(System.in);
       System.out.println("Masukkan data yang ingin dicari : ");
       cari = del.next();
       for (String data1 : data) {
           if(cari == null ? data [1] == null : cari.equals(data [1])){
               found = true;
               break;
           }
       }
       
       if (found == true) {
           System.out.println("Data ditemukan!");
       }else{
           System.out.println("Data tidak ditemukan!");
       }
       
    }
    
}
