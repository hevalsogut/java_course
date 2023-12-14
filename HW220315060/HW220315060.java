
/*  HEVAL SÖĞÜT  */
/*  220315060    */

package HW220315060;

import java.util.Scanner;

public class HW220315060 {
  static final String USERNAME = "user";
  static final String PASSWORD = "1234";
  static double accountBalance = 0;

  /* Main Method */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("USERNAME: ");
      String username = sc.nextLine();
      System.out.print("PASSWORD: ");
      String password = sc.nextLine();
      if (authenticateUser(username, password))
        break;
    }

    while (true) {
      printMenu();
      int choice = sc.nextInt();
      if (!(choice < 5 && choice > 0)) {
        System.out.println("İnvalid choice");

      } else {
        switch (choice) {
          case 1:
            depositMoney();
            break;
          case 2:
            withDraw();
            break;
          case 3:
            checkBalance();
            break;
          case 4:
            System.exit(0);
            break;
        }
      }

    }
  }

  /* The authentication page for user */

  public static boolean authenticateUser(String username, String password) {

    if (username.equals(USERNAME) && password.equals(PASSWORD)) {
      System.out.println("Login Succesfull");
      return true;
    } else {
      System.out.println("Invalid username or password. Please try again.");
      return false;
    }
  }

  public static void printMenu() {
    System.out.println("\n---- Bank Application ----");
    System.out.println("1. Deposit Money");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Check Money Balance");
    System.out.println("4. Exit");
    System.out.print("Your choice: ");
  }

  public static void depositMoney() {
    System.out.print("Enter the amount to deposit: ");
    Scanner sc = new Scanner(System.in);
    int deposit = sc.nextInt();
    accountBalance = accountBalance + deposit;
    System.out.println("Deposit successful. New balance: " + accountBalance);

  }

  public static void withDraw() {
    System.out.print("Enter the amount to withdraw: ");
    Scanner sc = new Scanner(System.in);
    int withdraw = sc.nextInt();

    if (accountBalance < withdraw) {
      System.out.println("Insufficent balance. The withdrawal amount cannot exceed the account balance.");
    } else {
      accountBalance = accountBalance - withdraw;
      System.out.println("Withdraw successful. New balance: " + accountBalance);
    }
  }

  public static void checkBalance() {
    System.out.println("Account Balance: " + accountBalance);
  }

}
