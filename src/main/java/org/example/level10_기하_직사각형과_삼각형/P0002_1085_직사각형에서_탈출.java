package org.example.level10_기하_직사각형과_삼각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0002_1085_직사각형에서_탈출 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int x = Integer.valueOf(input[0]);
		int y = Integer.valueOf(input[1]);
		int w = Integer.valueOf(input[2]);
		int h = Integer.valueOf(input[3]);
		
		int t1 = (w-x) < x ? (w-x) : x;
		int t2 = (h-y) < y ? (h-y) : y;
		
		if(t1 < t2) {
			bw.write(String.valueOf(t1));
		}else {
			bw.write(String.valueOf(t2));			
		}

		bw.flush();
		br.close();
		bw.close();
		
	}
}
