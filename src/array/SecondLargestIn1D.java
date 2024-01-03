//Q4: Write a program to find out the second largest element in a given array. 
//
//Input 1: arr[] = {34,21,54,65,43}
//
//Output 1: 54
package array;

import java.util.Scanner;

public class SecondLargestIn1D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the size of the array: ");
	     int n = sc.nextInt();
	     System.out.println("Enter the elements in the array: ");
	     int arr[] = new int[n];
	     for(int i = 0; i<n;i++) {
	    	 arr[i] = sc.nextInt();
	     }
	     for(int i = 0 ;i<n ; i++) {
	    	 for(int j = i+1; j<n;j++) {
	    		 if(arr[i] > arr[j]) {
	    			 int temp = arr[i];
	    			 arr[i] = arr[j];
	    			 arr[j] = temp;
	    		 } 
	    	 }
	     }
	     System.out.println("Second largest element is " + arr[n-2]);
	     sc.close();
	}
}
