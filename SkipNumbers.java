import java.util.Scanner;
public class SkipNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number M:");
        int m = scanner.nextInt();
        System.out.println("Enter the ending number N:");
        int n = scanner.nextInt();
        System.out.println("Enter the number of numbers to skip K:");
        int k = scanner.nextInt();
        System.out.println("The numbers from " + m + " to " + n + " skipping " + k + " numbers are:");
        for (int i = m; i <= n; i += (k + 1)) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
