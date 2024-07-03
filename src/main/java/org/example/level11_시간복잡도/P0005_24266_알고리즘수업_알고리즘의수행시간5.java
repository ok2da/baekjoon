package org.example.level11_시간복잡도

�ð����⵵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0005_24266_�˰������_�˰����Ǽ���ð�5 {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long n = Integer.valueOf(br.readLine());
		
//		long count = 0;
//		
//		for(int i = 1; i <= n-2; i++) {
//			for(int j = i+1; j <= n-1; j++) {
//				for(int k = j+1; k <= n; k++) {
//					count++;
//				}
//			}
//		}
		
		bw.write(String.valueOf(n*(n-2)*(n-1)/6) + "\n");
		bw.write("3");

		
		bw.flush();
		br.close();
		bw.close();

	}
}
