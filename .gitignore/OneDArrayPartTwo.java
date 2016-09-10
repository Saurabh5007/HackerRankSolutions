package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OneDArrayPartTwo {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(
				new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/OneDArrayPartTwo"));

		int tc = in.nextInt();
		for (int t = 0; t < tc; t++) {
			
			int N = in.nextInt();
			int m = in.nextInt();
			if(m==0)
			{
				m=1;
			}
			int[] input = new int[N];
			int i = 0;
			for (int p = 0; p < N; p++) {
				input[p] = in.nextInt();
			}
			boolean back = false;
			for (; i < N;) {
				
				if (i + m >= N) {
					System.out.println("YES");
					break;
				}
				if (i < 0) {
					System.out.println("NO");
					break;
				}
				
				
				if (input[i + m] == 0 && !back) {
					i = i + m;
					back=false;
				} else if (input[i + 1] == 0 && !back) {
					i = i + 1;
				} else if (i>0 && input[i - 1] == 0) {
					i=i-1;
					back=true;
					if(i==0 || input[i]==1)
					{
						System.out.println("NO");
						break;
					}
		
					
				} else {
					System.out.println("NO");
					break;
				}

			}
			
		
		}
	}

}
