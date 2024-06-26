import java.util.Scanner;
public class NumberOfFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given number: ");
        int number = scanner.nextInt();
        int numberOfFactors = countFactors(number);
        System.out.println("Number of factors = " + numberOfFactors);

        scanner.close();
    }
    public static int countFactors(int number) {
        if (number <= 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number / i == i) {
                    count++;
                } else {
                    count += 2; // Otherwise, count both the divisor and its pair
                }
            }
        }
        return count;
    }
}
