package org.example.level12_브루트포스

���Ʈ����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P0005_1436_��ȭ������ {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		
		int T = 3;
		int F = 5;
		int Result = 0;
		int count = 0;
		
		while(Result == 0) {
			if(N%F == 0) Result = N/F + count;
			if(N < 0) Result = -1;
			N -= T;
			count++;
		}

		bw.write(String.valueOf(Result));

		bw.flush();
		br.close();
		bw.close();

	}
}
