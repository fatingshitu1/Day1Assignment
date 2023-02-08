package basicJava;

import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check the Number");
        int num = scanner.nextInt();
        int x = 5;
        if (num > x) {
            System.out.println("the num is greater than x");
        } else {
            System.out.println("x is greater than num");
        }

    }

}
