import java.util.Scanner;
public class NthOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        int nthOddNumber = calculateNthOddNumber(n);
        int nthOddAfterNthOdd = calculateNthOddAfterNthOdd(nthOddNumber, n);
        System.out.println("The " + n + "th odd number is: " + nthOddNumber);
        System.out.println("The " + n + "th odd number after the " + n + "th odd number is: " + nthOddAfterNthOdd);
        scanner.close();
    }
    public static int calculateNthOddNumber(int n) {
        return 2 * n - 1;
    }
    public static int calculateNthOddAfterNthOdd(int nthOddNumber, int n) {
        return nthOddNumber + 2 * n;
    }
}