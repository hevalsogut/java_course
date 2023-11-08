package java_course;

import java.util.Scanner;

public class ITPLab3 {
  public static void main(String[] args) {
    double total = 0;
    try (Scanner amountIncome = new Scanner(System.in)) {
      System.out.print("Enter your income: ");
      double income = amountIncome.nextDouble();

      for (int i = 0; i < 6; i++) {
        total += income;
        total *= 1.1;
        System.out.println("Account balance :" + total);
      }
    }
  }
}

/*
 * total = (income + total) * 1.1;
 * System.out.println(total);
 * total = (income + total) * 1.1;
 * System.out.println(total);
 * total = (income + total) * 1.1;
 * System.out.println(total);
 * total = (income + total) * 1.1;
 * System.out.println(total);
 * total = (income + total) * 1.1;
 * System.out.println(total);
 * total = (income + total) * 1.1;
 * System.out.println(total);
 */

/*
 * double total = 0;
 * Scanner amountIncome = new Scanner(System.in);
 * System.out.print("Enter your income: ");
 * double income = amountIncome.nextDouble();
 * 
 * for (int i = 0; i < 6; i++) {
 * total += income;
 * total *= 1.1;
 * System.out.println("Account balance :" + total);
 */