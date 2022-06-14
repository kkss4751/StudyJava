import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.sql.SQLOutput;
import java.util.*;

public class repaso {
    public static void main(String[] args) {

        /** 자바 입문 **/
        System.out.println("---------자바 입문----------");
        /*
        System.out.println("Hello, JAVA!");
        System.out.println("안녕, 자바!");

        System.out.println(37);
        System.out.println(1+2);
        System.out.println(4.3 + 0.2);

        System.out.println("37");
        System.out.println("1"+"2");
        System.out.println("4.3" + "0.2");

        System.out.println("나는 문자열");
        System.out.println('나');

        System.out.println("안녕 나는 \"자바\"야."); //기호를 표현할때는 백슬레시 이스케이프

        System.out.println("치킨은 살 안 쪄요.\n 살은 내가 쪄요.."); // \n 줄바꿈

        //주석을 배워봅시다 라는 문장을 출력합니다.
        System.out.println("주석을 배워봅시다");
        */

        /* 이것은 여러 줄의 주석입니다.
        두번쨰 줄 입니다
        주석은 프로그램에 영향을 미치지 않습니다
        */

        /*
        System.out.println("위에는 여러줄의 주석이 있어요.");

        // 자바 입문 기본 문제
        System.out.println("길동이의 생일은 6월16일");
        System.out.println(6+16);
        */

        /*Scanner birthday = new Scanner(System.in);
        System.out.println("태어난 달을 입력하세요");
        int a = birthday.nextInt();
        System.out.println("태어난 날을 입력하세요");
        int b = birthday.nextInt();

        int result = a+b;
        System.out.println("당신의 생일은" + a + "월" + b + "일 입니다.");
        System.out.println("당신의 달과 날을 더한 값은 : " + result);*/


        /** 변수 **/
        System.out.println("----------- 변수 ------------");
        /*
        int number; // 변수명 number

        number = 3; // 지금부터 넘버는 3입니다.
        number = 10; // 지금부터 넘버는 10 입니다.

        System.out.println(number);

        System.out.println(100 * 0.15);
        System.out.println(300 * 0.15);
        System.out.println(1000 * 0.15);
        System.out.println(10000 * 0.15);

        System.out.println(100 * 0.13);
        System.out.println(300 * 0.13);
        System.out.println(1000 * 0.13);
        System.out.println(10000 * 0.13);

        int ratio = 15; // 적립금만 바꾸면 됨

        System.out.println(100 * ratio / 100.0);
        System.out.println(300 * ratio / 100.0);
        System.out.println(1000 * ratio / 100.0);
        System.out.println(10000 * ratio / 100.0);*/

        System.out.println("----------- 연산자 ------------");
/*
        System.out.println(2+3);
        System.out.println(5-1);
        System.out.println(6*3);
        System.out.println(7/2); // 정수 나누기 정수 = 정수
        System.out.println(7%2);

        // 산술 연산자 우선순위
        System.out.println((2-4)/2);

        // 대입 연산자
        int number1 = 5;
        number1 = (int) 6.3; //  실수를 정 수로 형 변환
        System.out.println(number1);

        System.out.println(1+1.2);
        System.out.println(7/2);
        System.out.println(7/2.0);   // 정수와 실수 = 실수

        //비교 연산자 true, false 로 출력됨
        System.out.println(2<3);
        System.out.println(2<=3);
        System.out.println(2>3);
        System.out.println(3>=3);
        System.out.println(5==3);
        System.out.println(5==5);
        System.out.println(5!=5);
        System.out.println(3!=5);
        System.out.println("-------------");

        int x = 5;
        int y = 2;

        System.out.println(x<y);
        System.out.println(y>x);
        System.out.println(y<=x);
        System.out.println(y*y);
        System.out.println(x*y);
        System.out.println(y%x);
        System.out.println(y%2);
        System.out.println(x==5);
        System.out.println(2!=y);

        int egg = 277;
        int pan = 30;

        int totalPan = egg / pan;
        int nameji = egg % pan;


        System.out.println("판은 총 " + totalPan + "판 나오고");
        System.out.println("남는 달걀의 개수는 " + nameji + "입니다");
*/
        System.out.println("----------- 데이터 형태, 자료형 ------------");
/*
        float floatNumber = 1.2f;  // 소수점이 포함된 숫자를 썼을대 자바는 기본적으로 double로 인식하기때문에 float 을 쓸 때에는 숫자 뒤에 f를 붙여줘야함
        double doubleNumber = 4.3;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        float floatSum = 0.001f + 0.001f + 0.0001f;
        System.out.println(floatSum); //세밀하게 계산할 떄는 정수로 계산후 나누기

        // 문자형
        char character = '오';
        System.out.println(character);

        //문자열
        String chicken = "치킨은 살 안쪄요.";
        String me = "살은 내가 쪄요요";

        System.out.println(chicken);
        System.out.println(me);

        // 문자열 연결하기
        String chickenAndMe = chicken + me;
        System.out.println(chickenAndMe);

        // 문자열의 글자 수 세기 .length();
        System.out.println(me.length()); // me 문자의 문자 길이 .length();
        int length = me.length(); // me.length 를 정수형 length에 대입하고
        System.out.println(length); // int length 불러오기

        // 문자열 일부 바꾸기 .replaceAll();
        System.out.println(me.replaceAll("내가", "치킨이")); // 내가를 치킨으로 바꾸기

        String replaced = me.replaceAll("내가", "치킨이");
        System.out.println(replaced);

        // 문자열 자르기 substring (시작위치와 끝위치 지정하기)
        String birthday = "1999/01/12"; //숫자는 0부터 셈
        String year = birthday.substring(0,4); //시작위치 : 0 , 끝위치 : 4
        String day = birthday.substring(8); // 시작위치 8
        System.out.println(year);
        System.out.println(day);

        //논리형 Boolean
        boolean trueValue = true;
        boolean falseValue = false;
        boolean question = 5>3;

        System.out.println(trueValue);
        System.out.println(falseValue);
        System.out.println(question);

        // 래퍼타입  ??
        Integer integerNumber = 3;
        Long longNumber = 3L;
        Float floatNumber1 = 3.0f;
        Double doublenUumber = 3.0d;
        Boolean booleanValue = true;

        Scanner scan = new Scanner(System.in);
        System.out.printf("이름 : ");
        String name = scan.nextLine();
        System.out.printf("나이 : ");
        int age = scan.nextInt();
        System.out.printf("사는 곳 : ");
        String direccion = scan.nextLine();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age + "세");
        System.out.println("사는 곳 : "+ direccion);
 */
        System.out.println("--------------사용자 입력과 예외 처리------------------");
        // import java util. ~~  === Scanner 라는 소스코드를 사용하겠다
        Scanner scanner = new Scanner(System.in); // system.in 표준 입력장치
        //String input = scanner.nextLine();
        //System.out.println(input);

        String chicken = scanner.next();
        String chicken2 = scanner.next();
        String chicken3 = scanner.next();
        String chicken4 = scanner.next();

        //치킨은 살 안쪄요
        System.out.println(chicken);
        System.out.println(chicken2);
        System.out.println(chicken3);
        System.out.println(chicken4);



        System.out.println("_------------------------------------------");

      /* List<String> list = new ArrayList<>();
        list.add("이정훈");
        list.add("이정");
        list.add("이훈");
        list.add("정훈");

        int ListSize = list.size();
        for (String name : list) {
            System.out.println("이름 : " + name);
        }*/

       /* for(int i=1; i<=5; i++) {
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
        }*/
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