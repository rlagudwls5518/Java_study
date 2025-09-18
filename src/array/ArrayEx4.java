package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        double average = 0;

        System.out.println("5개의 정수를 입력하세여 :");
        for(int i=0; i< array.length; i++){
            array[i] = input.nextInt();
        }

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        average = sum / array.length;

        System.out.println("입력한 정수의 합계 :"+sum);
        System.out.println("입력한 정수의 평균 :"+average);
    }
}
