package org.example.level4_1차원_배열

����_�迭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0009_10811_�ٱ��ϵ����� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		String[] NM = input.split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		int[] num = new int[N];
		for(int s = 0; s < N; s++) {
			num[s] = s + 1;
		}
		
		for(int t = 0; t < M; t++) {
			String inputs = br.readLine();
			String[] ij = inputs.split(" ");
			int i = Integer.parseInt(ij[0]);
			int j = Integer.parseInt(ij[1]);

			for (int tt = 0; tt < (j - i) / 2 + 1; tt++) {
			    int imsi = num[(i-1) + tt];
			    num[(i-1) + tt] = num[(j-1) - tt];
			    num[(j-1) - tt] = imsi;
			}
		
			}

		for(int n : num) {
			bw.write(String.valueOf(n) + " ");			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
