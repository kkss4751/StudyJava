import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int a = sc.nextInt();

        int[] arr = new int[a];

        for(int i = 0; i<a; i++){
            arr[i] = sc.nextInt();

            sum += arr[i];
        }
        average = sum / a;
        System.out.println("총점은? :" + sum);
        System.out.println("평균점수는? :" + average);*/

        /*int[] score = {26,20,44,54,30,40,98,37};

        int min = score[0];
        int max = score[0];

        for(int i = 0; i < score.length; i++){
            if(score[i] > max) {
                max = score [i];
            }else if (score[i] < min){
                min = score[i];
            }
        }
        System.out.println("최대값은 :" + max);
        System.out.println("최소값은 :" + min);*/

        //버블정렬 알고리즘 정보처리 기사

     /*   int[] arr = { 1, 3, 4, 5, 4, 3, 6, 7, 8, 9, 6, 2, 1};

        for (int i = 0; i < arr.length-1; i++) {
            for ( int j = 0; j < arr.length - 1 -i; j++) {
                if ( arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(i+"번쨰 회전 결과는? :");
            for ( int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }*/

        int[] arr = {1, 1, 3, 4, 5, 5, 4, 3, 4};
        int[] result = new int[9];

        for(int i = 0; i < arr.length; i++){
            result [ arr[i]]++;
        }
        for(int i = 0; i < result.length; i++){
            System.out.println(i+"의 개수는 ? :" + result[i]);
        }
    }
}
