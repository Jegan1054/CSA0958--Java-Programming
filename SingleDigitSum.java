import java.util.Scanner;
public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int singleDigitSum = calculateSingleDigitSum(number);
        System.out.println("The single digit sum of the number is: " + singleDigitSum);

        scanner.close();
    }
    public static int calculateSingleDigitSum(int number) {
        while (number >= 10) {
            number = sumOfDigits(number);
        }
        return number;
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}