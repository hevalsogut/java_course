import java.util.Scanner;

public class ITPLab2 {
    public static void main(String[] args) {
        final double pound = 0.45359237;
        final double inch = 0.0254;

        Scanner weightPound = new Scanner(System.in);
        System.out.print("Enter your weight in pounds :");
        float weight = weightPound.nextFloat();
        System.out.println(weight);

        Scanner heightİnch = new Scanner(System.in);
        System.out.print("Enter your height in inches :");
        float height = heightİnch.nextFloat();
        System.out.println(height);

        double weightKG = (double) (weight * pound);
        double heightMeter = (double) (height * inch);

        int bmi = (int) (weightKG / Math.pow(heightMeter, 2));
        System.out.println("Your BMI is: " + bmi);

    }

}
