package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FlatlandSpaceStations {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/FlatlandSpaceStations"));

		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] spaceLocations=new int[m];
		
		int maxMove=0;
		for(int i=0;i<m;i++)
		{
			spaceLocations[i]=sc.nextInt();
		}
		
		int[] cityLocations=new int[n];
		for(int i=0;i<m;i++)
		{
			cityLocations[spaceLocations[i]]=-1;
		}
		for(int i=0;i<n;i++)
		{
			int move = 0;
			if(cityLocations[i]!=-1)
			{
				int step=i;
				int moveBack=0;
				int MoveFront=0;
				while(step>0 && cityLocations[step]!=-1)
				{
					step--;
					moveBack++;
				}
				step=i;
				while(step<n-1 && cityLocations[step]!=-1)
				{
					step++;
					MoveFront++;
				}
				
				if(moveBack==0)
				{
					move=MoveFront;
				}else if(MoveFront==0)
				{
					move=moveBack;
				}
				
				if(moveBack!=0 && moveBack<=MoveFront)
				{
					move=moveBack;
				}else if(MoveFront!=0 && moveBack>=MoveFront)
				{
					move=MoveFront;
				}
				
				if(move>maxMove)
				{
					maxMove=move;
				}
				
				
			}
		}
		
		System.out.println(maxMove);
	}

}
