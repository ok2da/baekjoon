package org.example.level14_집합과맵

���հ���;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class P0004_1620_���¾����ϸ󸶽����̴ټ� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap <String,Integer> dogam = new HashMap<String,Integer>();
		
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		String[] sub_dogam = new String[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String dogam_pokemon = st.nextToken();
			dogam.put(dogam_pokemon, i);
			sub_dogam[i] = dogam_pokemon;
		}
		
		for(int j = 0; j < M; j++) {
			st = new StringTokenizer(br.readLine());
			String pokemon = st.nextToken();
			
			if(Pattern.matches("[0-9]+", pokemon)) {
				bw.write(sub_dogam[Integer.valueOf(pokemon)-1] + "\n");
			}else {
				bw.write(String.valueOf(dogam.get(pokemon)+1) + "\n");
			}
		}
		

		br.close();
		bw.flush();
		bw.close();
	}
}
