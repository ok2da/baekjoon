package org.example.level14_집합과맵

���հ���;

import java.io.*;
import java.util.*;

public class P0003_7785_ȸ�翡�ִ»�� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap <String,String> workman = new HashMap<String,String>();
		
		int n = Integer.valueOf(st.nextToken());

		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();
			
			if(workman.containsKey(name)) {
				workman.remove(name);
			}else {
				workman.put(name, state);
			}
		}
		
		TreeMap<String,String> treemap = new TreeMap<>(workman);	//��� 1
		
		for(String key : treemap.descendingKeySet()) {
			bw.write(key + "\n");
		}
		
//		List<String> list = new ArrayList<>(workman.keySet());		//��� 2
//		Collections.sort(list , Collections.reverseOrder());
//		
//		for(String key : list) {
//			bw.write(key + "\n");
//		}
		

		br.close();
		bw.flush();
		bw.close();
	}
}
