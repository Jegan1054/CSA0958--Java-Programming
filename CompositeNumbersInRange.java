import java.util.Scanner;
public class CompositeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int A = scanner.nextInt();
        System.out.print("Enter the value of B: ");
        int B = scanner.nextInt();
        System.out.println("Composite numbers between " + A + " and " + B + " are:");
        printCompositeNumbers(A, B);
        scanner.close();
    }
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
    public static void printCompositeNumbers(int A, int B) {
        boolean found = false;
        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                if (found) {
                    System.out.print(", ");
                }
                System.out.print(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No composite numbers found.");
        }
        System.out.println();
    }
}