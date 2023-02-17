package basicJava;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }else {
                count = 0;
            }
        }
        if (count == 0) {
            System.out.println("The given number is prime");
        } else {
            System.out.println("The given number is not prime");
        }
    }
}



