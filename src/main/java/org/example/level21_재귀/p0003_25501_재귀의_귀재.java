package org.example.level21_재귀;

import java.io.*;

public class p0003_25501_재귀의_귀재 {

    private static int count; // recursion()의 호출 횟수를 담을 전역 변수
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 테스트케이스 개수 "T"가 주어진다 ( 1 <= T <= 1000 )
        // 2, 둘째 줄부터 T개의 알파벳 대문자로 구성된 문자열 "S"가 주어진다 ( 1 <= |S| <= 1000 )
        // 3, 각 테스트케이스 마다, 팰린드롬을 검사하는 isPalindrome() 함수의 반환값과, recursion() 함수의 호출 횟수를 한 줄에 공백을 기준으로 출력한다
            // isPalindrome() 는 팰린드롬이면 1, 아니면 0 을 리턴하는 함수
                // recursion() 는 팰린드롬인지 판별하는 함수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String S = br.readLine();
            count = 0; // 다음 입력을 위해 0으로 초기화
            bw.write(isPalindrome(S) + "\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }

    private static String isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    private static String recursion(String s, int start, int end){
        count++;
        if(start >= end){
            return "1 " + String.valueOf(count);    // 팰린드롬이면 1 + 함수 호출 횟수인 전역 변수 리턴
        }else if(s.charAt(start) != s.charAt(end)){
            return "0 " + String.valueOf(count);    // 팰린드롬이 아니면 0 + 함수 호출 횟수인 전역 변수 리턴
        }else {
            return recursion(s, start+1, end-1);    // 재귀함수 호출
        }

    }
}
