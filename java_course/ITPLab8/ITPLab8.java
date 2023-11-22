package ITPLab8;

import java.util.Scanner;

public class ITPLab8 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    int sum = 0;
    while (number > 0) {
      sum += number % 10;
      number /= 10;
    }
    System.out.println("Sum of digits of your number is : " + sum);
    /* Q2 */
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    System.out.println("Number n :" + num);

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        System.out.print(((int) (Math.random() * 2)) + " ");
      }
      System.out.println();
    }
  }
}
