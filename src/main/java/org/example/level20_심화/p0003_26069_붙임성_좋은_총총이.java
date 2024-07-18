package org.example.level20_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class p0003_26069_붙임성_좋은_총총이 {
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 사람들이 만난 기록의 수 "N" 이 주어진다 ( 1 <= N <= 1000 )
        // 2, 둘째 줄부터 N번 만큼 사람들이 만난 기록인 i줄 에는 Ai와 Bi가 공백을 사이에 두고 주어진다 ( Ai, Bi는 숫자 or 영문대/소문자로 이루어진 최대 20자의 문자열 )
            // 무지개 댄스를 추는 총총이의 이름은 "ChongChong" 이며 기록상 1회 주어진다
            // 동명이인은 없으며, 사람의 이름은 대/소문자를 구분한다 ( ChongChong != chongchong )
        // 3, 마지막 기록 이후 무지개 댄스를 추는 사람의 수를 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        HashSet<String> rainbow_dance = new HashSet<>();
        rainbow_dance.add("ChongChong");

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String human1 = st.nextToken();
            String human2 = st.nextToken();

            if(rainbow_dance.contains(human1) || rainbow_dance.contains(human2)){
                rainbow_dance.add(human1);
                rainbow_dance.add(human2);
            }
        }

        br.close();
        System.out.println(rainbow_dance.size());
    }
}
