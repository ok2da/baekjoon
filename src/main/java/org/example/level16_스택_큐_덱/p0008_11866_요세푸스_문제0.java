package org.example.level16_스택_큐_덱;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class p0008_11866_요세푸스_문제0 {
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 사람의 수 "N"과 양의 정수 "K"가 빈 칸을 사이에 두고 순서대로 주어진다 ( 1 <= K <= N <= 1000 )
            // 동작
            // 1번 부터 N번까지 N명의 사람이 원형으로 이어서 앉아있다고 가정한다
            // K번째 사람을 제외시킨다
            // 제외시킨 위치로 부터 다시 K번째 사람을 제외시킨다
            // 남아있는 사람이 없도록 반복한다
        // 2, "N" 과 "K"가 주어지면 요세푸스 순열을 구하여 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int con = 0;

        bw.write("<");

        for (int i = 1; i <= N; i++){
            queue.offer(i);
        }

        while(con != N) {
            for (int l = 1; l <= K-1; l++){
                queue.offer(queue.poll());
            }
            bw.write(String.valueOf(queue.poll()));
            if(con != N-1) bw.write(", ");
            con++;
        }

        bw.write(">");

        br.close();
        bw.flush();
        bw.close();
    }
}
