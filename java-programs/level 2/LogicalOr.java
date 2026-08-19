import java.util.Scanner;

public class LogicalOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter marks: ");
        float marks = sc.nextFloat();

        System.out.println(age >= 18 || marks >= 50);
    }
}