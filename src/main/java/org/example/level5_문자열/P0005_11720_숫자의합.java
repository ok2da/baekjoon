package org.example.level5_문자열

���ڿ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0005_11720_�������� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());	//�Ⱦ�
		int sum = 0;
		String[] M = br.readLine().split("");
		
		for(String t : M) {
			sum += Integer.parseInt(t);
		}
		
		br.close();
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
