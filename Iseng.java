/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iseng;

/**
 *
 * @author DikaSwatans
 */
import java.util.Scanner;
public class Iseng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in); 
        System.out.print("Masukan Nilai: ");
        String nilai = scan.nextLine();
        System.out.print("Angka Tengah: " + tengah(nilai)+"\n");    
    }
    
    public static String tengah(String nilai)      
    {
        int posisi;
        int jarak;
        if (nilai.length() % 2 == 0  )
        {
            posisi = nilai.length() / 2-1 ;
            jarak = 2;
        }else
        {
            posisi = nilai.length() / 2 ;
            jarak = 1;
    }
    return nilai.substring(posisi, posisi + jarak );
    }
}
    


        
    
    

