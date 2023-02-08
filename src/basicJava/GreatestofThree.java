package basicJava;

import java.util.Scanner;

public class GreatestofThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check the Number");
        int num = scanner.nextInt();
        int x = 5;
        int y = 10;
        if (num > x) {
            if (num > y) {
                System.out.println("the num is greater than x and y");
            } else {
                System.out.println("y is greater than num and x");
            }
        } else {
            if (x > y) {
                System.out.println("the x is greater than num and y");
            } else {
                System.out.println("y is greater than num and x");
            }
        }
    }
}
