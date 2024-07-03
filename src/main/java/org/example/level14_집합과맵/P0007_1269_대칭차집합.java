package org.example.level14_집합과맵

���հ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P0007_1269_��Ī������ {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < A; i++) {
			map.put(Integer.valueOf(st.nextToken()), null);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int j = 0; j < B; j++) {
			int num = Integer.valueOf(st.nextToken());
			if(map.containsKey(num)) {
				map.remove(num);
			}else {
				map.put(num, null);
			}
		}
		
		bw.write(String.valueOf(map.size()));


		br.close();
		bw.flush();
		bw.close();
	}
}
