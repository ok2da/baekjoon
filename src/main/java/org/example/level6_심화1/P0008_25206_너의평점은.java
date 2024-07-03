package org.example.level6_심화1

��ȭ1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0008_25206_���������� {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double avg = 0;
		double count = 0;
		for(int i = 0; i<20; i++) {
			String[] input = br.readLine().split(" ");
			double credit = Double.parseDouble(input[1]);
			count += credit;
			switch(input[2]) {
			case "A+":
				avg += credit * 4.5;
				break;
			case "A0":
				avg += credit * 4.0;
				break;
			case "B+":
				avg += credit * 3.5;
				break;
			case "B0":
				avg += credit * 3.0;
				break;
			case "C+":
				avg += credit * 2.5;
				break;
			case "C0":
				avg += credit * 2.0;
				break;
			case "D+":
				avg += credit * 1.5;
				break;
			case "D0":
				avg += credit * 1.0;
				break;
			case "F":
				avg += credit * 0.0;
				break;
			case "P":
				count -= credit;
				continue;
			}
		}
		
		avg = avg/count;
		System.out.println();
		bw.write(String.valueOf(avg));
		
		br.close();
		bw.flush();
		bw.close();

	}
}
