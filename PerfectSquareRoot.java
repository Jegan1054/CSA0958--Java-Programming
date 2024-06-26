import java.util.Scanner;
public class PerfectSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if (isPerfectSquare(number)) {
            double sqrt = Math.sqrt(number);
            System.out.println("The positive square root of " + number + " is: " + sqrt);
            System.out.println("The negative square root of " + number + " is: " + -sqrt);
        } else {
            System.out.println(number + " is not a perfect square.");
        }
        scanner.close();
    }
    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}