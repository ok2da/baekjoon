package org.example.level13_정렬

����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P0010_10814_���̼����� {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.valueOf(br.readLine());
		String[][] member = new String[N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			member[i][0] = String.valueOf(st.nextToken());		//����
			member[i][1] = st.nextToken();						//�̸�
		}
		
		Arrays.sort(member, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.valueOf(o1[0]) - Integer.valueOf(o2[0]);
			};
		});
		
		for(int j = 0; j < N; j++) {
			bw.write(member[j][0] + " " + member[j][1]);
			bw.write("\n");
		}

		
		bw.flush();
		br.close();
		bw.close();

	}

}

