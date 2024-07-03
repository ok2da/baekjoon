package org.example.level13_정렬

����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P0005_10989_�������ϱ�3 {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		//int[] num = new int[N];							//���1
		int[] num = new int[10001];							//���2
				
////		while(N > 0) {									//���1
////			num[N-1] = Integer.valueOf(br.readLine());
////			N--;
////		}
//		
//		Arrays.sort(num);
//		
//		for(int n : num) {
//			bw.write(String.valueOf(n) + "\n");
//		}
		
		for(int i = 0; i < N; i++) {						//���2
			num[Integer.valueOf(br.readLine())]++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int j = 1; j < 10001; j++) {
			while(num[j] > 0) {
				sb.append(j).append("\n");
				num[j]--;
			}
		}
		
		System.out.println(sb);
		
		bw.flush();
		br.close();
		bw.close();

	}
}
