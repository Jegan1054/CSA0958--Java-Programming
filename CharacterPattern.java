import java.util.Scanner;
public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Character to be printed: ");
        char character = scanner.next().charAt(0);
        System.out.print("Max Number of times printed: ");
        int maxNumber = scanner.nextInt();
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
