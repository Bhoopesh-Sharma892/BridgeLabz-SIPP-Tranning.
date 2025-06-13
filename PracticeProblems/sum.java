// 2. Add Two Numbers
// Write a program that takes two numbers as input from the user and prints their sum.
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double sum = a + b;
        System.out.println("Sum is: " + sum);
    }
}
