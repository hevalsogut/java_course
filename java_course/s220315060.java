/*
*
* Author: Heval Söğüt 
* Student ID: S220315060 
*
*/

package java_course;

import java.util.Scanner;

public class s220315060 {
  public static void main(String[] args) {

    /* Q1 BMI Calculator */

    final double pound = 0.45359237;
    final double inch = 0.0254;
    Scanner weightPound = new Scanner(System.in);
    System.out.print("Enter your weight in pounds :");
    Double weight = weightPound.nextDouble();
    System.out.println(weight);

    Scanner heightInch = new Scanner(System.in);
    System.out.print("Enter your height in inches :");
    Double height = heightInch.nextDouble();
    System.out.println(height);

    double weightKG = (double) (weight * pound);
    double heightMeter = (double) (height * inch);

    double BMI = (int) (weightKG / Math.pow(heightMeter, 2));
    System.out.println("Your BMI is: " + BMI);

    if (BMI < 18.5)
      System.out.println("Underweight");
    else if ((18.5 <= BMI) && (BMI < 25.0))
      System.out.println("Normal");
    else if ((25.0 <= BMI) && (BMI < 30.0))
      System.out.println("Overweight");
    else
      System.out.println("Obese");

    /* Q2 Basic Calculator */
    Scanner input = new Scanner(System.in);
    System.out.print("Choose operation: \n"
        + "1 for addition \n"
        + "2 for substruction \n"
        + "3 for multiplication \n"
        + "4 for dividing \n");
    int operation = input.nextInt();
    System.out.println(operation);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers :");
    double firstNum = sc.nextDouble();
    double secondNum = sc.nextDouble();

    switch (operation) {
      case 1:
        System.out.println(firstNum + secondNum);
        break;
      case 2:
        System.out.println(firstNum - secondNum);
        break;
      case 3:
        System.out.println(firstNum * secondNum);
        break;
      case 4:
        System.out.println(firstNum / secondNum);
        break;

    }

  }

}