import java.util.ArrayList;
import java.util.Scanner;


public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("----- 2 - Prime Numbers -----");
        do {
            System.out.print("Please enter a number N > 1: ");
            while (!input.hasNextInt()) {
                System.out.println("That's not a number!");
                input.next();
            }
            number = input.nextInt();
        } while (number <= 1);
        ArrayList<Integer> primeArray = recursivePrime(number);
        System.out.print("p(" + number + ") = ");
        System.out.println(primeArray);
    }

    // Function that gets all prime numbers in a specific range using iteration
    public static ArrayList<Integer> linearPrime(int number) {
        ArrayList<Integer> primeArray = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (testPrime(i)) {
                primeArray.add(i);
            }
        }
        return primeArray;
    }

    // Function that gets all prime numbers in a specific range using recursion
    public static ArrayList<Integer> recursivePrime(int number) {
        ArrayList<Integer> primeArray = new ArrayList<>();
        findPrimeArray(number, 2, primeArray);
        return primeArray;
    }

    // This function helps recursivePrime with the recursion part
    private static void findPrimeArray(int number, int i, ArrayList<Integer> primeArray) {
        if (i < number) {
            if (testPrime(i)) {
                primeArray.add(i);
            }
            findPrimeArray(number, i + 1, primeArray);
        }
    }

    // Function to test if a number is prime
    public static boolean testPrime(int integer) {
        for (int i = 2; i <= Math.sqrt(integer); i++) {
            if (integer % i == 0) {
                return false;
            }
        }
        return true;
    }
}
