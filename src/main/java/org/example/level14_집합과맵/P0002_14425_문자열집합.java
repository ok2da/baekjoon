package org.example.level14_집합과맵

���հ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P0002_14425_���ڿ����� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashMap <String,Integer> testmessage = new HashMap<String,Integer>();
		
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			testmessage.put(br.readLine(), 1);
		}	
		
		for(int j = 0; j < M; j++) {
			if(testmessage.containsKey(br.readLine())) {
				result++;
			}
		}
		
		bw.write(String.valueOf(result));
		
		br.close();
		bw.flush();
		bw.close();
	}
}
