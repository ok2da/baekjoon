package org.example.level8_일반수학1

�Ϲݼ���1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0001_2745_������ȯ {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		//int N = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		
		int result = Integer.parseInt(input[0],B);
		
		bw.write(String.valueOf(result));
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}
