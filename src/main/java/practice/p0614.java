package practice;

import java.util.Scanner;

public class p0614 {
    public static void main(String[] args) {





        /** indexOf(), lastIndexOf() ---------- 특정 문자열의 위치를 찾는 메소드
         *
         * 첫번째 나오는 java의 위치와 마지막에 나오는 java 의 위치 **/
 /*       String str = "java시간 java는 너무 재미져!";
        System.out.println("문자열 : " + str);

        System.out.print("제일 처음 나오는 java의 위치");
        System.out.println(str.indexOf("java"));
        System.out.print("제일 끝에 나오는  java의 위치");
        System.out.println(str.lastIndexOf("java"));*/


        /** startsWith(), endsWith() 메소드 ---------- 문자열 처음 또는 끝이 특정 문자열인지 확인하는 메소드
         *
         * 입력받은 문자열 처음 시작과 끝을 '()' 로 감싸주기 **/
 /*       Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("문자 입력 : ");
        str= sc.nextLine();

        if (!str.startsWith("("))
            System.out.printf("(");

        for (int i = 0; i < str.length(); i++)
            System.out.printf("%c",str.charAt(i));

        if (!str.endsWith(")"))
            System.out.printf(")");*/


        /** charAt() 문자열 위치 메소드 ----------- 문자열 바꾸기
         *
         * 입력받은 문자열 o를 $로 바꾸기 **/
/*        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자 입력==> ");
        str=sc.nextLine();

        System.out.print("출력 문자열 ==> ");
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'o')
                System.out.printf("%c",'$');
            else System.out.printf("%c",str.charAt(i));
        }*/


        /** length() 메소드  -------------- 문자열 길이 출력하기
         *
         * it cookbook 의 문자열 출력하기 **/
 /*       String str = "it cookbook";
        int len;
        len = str.length();
        System.out.printf("문자열 : %s\n", str);
        System.out.printf("문자열 길이 : %d \n", len);*/
    }
}
