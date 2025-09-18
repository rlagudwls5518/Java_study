package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int min = 100000;


        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = input.nextInt();
        int[] array = new int[count];

        System.out.println(count+"개의 정수를 입력하세여 :");
        for(int i=0; i< array.length; i++){
            array[i] = input.nextInt();
        }

        for(int i = 0; i < array.length; i++){
            if(max<array[i]) max = array[i];
            if(min>array[i]) min = array[i];
        }

        System.out.println("가장 작은 정수 : "+min);
        System.out.println("가장 큰 정수 : "+max);
    }
}
