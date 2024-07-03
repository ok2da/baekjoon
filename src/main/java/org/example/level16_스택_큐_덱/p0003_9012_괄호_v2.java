package org.example.level16_스택_큐_덱;

import java.io.*;
import java.util.Stack;

public class p0003_9012_괄호_v2 {
    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            String PS = br.readLine();
            bw.write(Solution(PS, stack) + "\n");
            stack.clear();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static String Solution(String PS, Stack<Character> stack){

        for (int x = 0; x < PS.length(); x++){

            char c = PS.charAt(x);

            if(c == '(') {
                stack.push(PS.charAt(x));
            }else {
                if(stack.isEmpty()) {
                    return "NO";
                }else {
                    stack.pop();
                }
            }

        }
        return stack.isEmpty() ? "YES" : "NO";
    }

}
