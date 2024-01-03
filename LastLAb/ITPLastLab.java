package demo;

import java.util.Scanner;

public class demo {
  public static void main(String[] args) {
    System.out.println(factorial(6));
    System.out.println(isAnagram("race", "care"));
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  public static String isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return "Not anagrams";
    } else {
      char[] s1Array = s1.toCharArray();
      char[] s2Array = s2.toCharArray();
      java.util.Arrays.sort(s1Array);
      java.util.Arrays.sort(s2Array);
      for (int i = 0; i < s1Array.length; i++) {
        if (s1Array[i] != s2Array[i]) {
          return "Not anagrams";
        }
      }
      return "Anagrams";
    }

  }
}
