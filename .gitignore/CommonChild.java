package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CommonChild {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/CommonChild"));
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			int foundOnB=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					foundOnB=j;
				}
			}
		}

	}

}
