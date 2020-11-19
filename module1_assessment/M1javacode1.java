/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itcpr.m1.pkg1;

/**
 *
 * @author Acer
 */
public class ITCPRM11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int original[] = {1, 4, 3};
        int copycat [] = original;
     
         System.out.println("Contents of original");
         for (int i=0; i<original.length; i++) 
            System.out.print(original[i] + " ");
         
         System.out.println("\n\nContents of copy cat"); 
         for (int i=0; i<copycat.length; i++) 
            System.out.print(copycat[i] + " ");
         
    }
    
}
