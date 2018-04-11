/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitunghuruf;

/**
 *
 * @author DikaSwatans
 */
public class HitungHuruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "The quick brown fox jumps over the lazy dog.";
		int count = 1;
		for (int i = 0; i < s.length();  i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}
}
    
   
