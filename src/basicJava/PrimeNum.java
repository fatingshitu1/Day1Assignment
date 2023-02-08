package basicJava;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        if (num % 1 == 0) {
            System.out.println("The given number is prime");
        } else {
            System.out.println("The given number is not prime");
        }
        // if count of divisors greater than 2 then it not prime
        if (num > 2)
            System.out.println("The given is number is not prime");

        else {
            System.out.println("The given is number is prime");
        }
    }
}

