package basicJava;

import java.util.Scanner;

public class SumOfDigitNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int a =0;
        int b = number;
        int sum =0;
        for (int i =0; i <=number;i++){
            if (number==0){
                System.out.println("Strong Number");
            }else {
                System.out.println("Not a Strong Number");
            }
        }
    }
}
