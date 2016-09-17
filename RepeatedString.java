package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/RepeatedString"));
		
		char[] input=sc.next().toCharArray();
		long N=sc.nextLong();
		int inputLength=input.length;
		int fullCount=0;
		int partialCount=0;
		long full=N/inputLength;
		int partial=(int) (N%inputLength);
		
		for(int i=0;i<inputLength;i++)
		{
			if(input[i]=='a')
			{
				fullCount++;
			}
		}
		for(int i=0;i<partial;i++)
		{
			if(input[i]=='a')
			{
				partialCount++;
			}
		}
		
		System.out.println(fullCount*full + partialCount);


	}

}
