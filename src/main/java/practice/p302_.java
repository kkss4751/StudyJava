package practice;

import java.util.Scanner;

public class p302_ {
    public static void main(String[] args) {
       /** 문자열 length() 메소드 사용 **/
        /* String str = "IT Cookbook, Java!";
        int len;
        len = str.length();

        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열 길이 : %d \n", len);

        if (str.length() > 0) {
            System.out.println("str 변수에 값 존재");
        }else System.out.println("str 변수에 값 존재하지않음");*/

        /** 문자열 lengt 메소드 사용 2 **/
        /*Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==>");
        str = sc.nextLine();

        System.out.print("출력 문자열 ==>");
        for( int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='o')
                System.out.printf("%c", '$');
            else
                System.out.printf("%c", str.charAt(i));
        }*/
        /** 처음 또는 끝이 특정 문자열인지 확인하는 startsWith, endsWith **/
        /*Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==>");
        str = sc.nextLine();

        System.out.print("출력 문자열 ==>");

        if (!str.startsWith("("))
            System.out.printf("(");

        for (int i = 0; i < str.length(); i++){
            System.out.printf("%c", str.charAt(i));
        }

        if (!str.endsWith(")"))
            System.out.printf(")");*/

        /** 특정 문자열 위치 indexOf, lastIndexOf **/
        /*String str = "java programing, java is good";

        System.out.println("문자열 ==>" + str);

        System.out.printf("제일 먼저 나오는 java의 위치 ==> " );
        System.out.println(str.indexOf("java"));
        System.out.printf("마지막에 나오는 java의 위치 ==> ");
        System.out.println(str.lastIndexOf("java"));*/

        /** 문자열을 바꿔주는 replace(),
         * 일부 문자열 추출 substring(),
         * 문자열 분리 split()
         *
         * **/
        Scanner sc = new Scanner(System.in);
        String str, strRep, strSub, strAty[];

        System.out.print("문자열을 입력하시요 ==> ");
        str = sc.nextLine();

        strRep = str.replace(" ", "$");
        strSub = str.substring(3,8);
        strAty = str.split(" ");

        System.out.println("입력 바꾼 문자열 : " + str);
        System.out.println("바꾼 문자열 : " + strRep);
        System.out.println("일부 문자열 : "  + strSub);

        for (int i = 0; i < strAty.length; i++)
            System.out.println("분리한 문자열" + i + " ==>" + strAty[i]);







        /** 쪽지시험 **/
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        int pos = log.indexOf(" ");
        System.out.println("pos : "+ pos);

        String ip = log.substring(0, pos);
        System.out.println("ip : "+ ip);

        String[] item = log.split(" "); //
        System.out.println("ip :"+item[0]);

        /** 0525 쪽지시험 2번문제 **/

        System.out.println("time : "+ item[3]);
        //결과값이 time : [11/Jun/2012:22:12:32 나오기 때문에 "[" 제거
        String time = item[3].substring(1);

        System.out.println("time : "+ time);


    }
}
