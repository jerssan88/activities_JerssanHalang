/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Acer
 */


    /**
     * @param args the command line arguments
     */
    // Java program to illustrate conversion 
// of an array to an ArrayList 

import java.util.ArrayList; 

class ArrayToArrayList { 
	public static void func1(int arr[]) 
	{ 
		ArrayList<Integer> array_list = 
				new ArrayList<>(); 

		
		for (int i = 0; i < arr.length; i++) 
			array_list.add(arr[i]); 
		System.out.print(array_list); 
	} 

	public static void main(String[] args) 
	{ 

		int array[] = { 1, 2, 3, 4, 5 }; 
		func1(array); 
	} 
} 

