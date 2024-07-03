package org.example.level13_정렬

����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P0001_2750_�������ϱ� {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		int[] Result = new int[N];
		
		for(int i = 0; i < N; i++) {
			Result[i] = Integer.valueOf(br.readLine());
		}
		
		Arrays.sort(Result);
		
		for(int R : Result) {
			bw.write(String.valueOf(R) + "\n");			
		}


		bw.flush();
		br.close();
		bw.close();

	}
}
