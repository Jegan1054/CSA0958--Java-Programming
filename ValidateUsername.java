import java.util.Scanner;
public class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username to validate: ");
        String username = scanner.nextLine();
        boolean isValid = true;
           if (username.length() < 5 || username.length() > 15) {
            isValid = false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            System.out.println("The username is valid.");
        } else {
            System.out.println("The username is not valid.");
        }
        scanner.close();
    }
}
