package org.example.level4_1차원_배열

����_�迭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0010_1546_��� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		double Result = 0.0;
		int Max = 0;
		int plus = 0;
		String[] numbers = new String[N];
		String number = br.readLine();
		numbers = number.split(" ");			

		for(int j = 0; j < N; j++) {
			plus = Integer.parseInt(numbers[j]);
			if(plus > Max) {
				Max = plus;
			}
		}
		
		for(int y = 0; y < N; y++) {
			Result += (double)Integer.parseInt(numbers[y]) / Max * 100;
		}
		
		Result = Result/N;
		br.close();
		bw.write(String.valueOf(Result));
		bw.flush();
		bw.close();
	}
}
