package org.example.level16_스택_큐_덱;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class p0007_2164_카드2 {
    public static void main(String arg[]) throws IOException {

        // 1, 첫째 줄에 정수 "N"이 주어진다 ( 1 <= N <= 500000 )
            // 동작
            // 예) N이 4인경우, 제일 위에서 부터 1,2,3,4 순서로 놓여져 있다
            //     1을 버리면 2,3,4가 된다
            //     2를 제일 아래로 내리면 3,4,2가 된다
            //     3을 버리면 4,2이 된다
            //     4를 제일 아래로 내리면 2,4가 된다
            //     2를 버리면 4가 된다
        //  2, 동작 이후 제일 마지막에 남는 카드수를 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++){
            queue.offer(i);
        }

        while(queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }

        bw.write(String.valueOf(queue.poll()));

        br.close();
        bw.flush();
        bw.close();
    }
}
