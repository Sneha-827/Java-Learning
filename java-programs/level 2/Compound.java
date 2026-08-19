public class Compound {
    public static void main(String[] args) {

        int number = 10;

        number += 5;
        System.out.println("After += : " + number);

        number -= 3;
        System.out.println("After -= : " + number);

        number *= 2;
        System.out.println("After *= : " + number);

        number /= 4;
        System.out.println("After /= : " + number);

        number %= 3;
        System.out.println("After %= : " + number);
    }
}