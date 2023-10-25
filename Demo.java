import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    // For
    for (int i = 1; i < 10; i += 2) {
      System.out.println(i);
    }

    System.out.println("Döngü Bitti.");

    // While
    int i = 1;
    while (i < 10) {
      System.out.println("i sayısı ondan küçüktür");
      break;
    }

  }
}

/*
 * 
 * char grade = 'f';
 * switch (grade) {
 * case 'A':
 * System.out.println("Mükemmel Geçtiniz");
 * break;
 * 
 * case 'B':
 * System.out.println("Çok güzel Geçtiniz");
 * break;
 * 
 * case 'C':
 * System.out.println("İyi Geçtiniz");
 * break;
 * 
 * case 'D':
 * System.out.println("Fena Değil Geçtiniz");
 * break;
 * 
 * case 'F':
 * System.out.println("Failed");
 * break;
 * 
 * default:
 * System.out.println("Geçersiz Not girdiniz");
 * 
 * break;
 * 
 * }
 */

// public static void main(String[] args) {
// int sayi1 = 20;
// int sayi2 = 25;
// int sayi3 = 33;
// int EnBuyuk = sayi1;
// if(EnBuyuk < sayi2){
// EnBuyuk = sayi2;
// }
// if(EnBuyuk < sayi3){
// EnBuyuk =sayi3;
// }
// System.out.println(EnBuyuk); }
