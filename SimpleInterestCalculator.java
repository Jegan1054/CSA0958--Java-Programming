import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();
        System.out.println("Enter the time period in years:");
        int time = scanner.nextInt();
        System.out.println("Are you a senior citizen? (true/false):");
        boolean isSeniorCitizen = scanner.nextBoolean();
        double interest = calculateSimpleInterest(principal, time, isSeniorCitizen);
        System.out.println("The simple interest is: " + interest);

        scanner.close();
    }
    public static double calculateSimpleInterest(double principal, int time, boolean isSeniorCitizen) {
        double rateOfInterest = isSeniorCitizen ? 12.0 : 10.0;
        return (principal * time * rateOfInterest) / 100;
    }
}
