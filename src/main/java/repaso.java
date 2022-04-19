import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.sql.SQLOutput;
import java.util.Scanner;

public class repaso {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();*/

        /*
        *if (a % 2 == 0) {
            System.out.println("짝수");
        }else  System.out.println("홀수");
        *  */
        /*
        if ((( a % 3 == 0) && (a % 5 == 0))) {
            System.out.println("3과 5의 배수");
        }else if ( a % 3 == 0) {
            System.out.println("3의 배수");
        }else if ( a % 5 == 0) {
            System.out.println("5의 배수");
        }*/

       /* int result = 0;

        for (int inicio = 1; inicio < 101; inicio++){
            if ( inicio % 3 == 0 || inicio % 5 == 0) {
                result += inicio;
            }
            System.out.println(result);
        */

/*
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for( int b = 0; b < star; b++){
            for ( int c = 0; c <= b; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/

        /*for ( int a = 1; a <= 9; a++) {
            for ( int b = 1; b <= 9; b++) {
                int result = a * b;
                System.out.println(a + "X" + b + "=" + result);
            }
        }*/
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("시작할 단을 입력하세요");
        int first = sc.nextInt();
        System.out.println("끝낼 단을 입력하세요");
        int second = sc.nextInt();

        for (int a = first; a <= second ; a++) {
            for(int b = 1; b <= 9; b++ ) {
                int result = a * b;
                System.out.println(a + "x" + b + "=" + result);
            }*/
/*
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for ( int a = 1; a <= star; a++){
            for ( int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/
/*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int hap = 0;


        for (int b = 1; b <= a; b++) {
            if ( b % 2 == 0 || b % 4 == 0) {
                hap += b;
            }
        }
        System.out.println(hap);
*/
        /*int a = 200;
        if ( a < 100) {
            System.out.println("100보다 작군요..\n");
            System.out.println(" 거짓이므로 이 문장은 안보이겠죠?\n");
        }
        System.out.println("프로그램 끝! \n");*/

/*
        int a = 200;
        if ( a < 100) {
            System.out.println("100보다 작군요..");
            System.out.println("참이면 이 문장도 보이겟죠?");
        }else {
            System.out.println("100보다 크군요..");
            System.out.println("거짓이면 이 문장도 보이겠죠?");
        }
        System.out.println("프로그램 끝!");
*/
/*        int a = 75;

        if (a > 50) {
            if (a < 100) {
                System.out.printf("50보다 크고 100보다 작군요..\n");
            } else {
                System.out.printf("와 ~ 100보다 크군요..\n");
            }
        }else {
            System.out.printf("애개 ~ 50보다 작군요.. \n");
        }
*/
        Scanner sc = new Scanner(System.in);
        int a ;

        System.out.printf("점수를 입력하세요 : ");
        a = sc.nextInt();


    }
}