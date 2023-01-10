package basicJava;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int x=4;
        for(int i=2;i<x;i++){
            System.out.println("The given num is prime");
        }
    }
}
