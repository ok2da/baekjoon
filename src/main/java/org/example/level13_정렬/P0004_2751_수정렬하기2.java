package org.example.level13_정렬

����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class P0004_2751_�������ϱ�2 {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		//int[] num = new int[N];							//���1
		ArrayList<Integer> num = new ArrayList<>();			//���2
				
		while(N > 0) {
			//num[N-1] = Integer.valueOf(br.readLine());	//���1
			num.add(Integer.valueOf(br.readLine()));		//���2
			N--;
		}
		
		//Arrays.sort(num);									//���1
		Collections.sort(num);								//���2
		
		for(int n : num) {
			bw.write(String.valueOf(n) + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();

	}
}
