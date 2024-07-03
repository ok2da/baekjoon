package org.example.level9_약수_배수와_소수

���_�����_�Ҽ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0005_11653_���μ����� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
	

		for(int i = 2; i*i <= N; i++) {
			while(N%i == 0) {
				N /= i;
				bw.write(String.valueOf(i));
				bw.write("\n");
			}	
		}
		if(N != 1) {
			bw.write(String.valueOf(N));	
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
