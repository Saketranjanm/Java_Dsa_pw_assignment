//Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than 
//its just left and just right neighbor.
//Input 1: arr[] = {1,3,2,6,5}
//Output 1: 6

package array;

import java.util.Scanner;

public class PeakElement1D {
	 public static int findPeakElement(int[] arr) {
	        int n = arr.length;

	        
	        if (n == 1 || arr[0] > arr[1]) {
	            return 0;
	        }
	        if (n == 2 || arr[n - 1] > arr[n - 2]) {
	            return n - 1;
	        }

	        
	        for (int i = 1; i < n - 1; i++) {
	            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
	                return i;
	            }
	        }

	        
	        return -1;
	    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the size of the array: ");
	     int n = sc.nextInt();
	     System.out.println("Enter the elements in the array: ");
	     int arr[] = new int[n];
	     for(int i = 0; i<n;i++) {
	    	 arr[i] = sc.nextInt();
	     } 
	     int peakIndex = findPeakElement(arr);

	        if (peakIndex == -1) {
	            System.out.println("No peak element found");
	        } else {
	            System.out.println("Peak element found at index " + peakIndex + ": " + arr[peakIndex]);
	        }
	        sc.close();
	}
}
