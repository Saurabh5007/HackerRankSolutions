package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BiggerisGreater {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(
				new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/BiggerisGreater"));

		int tc = sc.nextInt();
		for (int t = 0; t < tc; t++) {
			
			char[] input=sc.next().toCharArray();
			int firstMark=input.length-1;
			
			int lastMark=0;

			boolean lastMarkFound=false;
		
			
			for(int i=input.length-1;i>0;i--)
			{
				if(input[i-1]<input[i])
				{
					lastMark=i-1;
					lastMarkFound=true;
					break;
				}
			}
			
			if(!lastMarkFound)
			{
				System.out.println("no answer");
				continue;
			}
			
			for(int i=input.length-1;i>lastMark;i--)
			{
				if(input[lastMark]<input[i])
				{
					firstMark=i;
					break;
				}
			}
			
			char temp=input[lastMark];
			input[lastMark]=input[firstMark];
			input[firstMark]=temp;
			
			reverseArrayBetweenIndices(input, lastMark+1, input.length-1);
			
			
			
			System.out.println(String.valueOf(input));
		}
	}
	
	public static void reverseArrayBetweenIndices(char[] arr, int beginIndex, int lastIndex)
	{
		int mid=(lastIndex-beginIndex)/2;
		for(int i=0;i<=mid;i++)
		{
			char temp=arr[lastIndex];
			arr[lastIndex]=arr[beginIndex];
			arr[beginIndex]=temp;
			beginIndex++;
			lastIndex--;
		}
	}

}
