package basicJava;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();
        int sum =0;
        for (int i = 1; i < number; i++) {
            if (number % i ==0) {
                sum = sum + i;
            }
            if (number == sum) {
                System.out.println(" The given is Perfect Number ");
            } else {
                System.out.println("The given is not Perfect Number ");
            }
        }
    }
}
