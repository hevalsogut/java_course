import java.util.Scanner;

public class InterestRate {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for monthly income
    System.out.print("Enter your monthly income: ");
    double income = scanner.nextDouble();

    // Prompt the user for the number of months
    System.out.print("Enter the number of months: ");
    int months = scanner.nextInt();

    // Close the scanner
    scanner.close();

    // Annual interest rate (0.1 represents 10%)
    double annualInterestRate = 0.1;

    // Calculate monthly savings
    double monthlySavings = income;

    // Calculate total savings after 'months' months with monthly compounded
    // interest
    double totalSavings = 0.0;
    for (int i = 0; i < months; i++) {
      totalSavings += monthlySavings;
      totalSavings *= (1.0 + annualInterestRate / 12); // Compounded monthly
    }

    System.out.printf("Total savings after %d months: %.2f%n", months, totalSavings);
  }
}

/*
 * double interestRate;
 * double total;
 * int month;
 * double totalSavings;
 * double income;
 * interestRate = 0.1;
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("The month that you would like to calculate the saving :");
 * month = sc.nextInt();
 * System.out.print("Insert your monthly income :");
 * income = sc.nextInt();
 * 
 * total = (month * income + (interestRate * (month * income)));
 * totalSavings = total + income * interestRate;
 * 
 * System.out.println(total);
 */
