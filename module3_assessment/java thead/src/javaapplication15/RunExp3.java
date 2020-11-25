/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

   
        // TODO code application logic here
public class RunExp3 extends Thread  
{    
    public void run()  
    {    
        for(int i=1;i<9;i++)  
        {    
            try  
            {  
                Thread.sleep(500);  
            }catch(InterruptedException e){System.out.println(e);}    
        System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        RunExp3 t1=new RunExp3();    
        RunExp3 t2=new RunExp3();    
        t1.run();    
        t2.run();    
    }    
}    
    
