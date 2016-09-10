package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/StrangeCounter"));

		long t = in.nextLong();
		long marker = 3;
		while (marker <= t / 2) {
			marker = marker * 2;
		}
		long pos = marker - 2;
		long move = t - pos;
		if ((marker - move) >= 2)
			System.out.println(marker - move);
		else if ((marker - move) == 1 || (marker==move))
			System.out.println(marker * 2);
		else {
			System.out.println((marker * 2) - 1);
		}
	}

}
