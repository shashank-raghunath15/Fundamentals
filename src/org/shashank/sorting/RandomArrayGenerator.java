package org.shashank.sorting;

import java.util.Random;

public class RandomArrayGenerator {

	private static Random random = new Random();

	public static int[] getIntArray(int size) {
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = random.nextInt(size);
		}
		return a;
	}
}
