package org.example.level16_스택_큐_덱;

import java.io.*;
import java.util.Stack;

public class p0001_28278_스택2 {
    public static void main(String args[]) throws IOException {

        // 1, 명령의 수 "N" 입력
        // 2, 둘째 줄부터 N개만큼 명령이 하나씩 주어짐
        //  ==명령==
        //      1: 명령으로 주어진 정수 "X"를 스택에 넣음 ( 1 <= X <= 100000 )
        //      2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
        //      3: 스택에 들어있는 정수의 개수를 출력한다.
        //      4: 스택이 비어있으면 1, 아니면 0을 출력한다.
        //      5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            int cmd = 0;
            int X = 0;

            if(input.length == 1){
                cmd = Integer.parseInt(input[0]);
            }else {
                cmd = Integer.parseInt(input[0]);
                X = Integer.parseInt(input[1]);
            }

            switch (cmd) {
                case 1:
                    stack.push(X);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        bw.write("-1" + "\n");
                    }else {
                        bw.write(stack.pop() + "\n");
                    }
                    break;
                case 3:
                    bw.write(stack.size() + "\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        bw.write("1" + "\n");
                    }else {
                        bw.write("0" + "\n");
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()) {
                        bw.write(stack.peek() + "\n");
                    }else {
                        bw.write("-1" + "\n");
                    }
                    break;
            }

        }

        br.close();
        bw.flush();
        bw.close();
    }

}
