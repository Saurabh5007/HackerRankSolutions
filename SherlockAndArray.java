package com.saurabh.hackerrank.algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("/home/saurabh/EclipseWorkSpace/JavaPractice/InputFiles/SherlockAndArray"));
		
		int tc=sc.nextInt();
		for(int t=0;t<tc;t++)
		{
			
			boolean found=false;
			int N=sc.nextInt();
			
			int[] input=new int[N];
			input[0]=sc.nextInt();
			if(N==1)
			{
				System.out.println("YES");
				continue;
			}
			for(int i=1;i<N;i++)
			{
				input[i]=input[i-1]+sc.nextInt();
				
			}
			int sum=input[N-1];
			for(int i=1;i<N-1;i++)
			{
				if(input[i]==sum-input[i-1])
				{
					found=true;
					break;
				}
				
			}
			
			if(found)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}

	}

}
