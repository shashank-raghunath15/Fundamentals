package org.shashank.searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int a[] = new int[1000000];
		for(int i=0;i<a.length;i++) {
			a[i] = i;
		}
		
		System.out.println("Enter element to be searched");
		int x = in.nextInt();
		String result = "Not found";
		long t1 = System.nanoTime();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				result = "Found at " + (i + 1);
			}
		}
		System.out.println(result);
		System.out.println("Time taken: " +(System.nanoTime()-t1));
		in.close();
	}

}
