package org.example.level14_집합과맵

���հ���;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class P0005_10816_����ī��2 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			int key = Integer.valueOf(st.nextToken());
			if(map.containsKey(Integer.valueOf(key))) {
				int value = map.get(key);
				map.put(key, value + 1);
			}else {
				map.put(key, 1);
			}
		}
		
		int M = Integer.valueOf(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int j = 0; j < M; j++) {
			int testkey = Integer.valueOf(st.nextToken()); 
			if(map.containsKey(testkey)) {
				bw.write(map.get(testkey) + " ");
			}else {
				bw.write("0 ");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
