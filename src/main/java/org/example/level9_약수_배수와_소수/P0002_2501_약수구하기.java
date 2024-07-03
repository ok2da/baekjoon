package org.example.level9_약수_배수와_소수

���_�����_�Ҽ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0002_2501_������ϱ� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		int[] R = new int[N];
		int i = 1;
		int t = 0;
		
		while(i <= N) {
			if(N%i == 0) {
				R[t] = i;
				t++;
			}
			i++;
			if(t == K) {
				break;
			}
		}

		bw.write(String.valueOf(R[K-1]));
		
		br.close();
		bw.flush();
		bw.close();
	}
}
