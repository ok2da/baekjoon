package org.example.level10_기하_직사각형과_삼각형

����_���簢����_�ﰢ��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0003_3009_�׹�°�� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] number = new int[3][2];
		int[] ver = new int[2];
		
		for(int i = 0; i < 3; i++) {
			String[] input = br.readLine().split(" ");
			number[i][0] = Integer.valueOf(input[0]);
			number[i][1] = Integer.valueOf(input[1]);
		}
		
		if(number[0][0] == number[1][0])ver[0] = number[2][0];
		if(number[0][0] == number[2][0])ver[0] = number[1][0];
		if(number[1][0] == number[2][0])ver[0] = number[0][0];
		
		if(number[0][1] == number[1][1])ver[1] = number[2][1];
		if(number[0][1] == number[2][1])ver[1] = number[1][1];
		if(number[1][1] == number[2][1])ver[1] = number[0][1];

		for(int r : ver) {
			bw.write(r + " ");
		}

		bw.flush();
		br.close();
		bw.close();
		
	}
}
