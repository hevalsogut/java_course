package ITPLab2;

import java.util.Scanner;

public class ITPLab2 {
    public static void main(String[] args) {
        final double pound = 0.45359237;
        final double inch = 0.0254;

        Scanner weightPound = new Scanner(System.in);
        System.out.print("Enter your weight in pounds :");
        Double weight = weightPound.nextDouble();
        weightPound.close();
        System.out.println(weight);

        Scanner heightInch = new Scanner(System.in);
        System.out.print("Enter your height in inches :");
        Double height = heightInch.nextDouble();
        heightInch.close();
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
            System.out.println("Normal");
        else
            System.out.println("Obese");

    }

}
