package array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("5개의 정수를 입력하세여 :");
        for(int i=0; i<5; i++){
            array[i] = input.nextInt();
        }
        System.out.println("출력");
        for(int i =0; i< array.length; i++){
            if(i == array.length-1){
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i]+',');
        }
    }
}
