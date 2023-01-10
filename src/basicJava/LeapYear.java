package basicJava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int num = scanner.nextInt();
        if (num%4==0){
            System.out.println("the year is leap");
        }else {
            System.out.println("the year is not leap");
        }
    }
}
