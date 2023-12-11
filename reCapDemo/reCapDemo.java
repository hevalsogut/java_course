package Demos;

public class reCapDemo {
  public static void main(String[] args) {
    double[] myList = { 1.2, 5.45, 0.1, 2.6 };
    double total = 0;
    double max = myList[0];
    for (double number : myList) {
      if (max < number) {
        max = number;
      }
      total = total + number;
      System.out.println(number);

    }
    System.out.println("Sum of the numbers : " + total);
    System.out.println("The biggest number is : " + max);
  }
}
