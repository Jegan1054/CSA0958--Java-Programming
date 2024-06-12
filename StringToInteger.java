import java.util.Scanner;
public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to integer: ");
        String inputString = scanner.nextLine();
        try {
            int convertedInteger = Integer.parseInt(inputString);
            System.out.println("Output Integer: " + convertedInteger);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer string.");
        }   
        scanner.close();
    }
}
