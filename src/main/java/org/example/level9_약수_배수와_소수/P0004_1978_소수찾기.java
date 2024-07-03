package org.example.level9_약수_배수와_소수

���_�����_�Ҽ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0004_1978_�Ҽ�ã�� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int Max = 0;
		int Min = 0;
		
		for(int i = M; M <=N; M++) {
			boolean isPrime = true;
			
			if(M > 1) {
				for(int j = 2; j*j <= M; j++) {
					if(M%j == 0) {
						isPrime = false;
						break;
					}
				}
			}else {
				isPrime = false;
			}
			
			if(isPrime) {
				if(Max == 0) {
					Min = M;
				}
				Max += M;
			}
			
		}
		
		if(Max != 0) {
			bw.write(String.valueOf(Max) + "\n" + String.valueOf(Min));			
		}else {
			bw.write(String.valueOf("-1"));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}
