//Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element, 
//else print “Element not found in array”. Input the size of array, array from user and the element X from user. 
//Use Linear Search to find the element
package searching_sorting_numbersystem;

import java.util.Scanner;

public class Linear_searching {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to find  in array: ");
		int x = sc.nextInt();
		int idx = -1;
		for(int i = 0;i<n;i++) {
			
			if(arr[i]==x) {
				idx = i;
				break;
			}
		}
		
		 if(idx ==-1) {
			 System.out.println("searched element is not found in the array. ");
		 }
		 else {
			 System.out.println("searched element is found at location: " +idx);
		 }sc.close();
		}
}
