package org.example.level16_스택_큐_덱;

import java.io.*;
import java.util.Stack;

public class p0004_4949_균형잡힌_세상 {
    public static void main(String args[]) throws IOException {

        // 1, 각 줄마다 "(", "[" 가 주어지며 마찬가지로 짝을 이루는 ")", "]" 가 문자열에 주어진다
            // 모든 괄호의 짝은 1:1 매칭만 가능
        // 2, 입력의 종료 조건으로 맨 마지막 "." 온점하나가 들어온다
            // 괄호 없이 "." 만 주어져도 균형 문자열로 간주한다
        // 3, 균형잡힌 문자열일 경우 "yes"를, 아닐경우 "no"를 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();
        String input = br.readLine();

        while(!input.equals(".")){

            bw.write(Solution(input, stack) + "\n");
            stack.clear();

            input = br.readLine();
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static String Solution(String input, Stack<Character> stack) {

        // ) 이나, ] 가 먼저 올경우,
        // ( ] , [ ) , (() 같이 짝이 맞지 않을 경우
        // " . " 일 경우

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c == '('){
                stack.push(c);
            }else if (c == ')'){
                if(stack.isEmpty()) return "no";
                if(stack.peek() == '[') return "no";
                stack.pop();
            }

            if(c == '['){
                stack.push(c);
            }else if (c == ']'){
                if(stack.isEmpty()) return "no";
                if(stack.peek() == '(') return "no";
                stack.pop();
            }

        }

        return stack.isEmpty() ? "yes" : "no";
    }
}
