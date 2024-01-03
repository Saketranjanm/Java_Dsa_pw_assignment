//2. Write a program to traverse over the elements of the array using for each loop and print all even 
//elements.
//
//Input 1: arr[] = {34,21,54,65,43}
//
//Output 1: 34 54 
package array;

import java.util.Scanner;

public class TraversingEvenElements {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the size of the array: ");
	     int n = sc.nextInt();
	     System.out.println("Enter the elements in the array: ");
	     int arr[] = new int[n];
	     for(int i = 0; i<n;i++) {
	    	 arr[i] = sc.nextInt();
	     }
	     for(int element: arr)
	     {
	    	 if(element % 2 ==0 )
	    	 System.out.print( " "+ element + " " );
	     }
	 	sc.close();
	}

}
