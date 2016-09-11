package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LisasWorkbook {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/LisasWorkbook"));

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int result = 0;
		int counter = 0;
		for (int i = 0; i < n; i++) {
			int start = 1;
			int end = 0;
			int loopCount = 0;
			if (arr[i] % k != 0)
				loopCount = arr[i] / k + 1;
			else
				loopCount = arr[i] / k;
			while (loopCount > 0) {
				end = start + k - 1;

				counter++;
				if (arr[i] >= counter && counter >= start && counter <= end) {
					result++;
				}

				loopCount--;
				start = end + 1;
			}

		}
		System.out.println(result);
	}

}
