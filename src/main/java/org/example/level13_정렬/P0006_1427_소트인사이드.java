package org.example.level13_정렬

����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class P0006_1427_��Ʈ�λ��̵� {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split("");			//���1
		
		Arrays.sort(input, Collections.reverseOrder());
		
		for(String i : input) {
			bw.write(i);
		}
		
//		int[] input = new int[10];							//���2
//		int N = Integer.valueOf(br.readLine());
//		
//		while(N != 0) {
//			input[N % 10]++;
//			N /= 10;
//		}
//		
//		for(int i = 9; i >= 0; i--) {
//			while(input[i]-- > 0) {
//				System.out.print(i);
//			}
//		}
		
		bw.flush();
		br.close();
		bw.close();

	}
}