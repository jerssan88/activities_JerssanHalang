/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itcpr.m1.pkg3;

/**
 *
 * @author Acer
 */
public class ITCPRM13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] GRADES = new int[]{90, 80, 85, 83, 75, 82, 100};
        
        int sum = 0;
       for(int i=0; i < GRADES.length ; i++)
           sum = sum + GRADES[i];
       double average = sum / GRADES.length;
        System.out.println("Average value of the array elements is : " + average); 
    }
    
}
