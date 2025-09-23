package lesson1;

public class Example1 {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x y pokre y");
            x = x * 2;
            if (x == y) {
                System.out.println("hmi xy = y");
            }
        }
    }

}