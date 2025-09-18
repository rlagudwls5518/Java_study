package array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("5개의 정수를 입력하세여 :");
        for(int i=0; i< array.length; i++){
            array[i] = input.nextInt();
        }
        System.out.println("출력");
        for(int i = array.length-1; i >=0; i--){
            if(i == 0){
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i]+","); // 출력할때 문자와 문자열 조심
        }
    }
}
