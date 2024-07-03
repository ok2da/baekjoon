package org.example.level9_약수_배수와_소수

���_�����_�Ҽ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0001_5086_����;�� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] input = br.readLine().split(" ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			String R = "";
			
			if(A == 0 && B == 0) {				//0�϶�
				break;
			}else if(A <= B && B%A == 0) {		//��� �׽�Ʈ
				R = "factor";
			}else if(A >= B && A%B == 0){		//��� �׽�Ʈ
				R = "multiple";
			}else {
				R = "neither";
			}
			
			bw.write(R + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
