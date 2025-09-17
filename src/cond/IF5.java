package cond;

public class IF5 {
    //아이템 가격이 10000원 이상일때, 1000원 할인
    //나이가 10살이하일때 1000원 할일
    public static void main(String[] args) {
        int price = 10000;
        int old = 10;

        if(price >= 10000){
            price -= 1000;
        }
        if(old <= 10 ){
            price -= 1000;
        }

        System.out.println("가격 : " + price);
    }
}
