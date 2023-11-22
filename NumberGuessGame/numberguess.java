package NumberGuessGame;

import java.util.Scanner;

public class numberguess {
  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Welcome to the Number Guess Game!");

    Scanner input = new Scanner(System.in);
    System.out.print("Guess a number between 1 and 50 : ");
    int guess = input.nextInt();
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
