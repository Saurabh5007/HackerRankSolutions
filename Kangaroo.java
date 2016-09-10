package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/Kangaroo"));
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		
		int moveX=x1+v1;
		int moveY=x2+v2;
		while(true)
        {
            
			if ((absValue(moveX-moveY) - absValue(x1 - x2)) > 0) {
				System.out.println("NO");
				break;
			} else{
                if(moveX-moveY==0)
				{
					System.out.println("YES");
					break;
				}
                
                if((moveX-moveY)>0)
				{
					System.out.println("NO");
					break;
				}
                
                
				x1=moveX;
				x2=moveY;
				moveX=x1+v1;
				moveY=x2+v2;
		
			}
		}
	}

	public static int absValue(int n) {
		return n > 1 ? n : n * (-1);
	}
}
