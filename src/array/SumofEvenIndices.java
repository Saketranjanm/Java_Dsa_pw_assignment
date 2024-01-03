//Q1: Write a program to print the sum of all the elements present on even indices in the given array.
//
//Input 1: arr[] = {3,20,4,6,9}
//
//Output 1: 16
package array;

import java.util.Scanner;

public class SumofEvenIndices {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the size of the array: ");
	     int n = sc.nextInt();
	     System.out.println("Enter the elements in the array: ");
	     int arr[] = new int[n];
	     for(int i = 0; i<n;i++) {
	    	 arr[i] = sc.nextInt();
	     }
	     int sum = 0;
	     for(int i = 0; i<n;i++) {
	         if(i%2 == 0) {
	        	 sum = sum + arr[i];
	         }
		}
	     sc.close();
	     
	     System.out.println("the summation of elements at the even indices = " +sum );

	}
}
