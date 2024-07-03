package org.example.level8_일반수학1

�Ϲݼ���1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0005_2292_���� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int N = Integer.parseInt(br.readLine());
		
		int count = 1;
		int range = 2;
		
		if(N != 1) {
			while(range <= N) {
				range = range + ( 6 * count );
				count++;
			}
		}
		
		bw.write(String.valueOf(count));
	
		br.close();
		bw.flush();
		bw.close();
	}
}
