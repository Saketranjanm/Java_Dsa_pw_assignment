//Q5: Write a function which accepts a 2D array of integers and its size as arguments and 
// displays the elements of middle row and the elements of middle column. Printing can 
//be done in any order.
//[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]
//Input 1: 
//1 2 3 4 5 
//3 4 5 6 7
//7 6 5 4 3 
//8 7 6 5 4
//1 2 37 8 0
//Output : 3 5 5 6 37 7 6 4 3
package array;

import java.util.Scanner;

public class Middle_row_col {

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
        int col_mid = n/2;
        for(int i = 0;i<n;i++) {
          	 {
          		 if(i!=col_mid) {
                       System.out.print(arr[i][col_mid] + " ");
                   }
          	}
        }
        int row_mid = m/2;
        
        for(int i = 0;i<n;i++) {
       	 {
       		 
                    System.out.print(arr[row_mid][i] + " ");
                }
       	}
        sc.close();
            	
	}
}
