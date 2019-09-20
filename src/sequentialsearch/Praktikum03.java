/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;

/**
 *
 * @author User
 */
public class Praktikum03 {
    
    public static void main(String[] args){
        int[] data = new int[]{92, 98, 76, 72, 84, 101, 39};
        System.out.print("Nilai pada Array : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        
        System.out.println("\n");
        System.out.print("Nilai yang merupakan kelipatan 3 :");
        System.out.println("\n");
        for (int a = 0; a < data.length; a++) {
            if (data[a] % 3 == 0) {
                System.out.println(data[a]+"");
                
            }
        }System.out.println("\t");
    }
}
