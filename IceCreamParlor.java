package com.saurabh.hackerrank.algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IceCreamParlor {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("/home/saurabh/EclipseWorkSpace/JavaPractice/InputFiles/IceCreamParlor"));
		
		int tc=sc.nextInt();
		for(int t=0;t<tc;t++)
		{
			int m=sc.nextInt();
			int n=sc.nextInt();
			int[] input=new int[n];
			for(int i=0;i<n;i++)
			{
				input[i]=sc.nextInt();
			}
			boolean found=false;
			int first=0;
			int second=0;
			outer:
				for(int i=0;i<n;i++)
				{
					for(int j=i+1;j<n;j++)
					{
						if(input[i]+input[j]==m)
						{
							found=true;
							first=i;
							second=j;
							break outer;
						}
					}
				}
			
			if(found)
				System.out.println((first+1)+" "+(second+1));
		}
	}

}
