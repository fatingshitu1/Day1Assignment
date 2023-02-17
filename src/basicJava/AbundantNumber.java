package basicJava;

public class AbundantNumber {
    public static void main(String[] args) {
        int number = 18;
        int sum = 1 + 2 + 6 + 9;
        for (int i = 0; i <= number; i++) {
            if (number > sum) {
                System.out.println("The given number is Abundant Number");
            } else {
                System.out.println("The given number is not Abundant Number");
            }
        }
    }
}

