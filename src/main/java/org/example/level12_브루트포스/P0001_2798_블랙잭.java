package org.example.level12_브루트포스

���Ʈ����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P0001_2798_���� {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int sum = 0;
		int tmp = 0;
		
		st = new StringTokenizer(br.readLine());
		
		int[] list = new int[N];
		
		for(int i = 0; i < N; i++) {
			list[i] = Integer.valueOf(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				for(int k = j+1; k < N; k++) {
					sum = list[i] + list[j] + list[k];
					if(tmp < sum && sum <= M) {
						tmp = sum;
					}
				}
			}
		}
		
		bw.write(String.valueOf(tmp));

		bw.flush();
		br.close();
		bw.close();

	}
}
