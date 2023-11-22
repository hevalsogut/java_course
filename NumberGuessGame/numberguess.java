package NumberGuessGame;

import java.util.Scanner;

public class numberguess {
  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Welcome to the 2 Player Number Guessing Game!");
    Scanner input = new Scanner(System.in);
    System.out.print("Player 1, please enter your name : ");
    String player1 = input.nextLine();
    System.out.print("Player 2, please enter your name : ");
    String player2 = input.nextLine();
    System.out.println("Have fun " + player1 + " and " + player2 + "!");
    int number1 = 0;
    int number2 = 0;

    int random = (int) (Math.random() * 50 + 1);

    while (number1 != random && number2 != random) {
      System.out.print(player1 + ", please enter a number between 1 and 50 : ");
      number1 = input.nextInt();
      System.out.print(player2 + ", please enter a number between 1 and 50 : ");
      number2 = input.nextInt();
      if (number1 > random) {
        System.out.println("Your number is high!" + player1);
      } else if (number1 < random) {
        System.out.println("Your number is low!" + player1);
      } else {
        System.out.println("Congratulations " + player1 + "! You guessed the number!");
      }
      if (number2 > random) {
        System.out.println("Your number is too high!" + player2);
      } else if (number2 < random) {
        System.out.println("Your number is too low!" + player2);
      } else
        System.out.println("Congratulations " + player2 + "! You guessed the number!");
      break;
    }
  }
}
