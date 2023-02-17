package basicJava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int temp = num;
        int temp2 = num;
        int rem;
        int armstrongNum = 0;
        int count = 0;
        while (num != 0){
            num = num/10;
            count++;
        }
        while (temp2!=0){
            rem = num%10;
            num = num/10;
             armstrongNum += Math.pow(rem,count);
            System.out.println(armstrongNum);
        }
        if (temp== armstrongNum) {
            System.out.println("Enter number is Armstrong Number");
        } else {
            System.out.println("Enter number is not Armstrong Number");
        }
    }
}


