/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble;
import java.util.Arrays;
/**
 *
 * @author DikaSwatans
 */
public class Bubble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] bilangan = {7, 10, 4, 17, 1, 47};
		
		//	Tampilkan bilangan
                for (int x : bilangan){
                System.out.print(x);
                System.out.print(",");
             
                }
                System.out.println();
		//	Proses Bubble Sort
		System.out.println("Proses Bubble Sort secara Ascending:");
		for(int a = 0; a < bilangan.length; a++) {
			//	Tampilkan proses Iterasi
			System.out.println("Iterasi "+(a+1));
			for(int b = 0; b < bilangan.length-1; b++) { if(bilangan[b] > bilangan[b+1]) {
					//	proses pertukaran bilangan
					int temp = bilangan[b];
					bilangan[b] = bilangan[b+1];
					bilangan[b+1] = temp;
				}
				
				//	Tampilkan proses pertukaran tiap iterasi
				System.out.println(Arrays.toString(bilangan));
			}
			System.out.println();
		}
		
		//	Tampilkan hasil akhir
		System.out.println("Hasil akhir setelah di sorting: "+Arrays.toString(bilangan));
	}
}