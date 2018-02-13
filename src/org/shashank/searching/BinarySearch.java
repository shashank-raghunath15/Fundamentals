package org.shashank.searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int a[] = new int[1000000];
		for(int i=0;i<a.length;i++) {
			a[i] = i;
		}
		
		System.out.println("Enter element to be searched");
		int x = in.nextInt();
		long t1 = System.nanoTime();
		System.out.println(binarySearch(a, x));
		System.out.println("Time taken: " +(System.nanoTime()-t1));
		in.close();
	}
	
	public static String binarySearch(int a[], int x) {
		int start = 0;
		int end = a.length-1;
		int mid = a.length/2;
		return binarySearch(a,x,start,mid,end);
	}

	private static String binarySearch(int[] a, int x, int start, int mid, int end) {
		// TODO Auto-generated method stub
		if(start>=end) {
			return "Not Found";
		}
		
		if(a[mid] == x) {
			return "Found at " +(mid +1);
		}
		
		if(x>mid) {
			start = mid +1;
			mid = (start+end)/2;
			return binarySearch(a,x,start,mid,end);
		}
		
		if(x<mid) {
			end = mid;
			mid = (start+end)/2;
			return binarySearch(a,x,start,mid,end);
		}
		return "Not Found";
	}

}

