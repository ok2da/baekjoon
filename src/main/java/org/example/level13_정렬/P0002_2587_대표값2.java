package org.example.level13_정렬

����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P0002_2587_��ǥ��2 {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int value = 5;
		int sum = 0;
		int mid = 0;
		
		int[] num = new int[value];
		
		for(int i = 0; i < value; i++) {
			num[i] = Integer.valueOf(br.readLine());
			sum += num[i];
		}
		
		Arrays.sort(num);
		mid = num[value/2];
		
		bw.write(String.valueOf(sum/value) + "\n");
		bw.write(String.valueOf(mid));

		bw.flush();
		br.close();
		bw.close();

	}
}
