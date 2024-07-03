package org.example.level12_브루트포스

���Ʈ����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0002_2231_������ {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		int D = N;
		int count = 0;
		int tmp = 0;
		
		while(D != 0) {
			D /= 10;
			count++;
		}
		
		tmp = N-count*9;
		
		for(int i = tmp; i < N; i++) {
			int R = 0;
			
			for(int j = 0; j < String.valueOf(i).length(); j++) {
				char ch = String.valueOf(i).charAt(j);
				R += ch - '0';
			}
			
			if(R+i == N) {
				bw.write(String.valueOf(i));
				break;
			}
			
			if(i+1 == N) {
				bw.write("0");
			}
		}

		bw.flush();
		br.close();
		bw.close();

	}
}
