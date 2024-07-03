package org.example.level1_입출력과_사칙연산

public class P0010_2588_���� {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();
        int result = a * b;
        while(b > 0) {
        	int number = b % 10;     		
    		System.out.println(a * number);
        	b = b / 10;
        }
        System.out.println(result);
        
    }
}

// 10���� ������ ����(%) �� �ϸ� ���� �ڸ��� ���� ����
