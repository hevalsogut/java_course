/*
 * 
 * Author: Heval Söğüt
 * Student ID: S220315060
 * 
 * 
 */
package String;

public class String {
  public static void main(String[] args) {

    String s1 = "123";
    String s2 = "abc";

    System.out.println("Before swap: a = " + s1 + " and b = " + s2);

    s1 = s1 + s2;

    s2 = s1.substring(0, s1.length() - s2.length());

    s1 = s1.substring(s2.length());

    System.out.println("After swap: a = " + s1 + " and b = " + s2);
  }

}
