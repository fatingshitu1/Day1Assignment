package basicJava;

import java.util.Scanner;

public class PrimeNumGivenRange {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 to 10 are : ");
        for (int i = 0; i <= 10; i++) {
            int j = 1, count = 0;
            while (j <= i / 2) {
                if (i % j == 0) {
                    count++;
                    if (count == 2) {
                        break;
                    }
                }
                j++;
            }
            if (count == 1) {
                System.out.print(i + " ");
            }
        }
    }
}





