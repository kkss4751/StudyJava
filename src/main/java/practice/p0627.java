package practice;

import java.util.Scanner;

public class p0627 {
    public static void main(String[] args) {
        //w자바의 정석

       /* int a = 10, b = 20;
        int tmp;

        tmp = a;
        a = b;
        b = a;*/

        //자바의 정석 형변환

        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 변환

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d\n", num);

        System.out.println(input + 1); //입력받은 숫자, 문자열임
        System.out.println(num + 1); // 숫자로 형변환
    }
}
