import java.util.Scanner;
public class MultiplicationTable {
    public static void printMultiplicationTable(int M, int N) {
        if (N == 0) {
            System.out.println("0x" + M + "=0");
        } else if (N > 0) {
            for (int i = 1; i <= N; i++) {
                System.out.println(i + "x" + M + "=" + (i * M));
            }
        } else {
            for (int i = -1; i >= N; i--) {
                System.out.println(i + "x" + M + "=" + (i * M));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of M: ");
        int M = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        printMultiplicationTable(M, N);
    }
}