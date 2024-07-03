package org.example.level11_시간복잡도

�ð����⵵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P0006_24313_�˰���_����_������_ǥ��_1 {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a1 = Integer.valueOf(st.nextToken());
		int a2 = Integer.valueOf(st.nextToken());
		
		int c = Integer.valueOf(br.readLine());
		
		int n = Integer.valueOf(br.readLine());
		
		if((a1*n)+a2 <= c*n) {
			bw.write("1");
		}else {
			bw.write("0");
		}
		
		bw.flush();
		br.close();
		bw.close();

	}
}
