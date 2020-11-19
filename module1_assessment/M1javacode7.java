/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itcpr.m1.pkg7;

/**
 *
 * @author Acer
 */
import java.io.File;

public class ITCPRM17 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        
    File file = new File("C:\\Users\\Acer\\Desktop");

    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
    }
    
}
