import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        final int VOTING_AGE = 18;
        if (age >= VOTING_AGE) {
            System.out.println("You are eligible to vote.");
        } else {
            int yearsLeft = VOTING_AGE - age;
            System.out.println("You are not eligible to vote. You have " + yearsLeft + " years left to be eligible.");
        }
        scanner.close();
    }
}
