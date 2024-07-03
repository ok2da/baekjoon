package org.example.level13_정렬

����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class P0003_25305_ĿƮ���� {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.valueOf(input[0]);
		int k = Integer.valueOf(input[1]);
		Integer[] x = new Integer[N];
		
		String[] input2 = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			x[i] = Integer.valueOf(input2[i]);
		}
		
		Arrays.sort(x, Collections.reverseOrder());
		
		bw.write(String.valueOf(x[k-1]));
		
		bw.flush();
		br.close();
		bw.close();

	}
}
