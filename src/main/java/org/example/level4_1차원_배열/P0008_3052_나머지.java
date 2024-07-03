package org.example.level4_1차원_배열

����_�迭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class P0008_3052_������ {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Integer arr[] = new Integer[10];
		
		for(int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[i] = a%42;		
		}
		
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		TreeSet<Integer> sort = new TreeSet<>(set);
		
		
		bw.write(String.valueOf(sort.size()));
		
		br.close();
		bw.flush();
		bw.close();
	}
}
