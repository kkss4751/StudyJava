import javax.management.remote.rmi._RMIConnection_Stub;
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

        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for ( int a = 1; a <= star; a++){
            for ( int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

