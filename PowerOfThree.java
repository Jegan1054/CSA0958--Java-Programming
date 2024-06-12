import java.util.Scanner;
public class PowerOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        boolean isPowerOfThree = isPowerOfThree(number);
        if (isPowerOfThree) {
            System.out.println(number + " is a power of three.");
        } else {
            System.out.println(number + " is not a power of three.");
        }
        scanner.close();
    }
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}