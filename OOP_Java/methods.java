package OOP_Java;

import java.util.Random;

public class methods {
  public static void main(String[] args) {
    int result1 = addNumbers(5, 8);
    double result2 = addNumbers(5.7, 8.1);
    int result3 = addNumbers(5, 8, 10);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    addNumbers();
  }

  public static int addNumbers(int a, int b) {
    return a + b;
  }

  public static double addNumbers(double a, double b) {
    return a + b;
  }

  public static int addNumbers(int a, int b, int c) {
    return a + b + c;
  }

  public static void addNumbers() {
    Random r = new Random();
    System.out.println(r.nextInt(6) + r.nextInt(6));
  }
}
