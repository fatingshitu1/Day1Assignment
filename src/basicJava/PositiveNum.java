package basicJava;

import java.util.Scanner;

public class PositiveNum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the Number");
        int num= scanner.nextInt();
        if (num>0){
            System.out.println("The given number is positive");
        } else if (num<0) {
            System.out.println("The given number is negative");

        }else {
            System.out.println("the given number is zero or invalid");
        }
    }

}