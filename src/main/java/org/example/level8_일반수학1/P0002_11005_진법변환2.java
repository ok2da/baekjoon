package org.example.level8_일반수학1

�Ϲݼ���1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0002_11005_������ȯ2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		int N = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);	
		
		StringBuilder sb = new StringBuilder();
		
		while(N > 0) {
			char c = 0;
			int r = N%B;
			if( r < 10 ) {
				c = (char) (r + '0');
			}else {
				c = (char) (r - 10 + 'A');
			}
			sb.append(c);
			N /= B;
		}
		
		bw.write(sb.reverse().toString());
		br.close();
		bw.flush();
		bw.close();

	}

}

//�� �� ������ 1�ð� �Ѱ� ���Ű��� �и� �ٸ� �������� ��ȯ�� �´°Ű����� ��� Ʋ�ȴٰ� ���ͼ� ��� ������ Ȯ���߿�
//�ƽ�Ű�ڵ� ���� ������ ���� �򰥷� �װڴµ� �ٸ� ����� �ڵ带 ���� �����غ��� ������ ������ �ѵ� ����ü ���� ������ �ʹٰ�
//2������ �����ΰ� ã�Ҵ� 2�� 2������ 01���� ���Դ� �� �� 01���� 10�ƴѰ� �ʹٰ� ã�ƺ���
//���� ��ȯ������ �Ϲ������� �����ʼ����� ����� �ؾ� �ùٸ��� ���´ٰ� �ؼ� �������� �ٲپ����� �¾Ҵ� 
//�׷��� ������� ��Ʈ�������� �豸��... �� ��ƴ�!!!
