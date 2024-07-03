package org.example.level10_기하_직사각형과_삼각형

����_���簢����_�ﰢ��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0005_10101_�ﰢ���ܿ�� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.valueOf(br.readLine());
		int B = Integer.valueOf(br.readLine());
		int C = Integer.valueOf(br.readLine());
		
		if(A == 60 && B == 60 && C == 60) { 
			bw.write("Equilateral");
		}else if(A+B+C == 180 && (A==B || B==C || C==A)) { 
			bw.write("Isosceles");
		}else if(A+B+C == 180 && A!=B && B!=C && C!=A) { 
			bw.write("Scalene");
		}else if(A+B+C != 180) {
			bw.write("Error");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
