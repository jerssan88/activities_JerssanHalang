/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itcpr.m1.pkg4;

/**
 *
 * @author Acer
 */
public class ITCPRM14 
{
public boolean endsNg(String str) 
{
  int jer = str.length();
  String ng = "ng";
  if (jer < 2)
    return false;
  else return ng.equals(str.substring(jer-2,jer));
}
public static void main (String[] args)
    {
      ITCPRM14 main= new ITCPRM14();
      String st =  "string";
      System.out.println("The given strings is: "+st);
      System.out.println("The string containing ng at last: "+main.endsNg(st));
    }
    
}
