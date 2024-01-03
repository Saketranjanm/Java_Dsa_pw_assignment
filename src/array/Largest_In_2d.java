//4.Write a program to find the largest element of a given 2D array of integers. 
//Input 1:
//	1 2 4 0
//	2 5 7 -1
//	4 2 6 9
//output: 9	
package array;

import java.util.Scanner;

public class Largest_In_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the row of the array: ");
	        int m = sc.nextInt();
	        System.out.println("Enter the col of the array: ");
	        int n = sc.nextInt();
	        System.out.println("Enter the elements in the array: ");
	        int arr[][] = new int[m][n];
	        for(int i = 0;i<m;i++) {
	        	for(int j=0;j<n;j++) {
	        		arr[i][j] = sc.nextInt();
	        		}
	        	}
	        int max = arr[0][0];
	        for(int i = 0;i<m;i++) {
	        	for(int j=0;j<n;j++) {
	        		if(arr[i][j] > max) {
	        			max = arr[i][j];
	        		}
	        		}
	        	}
	        System.out.println("Largest element in matrix is : " +max+"");
	        
	        sc.close();
	}

}
