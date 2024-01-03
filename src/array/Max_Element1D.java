//3. Write a program to calculate the maximum element in the array.
//
//Input 1: arr[] = {34,21,54,65,43}
//
//Output 1: 65
package array;

import java.util.Scanner;

public class Max_Element1D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the size of the array: ");
	     int n = sc.nextInt();
	     System.out.println("Enter the elements in the array: ");
	     int arr[] = new int[n];
	     for(int i = 0; i<n;i++) {
	    	 arr[i] = sc.nextInt();
	     }
	     int max = arr[0];
	     for(int i = 1; i<n; i++) {
	    	 if(max<arr[i]) {
	    		 max = arr[i];
	    	 }
	     }
	     System.out.println("Maximum element in the array : " +max);
	     sc.close();
	}
}
