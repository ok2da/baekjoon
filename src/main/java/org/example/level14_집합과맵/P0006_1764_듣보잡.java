package org.example.level14_집합과맵

���հ���;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class P0006_1764_�躸�� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		HashMap<String,Integer> saram = new HashMap<>();
		ArrayList<String> personwithout = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			saram.put(br.readLine(), 0);
		}
		
		for(int j = 0; j < M; j++) {
			String testperson = br.readLine();
			if(saram.containsKey(testperson)) {
				personwithout.add(testperson);
			}
		}
		
		bw.write(String.valueOf(personwithout.size()) + "\n");
		
		Collections.sort(personwithout);
		
		for(String r : personwithout) {
			bw.write(r + "\n");
		}


		br.close();
		bw.flush();
		bw.close();
	}
}
