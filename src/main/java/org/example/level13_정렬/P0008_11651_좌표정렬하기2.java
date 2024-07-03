package org.example.level13_정렬

����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P0008_11651_��ǥ�����ϱ�2 {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		int[][] xy = new int[N][2];

		for(int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			xy[i][0] = Integer.valueOf(input[0]);
			xy[i][1] = Integer.valueOf(input[1]);
		}

		Arrays.sort(xy , (e1,e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			}else {
				return e1[1] - e2[1];
			}
		});

		
		for(int j = 0; j < N; j++) {
			bw.write(String.valueOf(xy[j][0]) + " " + String.valueOf(xy[j][1]));
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();

	}
}
