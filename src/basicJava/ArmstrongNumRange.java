package basicJava;

import java.util.Scanner;

public class ArmstrongNumRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int rem;
        int arm = 0;
        int temp = 0;
        num = temp;
        while (num > 0) {
            rem = num % 10;
            arm = (rem * rem * rem) + arm;
        }
        if (num == temp) {
            System.out.println("Enter number is Armstrong Number");
        } else {
            System.out.println("Enter number is not Armstrong Number");
        }
    }
}

