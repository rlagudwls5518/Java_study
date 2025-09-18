package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] score = new int[4][3];

        for (int i =0; i<score.length; i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요");
            System.out.print("국어 점수 :");
            score[i][0] = input.nextInt();
            System.out.print("영어 점수 :");
            score[i][1] = input.nextInt();
            System.out.print("수학 점수 :");
            score[i][2] = input.nextInt();
            System.out.println();
        }
        for(int i =0; i<score.length; i++){
            int sum =0;
            for(int j=0; j<3; j++){
                sum+=score[i][j];
            }
            double average = (double)sum/3;
            System.out.println((i+1)+"번 학생의 총점은: "+sum+", 평균: "+average);
        }
    }
}
