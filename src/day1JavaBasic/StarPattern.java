package day1JavaBasic;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Limit of Pattern=>");
        //int
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int m= 4; m<= 5; m--)
        {
            for (int n= 1; n <=m; n++) System.out.print(n);
            System.out.println();
        }
    }
}