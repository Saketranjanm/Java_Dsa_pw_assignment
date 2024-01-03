// write a program to print the elements of both the diagonals in a user inputted square matrix 
//in any order.		
//
//Input 1: 
// 1 2 3 
// 4 5 6
// 7 8 9
//
//Output 1: 1 3 5 7  9 
package array;

import java.util.Scanner;

public class Diagonal_elements {
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
	        for(int i = 0;i<m;i++) {
	        	 {
	        		 
	                     System.out.print(arr[i][i] + " ");
	                 }
	        	}
	        for(int j = 0;j<n;j++) {
	        	 {
	        		 
	                     System.out.print(arr[j][n-1-j] + " ");
	                
	        	}
	        }
	        sc.close();
	}
}
