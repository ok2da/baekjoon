package org.example.level20_심화;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class p0005_20920_영단어_암기는_괴로워 {
    public static <List> void main(String args[]) throws IOException {
        // 1, 첫째 줄에는 단어개수 "N"과 단어 길이 "M"이 공백을 기준으로 주어진다 ( 1 <= N <= 100000 , 1 <= M <= 10 )
        // 2, 둘째 줄 부터 N번 단어를 입력받는다 ( 영문 소문자 , 길이는 10을 넘지 않음 , 1개 이상 )
        // 3, 조건에 맞는 단어를 순서대로 출력한다
            // 1. 자주 나오는 단어일수록 앞에 배치한다.
            // 2. 해당 단어의 길이가 길수록 앞에 배치한다.
            // 3. 알파벳 사전 순으로 앞에 있는 단어일 수록 앞에 배치한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        // 자주 나오는 단어 찾기
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            if(str.length() >= M){
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }


        ArrayList<String> list = new ArrayList<>(map.keySet());

        list.sort(((o1, o2) -> {
            int c1 = map.get(o1);
            int c2 = map.get(o2);

            if(c1 == c2){
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o2.length() - o1.length();
            }
            return c2 - c1;
        }));

        for(int l = 0; l < list.size(); l++) {
            bw.write(list.get(l) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
