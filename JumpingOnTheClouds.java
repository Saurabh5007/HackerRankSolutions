package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/JumpingOnTheClouds"));

		int n=in.nextInt();
		int[] cloud=new int[n];
		
		for(int i=0;i<n;i++)
		{
			cloud[i]=in.nextInt();
		}
		
		int jump=0;
		for(int i=0;i<n-1;)
		{
			if((i+2<n)&&cloud[i+2]==0)
				i=i+2;
			else
				i=i+1;
			
			jump++;
		}
		System.out.println(jump);
	}

}
