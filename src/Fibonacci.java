import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("----- 1 - Fibonacci -----");
        do {
            System.out.print("Please enter a number N >= 0: ");
            while (!input.hasNextInt()) {
                System.out.println("That's not a number!");
                input.next();
            }
            number = input.nextInt();
        } while (number < 0);
        System.out.println("fib(" + number + ") = " + linearFibonacci(number));
    }

    // Function to calculate Fibonacci using iteration
    public static int linearFibonacci(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= number; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    // Function to calculate Fibonacci using recursion
    public static int recursiveFibonacci(int number) {
        if (number < 2) {
            return number;
        } else {
            return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
        }
    }
}