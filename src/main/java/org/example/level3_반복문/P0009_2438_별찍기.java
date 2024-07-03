package org.example.level3_반복문

�ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0009_2438_����� {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int N = Integer.parseInt(input);
		
		for(int i = 0; i < N; i++) {
			for(int p = 0; p < i+1; p++) {
				bw.write("*");				
			}
			bw.write("\n");
		}
		
        bw.flush();
        bw.close();
        br.close();
	}
}
