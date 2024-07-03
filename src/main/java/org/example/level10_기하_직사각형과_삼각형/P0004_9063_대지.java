package org.example.level10_기하_직사각형과_삼각형

����_���簢����_�ﰢ��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0004_9063_���� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.valueOf(br.readLine());
		int[][] ver = new int[n][2];
		int x_min = Integer.MAX_VALUE;
		int x_max = Integer.MIN_VALUE;
		int y_min = Integer.MAX_VALUE;
		int y_max = Integer.MIN_VALUE;

		
		for(int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			ver[i][0] = Integer.valueOf(input[0]);
			ver[i][1] = Integer.valueOf(input[1]);
			
			if(ver[i][0] > x_max) x_max = ver[i][0];
			if(ver[i][0] < x_min) x_min = ver[i][0];
			
			if(ver[i][1] > y_max) y_max = ver[i][1];
			if(ver[i][1] < y_min) y_min = ver[i][1]; 
		}
		
		bw.write(String.valueOf((x_max-x_min)*(y_max-y_min)));			


		bw.flush();
		br.close();
		bw.close();
		
	}
}
