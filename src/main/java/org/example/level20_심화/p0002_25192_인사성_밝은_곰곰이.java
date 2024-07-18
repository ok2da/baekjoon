package org.example.level20_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class p0002_25192_인사성_밝은_곰곰이 {
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에는 채팅방의 기록 수를 나타내는 정수 "N"이 주어진다 ( 1 <= N <= 100000 )
        // 2, 두번째 줄부터 N개의 줄만큼 새로운 사람이 입장을 알리는 "ENTER", 그 외 채팅을 입력한 유저의 닉네임을 나타낸다 ( 1 <= 문자열 길이 <= 20 )
            // 두번째 줄의 첫번째는 무조건 문자열 "ENTER"가 주어진다
        // 3, "ENTER" 이후 채팅을 입력하여 곰곰티콘을 사용한 횟수를 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        int result = 0;

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            if(str.equals("ENTER")) {
                hashMap.clear();
            }else {
                if(!hashMap.containsKey(str)) {
                    hashMap.put(str,1);
                    result++;
                }
            }
        }

        br.close();
        System.out.println(result);

    }
}
