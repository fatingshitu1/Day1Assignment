package basicJava;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = 123;
        while (num > 0) {
            int r = num % 10;
            System.out.print(r);
            num = num / 10;
        }
    }
}

