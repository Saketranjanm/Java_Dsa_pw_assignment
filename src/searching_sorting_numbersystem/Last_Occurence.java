// Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is 
//not present return -1.
//
//Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
//
//Output 1: 6
//
//Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
//
//Output 2: -1

package searching_sorting_numbersystem;

import java.util.Scanner;

public class Last_Occurence {

	public static int LastOccurence(int arr[],int x) {
		int count = -1;
		for(int i = 0;i<arr.length;i++) {
			if(x == arr[i]) {
				count = i;
			   }
			}
		 {
			return count;
		}
	}
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
		System.out.println("Enter the element to find its last occcurence in array: ");
		int x = sc.nextInt();
		int result = LastOccurence(arr,x);
		if(result == -1) {
		System.out.println(result);
	}
		else {
			System.out.println("last occured at index: "+result);
		}
		sc.close();

}
	}
//
//output:
//	Enter the size of array: 
//		12
//		Enter the elements of array: 
//		1 1 1 2 3 4 4 5 6 6 6 6
//		Enter the element to find its last occcurence in array: 
//		4
//		last occured at index: 6