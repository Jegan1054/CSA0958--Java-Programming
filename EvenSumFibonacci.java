import java.util.Scanner;
public class EvenSumFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum number N:");
        int maxNumber = scanner.nextInt();
        int evenSum = calculateEvenFibonacciSum(maxNumber);
        System.out.println("The sum of even Fibonacci numbers up to " + maxNumber + " is: " + evenSum);
        scanner.close();
    }
    public static int calculateEvenFibonacciSum(int maxNumber) {
        if (maxNumber <= 0) {
            return 0;
        }
        int firstTerm = 0;
        int secondTerm = 1;
        int evenSum = 0;
        while (firstTerm <= maxNumber) {
            if (firstTerm % 2 == 0) {
                evenSum += firstTerm;
            }
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return evenSum;
    }
}
