package org.example.level14_집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P0001_10815_숫자카드 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashMap <String,Integer> sanggeun_card = new HashMap<String,Integer>();
		
		for(int i = 0; i < N; i++) {
			sanggeun_card.put(st.nextToken(), 0);
		}
		
		int M = Integer.valueOf(br.readLine());
		String[] comparison_card = br.readLine().split(" ");
		
		
		for(int j = 0; j < M; j++) {
			if(sanggeun_card.get(comparison_card[j]) != null) {
				bw.write("1 ");
			}else {
				bw.write("0 ");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
