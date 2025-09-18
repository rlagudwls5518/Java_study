package Scanner;


import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        while(true){
            int total = 0;
            System.out.println("1 : 상품 입력, 2: 결제, 3: 프로그램 종료");
            int num = scanner.nextInt();
            scanner.nextLine();// 중요!!!!
            switch (num){
                case 1:
                    System.out.print("상품명을 입력하세요: ");
                    String product = scanner.nextLine();

                    System.out.print("상품 가격을 입력하세요: ");
                    int price = scanner.nextInt();

                    System.out.print("구매수량을 입력하세요: ");
                    int quantity = scanner.nextInt();

                    System.out.println("상품명: "+ product+" 가격: "+price+" 수량: "+quantity+" 합계: "+price * quantity );

                    if(quantity>1)total+=price * quantity;

                    total+=price;
                    break;
                case 2:
                    System.out.println("총 비용 : "+total);
                    break;

                case 3:
                    System.out.println("프로그램을 종료합니다");
                    break;
            }
            if(num == 3)break;
        }


    }

}
