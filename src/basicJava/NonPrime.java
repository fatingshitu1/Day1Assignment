package basicJava;

public class NonPrime {
    public class NonPrimeNumber {
        public static void primeNumber() {
            int[] tempArray = new int[74];
            int count = 0;
            int sum = 0;
            int index = 0;
            for (int i = 2; i <= 100; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    } else {
                        count = 0;
                    }
                }
                if (count == 0) {
                    System.out.println("Prime number is " + i);

                } else {
                    tempArray[index] = i;
                    index++;
                }
            }
            for (int k = 0; k < tempArray.length; k++) {
                System.out.print(tempArray[k] + " ");
                sum += tempArray[k];
            }
            System.out.println();
            System.out.println("summation of Non Prime Number: " + sum);
        }
        public static void main(String[] args) {
            System.out.println("Welcome to Non-Prime Number and Summation of Non-Prime Number");
            primeNumber();
        }
    }
}
