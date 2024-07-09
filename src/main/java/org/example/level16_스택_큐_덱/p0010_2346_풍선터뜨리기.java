package org.example.level16_스택_큐_덱;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class p0010_2346_풍선터뜨리기 {
    public static void main(String args[]) throws IOException {
        // 1, 첫번 째 줄에 풍선의 개수인 자연수 "N"이 주어진다 ( 1 <= N <= 1000 )
        // 2, 다음 줄에는 차례로 풍선 안에 들어있는 종이에 적힌 수가 주어진다 ( 0은 없다 )
            // 1 ~ N개 까지 원형으로 풍선이 배치되어 있고 해당 풍선 안에는 종이에 좌 우로 이동할 수가 적힌 종이가 들어있다
            // 처음 에는 1번 풍선을 터트리고, 그 안에있는 수가 양수면 그만큼 오른쪽으로, 음수면 그만큼 왼쪽으로 이동한다
            // 해당 위치 에서 해당 풍선을 터뜨리고 반복하고, 터진 풍선의 위치는 빼고 이동한다
        // 3, 터진 풍선의 위치를 차례대로 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int X = 0;

        for(int i = 2; i <= N; i++){
            deque.add(i);
        }

        // 첫번째는 무조건 1부터 이므로 미리 처리
        X = Integer.parseInt(input[0]);
        bw.write("1");

        while(!deque.isEmpty()){
            if(X >= 1){ // 양수
                for(int j = 0; j < X; j++){
                    deque.addLast(deque.removeFirst());
                }
                X = Integer.parseInt(input[deque.getLast()-1]);
                bw.write(" " + deque.removeLast());
            }else { // 음수
                for(int k = -1; k >= X; k--){
                    deque.addFirst(deque.removeLast());
                }
                X = Integer.parseInt(input[deque.getFirst()-1]);
                bw.write(" " + deque.removeFirst());
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
