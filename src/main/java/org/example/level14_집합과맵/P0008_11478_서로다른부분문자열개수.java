package org.example.level14_집합과맵

���հ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class P0008_11478_���δٸ��κй��ڿ����� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		int N = S.length();
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i ++) {
			for(int j = i+1; j <= N; j++) {
				map.put(S.substring(i, j), null);
			}
		}
		
		bw.write(String.valueOf(map.size()));
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}
