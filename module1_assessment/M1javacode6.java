/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itcpr.m1.pkg6;

/**
 *
 * @author Acer
 */
import java.io.File;
public class ITCPRM16 {
    public static void main(String[] args) {
         File my_file_dir = new File("C:\\Users\\Acer\\Desktop\\MODULE-4.docx");
         if (my_file_dir.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
    }
    
}
