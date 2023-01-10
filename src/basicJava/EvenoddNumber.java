package basicJava;

import java.util.Scanner;

public class EvenoddNumber {
    public static final int INT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number =>");
        int num =scanner.nextInt();
        if (num % 2 ==0){
            System.out.println("The given number is Even");
        } else {
            System.out.println("The given number is odd");

        }

    }
    }

