package day1JavaBasic;

import java.util.Scanner;

public class Pattern123{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Limit of Pattern=>");
        int y= scanner.nextInt();

        for (int i=1;i<=y;i++){

            for (int j=1;j<=i; j++){
                System.out.print(j);
            }
            {System.out.println();
        }

    }
}


}
