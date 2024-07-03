package org.example.level4_1차원_배열

����_�迭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P0003_10818_�ּ��ִ� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
		}
		
		br.close();
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}
}

//�������� ������� �ʴ� StringTokenizer�� ����غô�. hasMoreTokens() �� Ŭ������ �޼����̸� ���� ��ū�� ���θ� Ȯ����
//�迭�� �־ �ּ�, �ִ밪�� �����ؼ� ���Ϸ��� ������, �ش� �������� �ð��� ���� ��ٰ� �Ͽ� ã�ƺô���
//���� ���� �״�� ���Ѵٸ� ������ �ȴٰ� �Ѵ�. �׸��� Integer Ŭ�������� �����ϴ�
//�ּ�,�ִ� ���� ����� ����غô�. �����Ұ��� Integer�� �ּ�,�ִ밪�� �ƴ϶�
//Integer Ŭ������ ������ ������ �ִ밪�� 2147483647�̰�, �ּҰ��� -2147483648 ����Ѵ�. (int �� ����)
