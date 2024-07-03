package org.example.level11_시간복잡도

�ð����⵵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0004_24265_�˰������_�˰����Ǽ���ð�4 {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long n = Integer.valueOf(br.readLine());
		
//		int A[] = new int[(int) n];
//		int sum = 0;
//		
//		
//		long num = 0;
//		
//		for(int i = 1; i <= n-1; i++) {
//			for(int j = i+1; j <= n; j++) {
//				sum = sum + A[i-1] * A[j-1];
//				num++;
//			}
//		}
//		
//		bw.write(String.valueOf(num) + "\n");
//		bw.write("2");
		
		bw.write(String.valueOf(n*(n-1)/2) + "\n");
		bw.write("2");
		
		bw.flush();
		br.close();
		bw.close();

	}
}
