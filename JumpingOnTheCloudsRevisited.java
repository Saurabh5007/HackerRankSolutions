package com.saurabh.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(
				new File("/home/saurabh/EclipseWorkSpace/CoreJavaPractice/InputFiles/JumpingOnTheCloudsRevisited"));
		int n = in.nextInt();
		int k = in.nextInt();
		int[] input = new int[n];
		int energyLevel = 100;
		for (int i = 0; i < n; i++) {
			input[i] = in.nextInt();
		}
		int pos = k;
		while (((n + pos) % n) != 0) {
			if (input[pos] == 0) {
				energyLevel--;
			} else {
				energyLevel -= 3;
			}

			pos = pos + k;

		}
		if (input[0] == 0)
			System.out.println(energyLevel - 1);
		else if (input[0] == 1)
			System.out.println(energyLevel - 3);

	}

}
