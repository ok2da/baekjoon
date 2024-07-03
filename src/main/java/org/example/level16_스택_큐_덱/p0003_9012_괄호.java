package org.example.level16_스택_큐_덱;

import java.io.*;

public class p0003_9012_괄호 {
    public static void main(String args[]) throws IOException {

        // 1, 첫 번째로 테스트 횟수 정수 "T" 가 주어진다
        // 2, 둘째줄 부터 "T"개 만큼 "(" , ")" 로 이루어진 괄호 기호 문자열이 주어진다
            // 해당 문자열이 한쌍이 되는 문자열을 VPS라고 하는데, 예로 "()" , "(())()" , "(())"은 VPS 이다.
        // 3, 해당 문자열이 VPS이면 "YES"를, 아니라면 "NO"를 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int result = 0;
            String[] PS = br.readLine().split("");

            for (int x = 0; x < PS.length; x++){
                if(PS[x].equals("(")) result++;
                if(PS[x].equals(")")) result--;

                if(result == -1) break;
            }

            if(result == 0) {
                bw.write("YES" + "\n");
            }
            if(result != 0) {
                bw.write("NO" + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
