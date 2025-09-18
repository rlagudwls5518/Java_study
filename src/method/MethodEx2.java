package method;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello, world!";
        print("Hello, world!",3);
        print("Hello, world!",5);
        print("Hello, world!",7);

    }

    public static void print(String message, int time){

        for (int i = 0; i < time; i++) {
            System.out.println(message);
        }
        for (int i = 0; i < time; i++) {
            System.out.println(message);
        }
        for (int i = 0; i < time; i++) {
            System.out.println(message);
        }

    }
}
