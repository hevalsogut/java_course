package ITPLab8;

import java.util.Scanner;

public class ITPLab8 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    /*-- Q1 --*/
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    int sum = 0;
    while (number > 0) {
      sum += number % 10;
      number /= 10;
    }
    System.out.println("Sum of digits of your number is : " + sum);

    /*-- Q2 --*/
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    System.out.println("Number n :" + num);

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        System.out.print(((int) (Math.random() * 2)) + " ");
      }
      System.out.println();
    }

    /*-- Q3 --*/
    System.out.println("Welcome to the Number Guess Game!");

    Scanner sc = new Scanner(System.in);
    System.out.print("Guess a number between 1 and 50 : ");
    int guess = sc.nextInt();
    System.out.println(guess);

    int randomNum = (int) (Math.random() * 50 + 1);

    if (guess > randomNum) {
      System.out.println("Your guess is higher than the number, try again!");
    } else if (guess < randomNum) {
      System.out.println("Your guess is lower than the number, try again!");
    } else {
      System.out.println("Congrats... Winner Winner Chicken Dinner!");
    }
    System.out.println("The number was :" + randomNum);
  }
}
