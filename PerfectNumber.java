import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int number = scanner.nextInt();
        if (isPerfectNumber(number)) {
            System.out.println("It’s a Perfect Number");
        } else {
            System.out.println("It’s not a Perfect Number");
        }
        scanner.close();
    }
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
