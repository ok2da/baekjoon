package org.example.level12_브루트포스

���Ʈ����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P0004_1018_ü���Ǵٽ�ĥ�ϱ� {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		

		int N = Integer.valueOf(st.nextToken());	//���α���
		int M = Integer.valueOf(st.nextToken());	//���α���
		int[][] ChessBoard = new int[N][M];			//M*N ü����
		int result = Integer.MAX_VALUE;				//�����
		int tmp = 0;								//�ӽð�
		
		
		for(int i = 0; i < N; i++) {				//������
			String[] input = br.readLine().split("");
			for(int j = 0; j < M; j++) {
				if(input[j].equals("W")) {			// ���=0 , ������=1
					ChessBoard[i][j] = 0;
				}else {
					ChessBoard[i][j] = 1;
				}
			}
		}
		
		for(int i = 0; i < N-7; i++) {				//8*8 �ڸ�Ƚ��
			for(int j = 0; j < M-7; j++) {
				tmp = find(ChessBoard,i,j);			//���󺯰��
				if(tmp < result) {
					result = tmp;
				}
			}
		}
		
		bw.write(String.valueOf(result));

		bw.flush();
		br.close();
		bw.close();

	}

	private static int find(int[][] chessBoard, int x, int y) {
		int result = 0;								//�����
		int col = x+8;								//�����̵�����
		int row = y+8;								//�����̵�����
		int count = 0;								//���󺯰�Ƚ��
		int max = 64;								//8*8 �ִ밪
		int color = chessBoard[x][y];				//ó������
		
		for(int i = x; i < col; i++) {				//���� ����~8��
			for(int j = y; j < row; j++) {			//���� ����~8��
				if(chessBoard[i][j] != color) {
					count++;
				}
				if(color == 1) {
					color = 0;
				}else {
					color = 1;
				}
			}
			if(color == 1) {
				color = 0;
			}else {
				color = 1;
			}
		}
		
		if(count < max-count) {
			result = count;
		}else {
			result = max - count;
		}

		return result;
	}
}
