package ITPLab9;

import java.util.Scanner;

public class ItpLab9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many times name :");
    int a = sc.nextInt();
    System.out.print("How many times surname  :");
    int b = sc.nextInt();

    namePrinter(a, b);
    selectMax(25, 30, 40);
    selectMax("HEval", "Heeevvvaaalll");
  }

  public static void namePrinter(int n1, int n2) {
    for (int i = 0; i < n1; i++) {
      System.out.println("Heval");
    }
    for (int i = 0; i < n2; i++) {
      System.out.println("Söğüt");
    }
  }

  public static int selectMax(int n1, int n2, int n3) {
    int max;
    if (n1 > n2) {
      max = n1;

    } else
      max = n2;
    if (max < n3) {
      max = n3;
    }
    System.out.println(max);
    return max;

  }

  public static String selectMax(String s1, String s2) {
    String max;
    if (s1.length() > s2.length()) {
      max = s1;
    } else
      max = s2;
    System.out.println(max);
    return max;

  }
}
