import java.util.Scanner;

public class ITPLab4 {
  public static void main(String[] args) {
    // If ve else sadece alt satırı kapsar pythonun tam tersi. Sınır belirlemek için
    // "Küme Parantezi {} " kullanılır.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number:");
    Integer userNumber = sc.nextInt();
    System.out.println(userNumber);

    int randomNumber = (int) (Math.random() * 41 + 10);
    System.out.println(randomNumber);

    int diff = Math.abs(randomNumber - userNumber);

    if (diff == 0)
      System.out.println("10 points");
    else if (diff <= 10)
      System.out.println("5 points");
    else if (diff <= 20)
      System.out.println("3 points");
    else
      System.out.println("0 points");

  }

}
