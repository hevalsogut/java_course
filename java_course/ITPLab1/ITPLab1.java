package ITPLab1;

public class ITPLab1 {
  public static void main(String[] args) {
    // Q1
    System.out.print("it's my first project");
    System.out.println("hello world");
    // hello world is a string because of that it should be writen between two
    // quotation marks
    System.out.println("I love Java");
    // There was a syntax error at the end of line

    // Q2
    int i = 0;
    while (i < 5) {
      System.out.println("I love Java");
      i = i + 1;
    }

    // Q3
    int x = 16;
    System.out.println(x * 5);
    System.out.println(x / 2);
    System.out.println(Math.pow(x, 2));
    System.out.println(Math.pow(x, 3));

    // Q4
    int r = 5;
    System.out.println("Area = " + (Math.PI * Math.pow(r, 2)));

  }
}
