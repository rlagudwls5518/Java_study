package array;

public class ArrayEx1 {

    public static void main(String[] args) {
        int []student = {90, 80, 70, 60, 50};
        int total =0;
//        student[0] = 90;
//        student[1] = 80;
//        student[2] = 70;
//        student[3] = 60;
//        student[4] = 50;

        for(int i : student){
            total +=i;
        }
        double average = total / student.length;
        System.out.println(total);
        System.out.println(average);
    }
}
