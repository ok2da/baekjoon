package org.example.level12_브루트포스

���Ʈ����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P0006_2839_������� {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		int R = 666;
		int count = 1;

		while(count != N) {
			R++;
			if(String.valueOf(R).contains("666")) {
				count++;
			}
		}

		bw.write(String.valueOf(R));

		bw.flush();
		br.close();
		bw.close();

	}
}
