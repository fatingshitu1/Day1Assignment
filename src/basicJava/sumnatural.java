package basicJava;

import java.util.Scanner;

public class sumnatural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;

        }
        System.out.println(sum);
    }
}
