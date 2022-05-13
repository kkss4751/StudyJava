import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.sql.SQLOutput;
import java.util.*;

public class repaso {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" "); //공백
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); //별반
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* "); //나머지 별반틈.
            }
            System.out.println();
        }
        /*List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("고길동");
        list.add("임꺽정");

        int listsize = list.size();

        for ( int i = 0; i < listsize; i++){
            System.out.println("이름 : " + list.get(i));
        }
        //foreach문으로 조회/
        for ( String name : list) {
            System.out.println("이름 : " + name);
        }

        //람다식
        list.forEach(name -> System.out.println("name : "+ name));

        //Iterator
        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String name = it.next();
            System.out.println("이름 : "+ name);
        }*/

        /*int aa[] = {10,20,30,40,50};
        int count,size;

        count = aa.length;
        size = count*Integer.BYTES;

        System.out.printf("배열 aa[]요소의 개수는 %d개이고 \n", count);
        System.out.printf("배열 aa[]요소의 크기는 %d 바이트 입니다\n", size);*/

        /*Scanner s = new Scanner(System.in);
        int [] aa = new int[4];
        int hap = 0, i;

        for (i=0;i<=3;i++){
            System.out.printf("%d번째 숫자를 입력하세요\n", i+1);
            aa[i] = s.nextInt();
        }
        hap= aa[0] + aa[1] + aa[2] + aa[3];
        System.out.printf("합계 ==> %d \n",hap);*/

        /*int i,k;

        for (i = 2; i <= 9; i++){
            System.out.printf( " #제 %d 단 #" ,i );
        }
        System.out.printf("\n\n");

        for (i = 1; i <= 9; i++){
            for (k = 2; k <= 9; k++){
                System.out.printf("%2d x %2d = %2d", k, i, k*i);
            }
            System.out.printf("\n");
        }*/

       /* for(int i = 1; i < 5; i++){
            for(int j = 4; j>0; j--){
                if (i<j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }*/

       /* Map<String, String> pmap = new HashMap<>();

        pmap.put("name", "이정훈");
        pmap.put("nikname", "이정훈");
        pmap.put("email", "ddd@nav");
        pmap.put("dept", "디콘");
        pmap.put("dept", "데분");

        System.out.println("이름 :" + pmap.get("name"));
        System.out.println("닉네임 :" + pmap.get("nickname"));
        System.out.println("이메일 :" + pmap.get("email"));
        System.out.println("학과 :" + pmap.get("dept"));
        System.out.println("텍스트출력 :" + pmap.get("오타"));
*/

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
/*
        Scanner sc = new Scanner(System.in);
        int a ;

        System.out.printf("점수를 입력하세요 : ");
        a = sc.nextInt();

        if ( a >= 90) {
            System.out.printf("A");
        }else if ( a >= 80) {
            System.out.printf("B");
        }else if ( a >= 70) {
            System.out.println("C");
        }else if ( a >= 60) {
            System.out.printf("D");
        }else System.out.printf("F");
        System.out.printf("학점입니다. \n");
*/
/*        Scanner sc = new Scanner(System.in);
        int a;

        System.out.printf("1~4중에 선택하세요 : ");
        a = sc.nextInt();

        if ( a == 1 ) {
            System.out.printf("1을 선택했다");
        } else if ( a == 2) {
            System.out.printf("2를 선택했다");
        } else if ( a == 3) {
            System.out.printf("3을 선택했다.");
        } else if ( a == 4) {
            System.out.printf("4를 선택했다.");
        } else System.out.printf("이상한걸 선택했다.");*/
/*
        Scanner sc = new Scanner(System.in);

        System.out.printf("첫번째 수를 입력하세요");
        int a = sc.nextInt();
        System.out.printf("계산할 연산자를 입력하세요");
        int b = sc.nextInt();
        System.out.printf("두번째 수를 입력하세요");
        int c = sc.nextInt();

        int result;
        if ( b == '+') {
            result = a + c;
            System.out.println(result);
        }else if ( b == '-') {
            result = a - c;
            System.out.println(result);
        }else if ( b == '*') {
            result = a * c;
            System.out.println(result);
        }else if ( b == '/') {
            result = a / c;
            System.out.println(result);
        }else System.out.println(" 잘못 입력");
*/
        /*int i;
        for ( i = 0; i < 5 ; i++) {
            System.out.printf("안녕하세요? 빙글빙글 for 문을 공부중입니다. ^^\n");
        }*/
/*        int i;
        for ( i = 0; i < 3; i++) {
            System.out.printf("안녕하세요 ? \n");
            System.out.printf("##또 안녕하세요?## \n");
        }
        System.out.printf("\n\n");
        for (i = 0; i < 3; i++)
            System.out.printf("안녕하세요 \n");
            System.out.printf("##또 안녕하세요?##\n");
*/
/*        int hap;

        hap = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.printf("1에서 10 까지의 합 : %d \n", hap);*/
        /*int hap = 0;
        int i;

        for ( i = 1; i <= 10; i++) {
            hap += i;
        }
        System.out.printf("1에서 10까지의 합은 : %d \n", hap);*/

        /*for ( int i = 2; i < 10; i++) {
            for ( int b = 1; b < 10; b++) {
                System.out.printf("%d x %d = %d \n",i,b, i*b);
            }
            System.out.println();
        }*/

       /* Scanner s = new Scanner(System.in);
        System.out.printf("출력할 구구단 입력하시오 ==>");
        int dan = s.nextInt();

        for( int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", dan, i, dan*i);
        }*/
        /*int i,k;

        for(i = 0; i < 3; i++) {
            for (k = 0; k < 2; k++){
                System.out.printf("중첩for문입니다.(i값:%d, k값:%d)\n",i,k);
            }
        }*/
        /*int i,dan;
        for( dan = 2; dan <= 9; dan++){
            System.out.printf("## %d단 ##\n",dan);
            for (i = 2; i <= 9; i++){
                System.out.printf("%d x %d = %d\n", dan, i, dan*i);
            }
        }*/
       /* int i,k;
        for ( i = 1; i <= 9; i++) {
            for (k = 2; k <= 9; k++) {
                System.out.printf("%3dx%d = %2d", i, k, i*k);
            }
            System.out.printf("\n");
        }*/
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int line = 1; line <= a; line++) {
            for ( int s = 1; s <= line; s++) {
                System.out.print("*");
            }
            System.out.println("");
        }*/
       /* int[] age = new int[4];
        age[0] = new Int*/

    }
}