package com.saurabh.hackerrank.algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConnectedCellsInAGrid {
public static boolean[][] visit;
public static int[][] input;
public static int n;
public static int m;
public static int count=0;
public static int max=Integer.MIN_VALUE;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("/home/saurabh/EclipseWorkSpace/JavaPractice/InputFiles/ConnectedCellsInAGrid"));
		
		n=sc.nextInt();
		m=sc.nextInt();
		input=new int[n][m];
	visit=new boolean[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				input[i][j]=sc.nextInt();
			}
		}
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(input[i][j]==1 && !visit[i][j])
				{
					visit[i][j]=true;
					count=1;
					move(i,j);
				}
			}
		}
		
		System.out.println(max);
		
		
		
	}
	
	public static void move(int x,int y)
	{
		if(count>max)
		{
			max=count;
		
		}
		if(x-1>=0 && y-1>=0 && input[x-1][y-1]==1 && !visit[x-1][y-1])
		{
			visit[x-1][y-1]=true;
			count++;
			move(x-1,y-1);
		}
		if(x-1>=0 && input[x-1][y]==1&& !visit[x-1][y])
		{
			visit[x-1][y]=true;
			count++;
			move(x-1,y);
		}
		if(x-1>=0 && y+1<m  && input[x-1][y+1]==1&& !visit[x-1][y+1])
		{
			visit[x-1][y+1]=true;
			count++;
			move(x-1,y+1);
		}
		if(y-1>=0 && input[x][y-1]==1&& !visit[x][y-1])
		{
			visit[x][y-1]=true;
			count++;
			move(x,y-1);
		}
		if(y+1<m && input[x][y+1]==1&& !visit[x][y+1])
		{
			visit[x][y+1]=true;
			count++;
			move(x,y+1);
		}
		if(x+1<n && y-1>=0 && input[x+1][y-1]==1&& !visit[x+1][y-1])
		{
			visit[x+1][y-1]=true;
			count++;
			move(x+1,y-1);
		}
		if(x+1<n && input[x+1][y]==1&& !visit[x+1][y])
		{
			visit[x+1][y]=true;
			count++;
			move(x+1,y);
		}
		if(x+1<n && y+1<m && input[x+1][y+1]==1&& !visit[x+1][y+1])
		{
			visit[x+1][y+1]=true;
			count++;
			move(x+1,y+1);
		}
	}

}
