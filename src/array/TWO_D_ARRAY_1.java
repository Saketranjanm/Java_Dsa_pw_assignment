//Q1: Take m and n input from the user and m * n integer inputs from user and print the following:			 
//	number of positive numbers
//
//	number of negative numbers
//
//	number of odd numbers
//
//	number of even numbers
//
//	number of 0.
package array;

import java.util.Scanner;

public class TWO_D_ARRAY_1 {
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
        int count =0,count1=0,count2=0,count3=0,count4=0;
        for(int i = 0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		if(arr[i][j] > 0) {
        			count ++;
        			
        		}
        	}
        }
        	for(int i = 0;i<m;i++) {
            	for(int j=0;j<n;j++) {
        		 if(arr[i][j] < 0) {
        			count1 ++;
        			
        		}
        	}
        	}
        	for(int i = 0;i<m;i++) {
            	for(int j=0;j<n;j++) {
        		 if(arr[i][j] % 2 != 0) {
        			count2 ++;
        			
        		}
            	}
        	}
        	for(int i = 0;i<m;i++) {
            	for(int j=0;j<n;j++) {
            		if(arr[i][j] % 2 == 0) {
        			count3 ++;
        			
        		}
            		}
            	}
        	for(int i = 0;i<m;i++) {
            	for(int j=0;j<n;j++) {
            		if(arr[i][j] == 0) {
        			count4 ++;
        			
        		}
        		
        	}
        }
        System.out.println("number of positive numbers : " + count+ "");
		System.out.println("number of negative numbers : " + count1+ "");
		System.out.println("number of odd numbers : " + count2+ "");
		System.out.println("number of even numbers : " + count3+ "");
		System.out.println("number of 0 numbers : " + count4+ "");
		sc.close();
	}
	
}
