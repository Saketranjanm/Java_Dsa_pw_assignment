// write a program to print the elements above the secondary diagonal in a user input
	//square matrix.		
	//
	//Input 1:
	//
	//1 2 3
	//4 5 6
	//7 8 9

	//Output : 1 2 4
package array;

	import java.util.Scanner;

	public class Above_Secondary_Diagonal {

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
		        	for(int j=0;j<n;j++) {
		        		 if (i + j < m - 1) {
		                     System.out.print(arr[i][j] + " ");
		                 }
		        	}
		        }
		        sc.close();
		}

	}
	//
	//output:
//		Enter the row of the array: 
//			3 
//			Enter the col of the array: 
//			3 
//			Enter the elements in the array: 
//			1 2 3 
//			4 5 6 
//			7 8 9
//			
//			1 2 4 

