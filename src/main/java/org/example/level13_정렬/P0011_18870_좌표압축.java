package org.example.level13_정렬

����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P0011_18870_��ǥ���� {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		int[] number = new int[N];
		int[] order = new int[N];
		HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
		int rank = 0;
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			number[i] = order[i] = Integer.valueOf(st.nextToken());
		}
		
		Arrays.sort(order);
		
		for(int j = 0; j < N; j++) {
			if(!rankMap.containsKey(order[j])) {
				rankMap.put(order[j], rank++);
			}
		}
		
		for(int k = 0; k < N; k++) {
			bw.write(String.valueOf(rankMap.get(number[k])) + " ");
		}
		
		bw.flush();
		br.close();
		bw.close();

	}

}

