package org.example.level1_입출력과_사칙연산

public class P0009_10430_������ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}

//��ȣ�� ��ȣ ����