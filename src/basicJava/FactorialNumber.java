package basicJava;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        System.out.println("Factors of the enter num are =>");
        for (int i=1; i<= num; i++){
            // Finding the factors of given num
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
}
