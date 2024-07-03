package org.example.level5_문자열

���ڿ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0007_2675_���ڿ��ݺ� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int R = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < R; i++) {
			String[] input = br.readLine().split(" ");
			int T = Integer.valueOf(input[0]);
			String S = input[1];
			
			char[] c = S.toCharArray();
			
			for(char P : c) {
				for(int j = 0; j < T; j++) {
					bw.write(P);
				}
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

