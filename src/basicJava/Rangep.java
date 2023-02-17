package basicJava;

import java.util.Scanner;

public class Rangep {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num = scanner.nextInt();
        int count = 0;
        for (int num = 2; num < 10; num++) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                } else {
                    count = 0;
                }
            }
            if (count == 0) {
                System.out.println("The " + num + " number is prime");

            }
        }
    }
}

