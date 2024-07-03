package org.example.level7_2차원배열

�����迭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0001_2738_��ĵ��� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		
		int[][] T = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String[] input_number_A = br.readLine().split(" ");
			for(int j = 0; j < M; j++) {
				T[i][j] = Integer.parseInt(input_number_A[j]);
			}
		}
		
		for(int k = 0; k < N; k++) {
			String[] input_number_B = br.readLine().split(" ");
			for(int l = 0; l < M; l++) {
				T[k][l] += Integer.parseInt(input_number_B[l]);
			}
		}
		
		for(int[] r : T) {
			for(int rr : r) {
				bw.write(rr + " ");
			}
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
