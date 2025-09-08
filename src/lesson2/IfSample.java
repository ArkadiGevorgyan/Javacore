package lesson2;

public class IfSample {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        //tue - chishte  false - sxale;
        if (x < y) {
            System.out.println("x pokre y");
        }

        x = x * 2;
        if (x == y)
            System.out.println("x havasre y");

        x = x * 2;
        if (x > y) {
            System.out.println("x arten mece y");
        }

        if (x == y) {
        }
    }
}