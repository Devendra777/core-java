package com.xworkz.interview;

public class LargestAndSmallest {

	public static void findLargestAndSmallestNumbber(int a[]) {

		int smallest = a[0];
		int largest = a[0];

		for (int index = 1; index < a.length; index++) {
			if (a[index] > largest) {
				largest = a[index];
			} else if (a[index] < smallest) {
				smallest = a[index];
			}
		}

		System.out.println("The Largest number is " + largest);
		System.out.println("The Smallest number is " + smallest);
	}

	public static void main(String[] args) {

		int a[] = { 34, 56, 78, 89, 108, 566, 4 };
		findLargestAndSmallestNumbber(a);
	}

}
