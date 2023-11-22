package ITPLab5;

import java.util.Random;
import java.util.Scanner;

public class ITPLab5 {
  public static void main(String[] args) {

    Double randNum = (Math.random() / 2);
    System.out.println("Welcome to my Prediction game");
    Scanner input = new Scanner(System.in);
    System.out.print("Please select a day and enter the first letter :");
    char firstLetter = input.next().toUpperCase().charAt(0);

    String predictedDay = "";

    switch (firstLetter) {
      case 'M':
        predictedDay = "Monday";
        System.out.println("You are lucky");
        break;
      case 'F':
        predictedDay = "Friday";
        System.out.println("You are lucky");
        break;
      case 'W':
        predictedDay = "Wednesday";
        System.out.println("You are lucky");
        break;
      case 'T':
        if (randNum < 0.5) {
          predictedDay = "Thursday";
        } else {
          predictedDay = "Tuesday";
        }
        break;
      case 'S':
        if (randNum < 0.5) {
          predictedDay = "Sunday";
        } else {
          predictedDay = "Saturday";
        }
      default:
        System.out.println("Invalid case");

    }
    System.out.println(predictedDay);

    System.out.print("Enter your day :");
    String userDay = input.next();

    if (userDay.equalsIgnoreCase(predictedDay)) {
      System.out.println("I won");
    } else {
      System.out.println("Try again");
    }

  }

}