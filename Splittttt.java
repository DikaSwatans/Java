/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splittttt;

/**
 *
 * @author DikaSwatans
 */
public class Splittttt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String Angka = "12.08.31";
    String[] Output =Angka.split("\\.");
    for (int i=0; i < Output.length; i++)
    {
      System.out.println(Output[i]);
    }
  }
}
    
   
