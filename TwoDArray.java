package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/TwoDArray"));
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<4;i++)
            {
            for(int j=0;j<4;j++)
                {
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum>=max)
                    {
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}

