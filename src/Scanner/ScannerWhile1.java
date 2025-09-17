package Scanner;

import java.util.Scanner;
import java.util.logging.StreamHandler;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("문자열을 입력하시오(exit입력시 종료) : ");
            String str = scanner.nextLine();
            if(str.equals("exit")){
                System.out.println("시스템을 종료합니다");
                break;
            }
            System.out.println("입력한 문자열 : "+str);
            
        }
    }
}
