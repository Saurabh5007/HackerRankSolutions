package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SavethePrisoner {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(
				new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/SavethePrisoner"));
		int tc = in.nextInt();
		for (int t = 0; t < tc; t++) {
			
			long N=in.nextLong();
			long M=in.nextLong();
			long S=in.nextLong();
			
			if(M>N)
			{
				M=M%N;
			}
			
			S=S+M;
			if(S>N)
			{
				S=S%N;
			}
			if(S==1)
			{
				System.out.println(N);
			}
			else
			System.out.println(S-1);
		}

	}

}
