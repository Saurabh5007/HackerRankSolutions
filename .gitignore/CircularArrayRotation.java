package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/CircularArrayRotation"));

		int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        
        int[] input=new int[n];
        int[] indexToBePrinted=new int[q];
        
        for(int i=0;i<n;i++)
            {
            input[i]=sc.nextInt();
        }
        
        for(int i=0;i<q;i++)
            {
            indexToBePrinted[i]=sc.nextInt();
        }
        int inputLength=input.length;
        k=k%inputLength;
        if(k<inputLength)
        {
        rotateArray(input, inputLength-k);
        }
        
        for(int i=0;i<q;i++)
        {
        	System.out.println(input[indexToBePrinted[i]]);
        }
	
	}
	
	public static void rotateArray(int[] arr,int rotateCount)
	{
		int n=arr.length;
		reverse(arr, 0, rotateCount-1);
		reverse(arr, rotateCount, n-1);
		reverse(arr, 0, n-1);
		
	}
	
	public static void reverse(int[] arr, int start, int end)
	{
		int temp;
		while(end>start)
		{
			temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			end--;
			start++;
		}
	}

}
