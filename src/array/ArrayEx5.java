package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        double average = 0;

        System.out.println(" 입력받을 숫자의 개수를 입력하세요 : ");
        int count = input.nextInt();
        int[] array = new int[count];

        System.out.println(count+"개의 정수를 입력하세여 :");
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
