package com.saurabh.hackerrank.algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GridlandMetro {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/home/saurabh/EclipseWorkSpace/JavaPractice/InputFiles/GridlandMetro"));

		long n = sc.nextLong();
		long m = sc.nextLong();
		int k = sc.nextInt();
		long count = 0;

		long[][] check = new long[3][k];
		for(int i=0;i<k;i++)
		{
			check[0][i]=-1;
		}
		for (int i = 0; i < k; i++) {
			long r = sc.nextLong() - 1;
			long c1 = sc.nextLong() - 1;
			long c2 = sc.nextLong() - 1;
			int numberIndex = checkNumberPresence(check[0], r);
			if (numberIndex != -1) {
				long c1FromArr = check[1][numberIndex];
				if (c1FromArr > c1) {
					count = count + (c1FromArr - c1);
					check[1][numberIndex]=c1;

				}
				
				long c2FromArr = check[2][numberIndex];
				if (c2FromArr < c2) {
					if(c1>c2FromArr)
					{
						count=count+(c2-c1+1);
					}
					else
					{
					count = count + (c2 - c2FromArr);
					check[2][numberIndex]=c2;
					}
					
				}

			} else {
				check[0][i] = r;
				check[1][i] = c1;
				check[2][i] = c2;
				count = count + (c2 - c1 + 1);
			}

		}

		count = n * m - count;

		System.out.println(count);

	}

	public static int checkNumberPresence(long[] arr, long number) {
		int ans = -1;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if (number == arr[i]) {
				return i;
			}
		}
		return ans;
	}

}
